package br.senai.example.doctor_registration.services;

import br.senai.example.doctor_registration.dto.DoctorGetRequest;
import br.senai.example.doctor_registration.dto.DoctorRequest;
import br.senai.example.doctor_registration.dto.DoctorResponse;
import br.senai.example.doctor_registration.dto.DoctorSummaryResponse;
import br.senai.example.doctor_registration.entities.DoctorEntity;
import br.senai.example.doctor_registration.enums.EspecialidadeEnum;
import br.senai.example.doctor_registration.repositories.DoctorRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

import static br.senai.example.doctor_registration.mappers.DoctorMapper.map;
import static br.senai.example.doctor_registration.mappers.DoctorMapper.mapSummary;

@Service
public class DoctorService {

    private final DoctorRepository repository;

    public DoctorService(DoctorRepository repository) {
        this.repository = repository;
    }

    public void cadastrar(DoctorRequest request) {
        if (repository.existsByCrm(request.getCrm())) {
            throw new DuplicateKeyException("Já existe uma pessoa médica com este número de CRM.");
        }
        repository.save(map(request));
    }


    public void atualizar(Long id, DoctorRequest request) {
        DoctorEntity doctor = repository
                .findById(id)
                .orElseThrow(EntityNotFoundException::new);

        doctor.setNome(request.getNome());
        doctor.setCrm(request.getCrm());
        doctor.setDataNascimento(request.getDataNascimento());
        doctor.setTelefone(request.getTelefone());
        doctor.setEspecialidade(request.getEspecialidade());

        repository.save(doctor);
    }

    public Page<DoctorSummaryResponse> listar(DoctorGetRequest filtros, Pageable paginacao) {

        String filtroNome = filtros.getNome() != null ? filtros.getNome() : "";
        EspecialidadeEnum filtroEspecialidade = filtros.getEspecialidade();
        LocalDate filtroDataNascimento = filtros.getDataNascimento();

        if (filtros.getDataNascimento() != null && filtros.getEspecialidade() != null) {
            return mapSummary(repository.findByNomeContainingIgnoreCaseAndEspecialidadeAndDataNascimento(
                    filtroNome, filtroEspecialidade, filtroDataNascimento, paginacao));
        } else if (filtros.getEspecialidade() != null) {
            return mapSummary(repository.findByNomeContainingIgnoreCaseAndEspecialidade(
                    filtroNome, filtroEspecialidade, paginacao));
        } else if (filtros.getDataNascimento() != null) {
            return mapSummary(repository.findByNomeContainingIgnoreCaseAndDataNascimento(
                    filtroNome, filtroDataNascimento, paginacao));
        } else {
            return mapSummary(repository.findByNomeContainingIgnoreCase(
                    filtroNome, paginacao));
        }

    }
}
