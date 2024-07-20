package br.senai.example.doctor_registration.mappers;

import br.senai.example.doctor_registration.dto.DoctorRequest;
import br.senai.example.doctor_registration.entities.DoctorEntity;

public class DoctorMapper {

    private DoctorMapper(){}

    public static DoctorEntity map(DoctorRequest source){
        if (source == null) return null;
        DoctorEntity target = new DoctorEntity();
        target.setNome(source.getNome());
        target.setCrm(source.getCrm());
        target.setDataNascimento(source.getDataNascimento());
        target.setTelefone(source.getTelefone());
        target.setEspecialidade(source.getEspecialidade());
        return target;
    }

}
