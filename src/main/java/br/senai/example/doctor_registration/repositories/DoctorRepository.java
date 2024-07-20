package br.senai.example.doctor_registration.repositories;

import br.senai.example.doctor_registration.entities.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> {

    boolean existsByCrm(String crm);

}
