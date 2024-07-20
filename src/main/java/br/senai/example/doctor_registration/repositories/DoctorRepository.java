package br.senai.example.doctor_registration.repositories;

import br.senai.example.doctor_registration.entities.DoctorEntity;
import br.senai.example.doctor_registration.enums.EspecialidadeEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> {

    boolean existsByCrm(String crm);

    Page<DoctorEntity> findByNomeContainingIgnoreCase(
            String nome, Pageable paginacao
    );

    Page<DoctorEntity> findByNomeContainingIgnoreCaseAndEspecialidade(
            String nome, EspecialidadeEnum especialidade, Pageable paginacao
    );

    Page<DoctorEntity> findByNomeContainingIgnoreCaseAndDataNascimento(
            String nome, LocalDate dataNascimento, Pageable paginacao
    );

    Page<DoctorEntity> findByNomeContainingIgnoreCaseAndEspecialidadeAndDataNascimento(
            String nome, EspecialidadeEnum especialidade, LocalDate dataNascimento, Pageable paginacao
    );

}
