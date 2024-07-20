package br.senai.example.doctor_registration.dto;

import br.senai.example.doctor_registration.enums.EspecialidadeEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDate;

public class DoctorSummaryResponse {

    private String nome;
    @JsonSerialize
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;
    private EspecialidadeEnum especialidade;

    public DoctorSummaryResponse(String nome, LocalDate dataNascimento, EspecialidadeEnum especialidade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.especialidade = especialidade;
    }

    public DoctorSummaryResponse() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public EspecialidadeEnum getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(EspecialidadeEnum especialidade) {
        this.especialidade = especialidade;
    }
}
