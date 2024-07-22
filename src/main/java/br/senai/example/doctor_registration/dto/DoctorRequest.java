package br.senai.example.doctor_registration.dto;

import br.senai.example.doctor_registration.enums.EspecialidadeEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class DoctorRequest {

    @NotBlank
    private String nome;

    @NotBlank
    private String crm;

    @JsonDeserialize
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;


    private String telefone;

    @NotNull
    private EspecialidadeEnum especialidade;

    public @NotBlank String getNome() {
        return nome;
    }

    public void setNome(@NotBlank String nome) {
        this.nome = nome;
    }

    public @NotBlank String getCrm() {
        return crm;
    }

    public void setCrm(@NotBlank String crm) {
        this.crm = crm;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public @NotNull EspecialidadeEnum getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(@NotNull EspecialidadeEnum especialidade) {
        this.especialidade = especialidade;
    }
}
