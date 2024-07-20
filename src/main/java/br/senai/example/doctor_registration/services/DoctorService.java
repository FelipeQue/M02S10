package br.senai.example.doctor_registration.services;

import br.senai.example.doctor_registration.dto.DoctorRequest;
import br.senai.example.doctor_registration.repositories.DoctorRepository;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import static br.senai.example.doctor_registration.mappers.DoctorMapper.map;

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


}
