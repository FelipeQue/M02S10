package br.senai.example.doctor_registration.entities;

import br.senai.example.doctor_registration.enums.EspecialidadeEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class DoctorEntity {

    @Id
    private Long id;

    private String nome;

    private String crm;

    private LocalDate dataNascimento;

    private String telefone;

    @Enumerated(value = EnumType.STRING)
    private EspecialidadeEnum especialidade;

}
