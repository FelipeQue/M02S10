package br.senai.example.doctor_registration.mappers;

import br.senai.example.doctor_registration.dto.DoctorRequest;
import br.senai.example.doctor_registration.dto.DoctorResponse;
import br.senai.example.doctor_registration.dto.DoctorSummaryResponse;
import br.senai.example.doctor_registration.entities.DoctorEntity;
import org.springframework.data.domain.Page;

public class DoctorMapper {

    private DoctorMapper() {
    }

    public static DoctorEntity map(DoctorRequest source) {
        if (source == null) return null;
        DoctorEntity target = new DoctorEntity();
        target.setNome(source.getNome());
        target.setCrm(source.getCrm());
        target.setDataNascimento(source.getDataNascimento());
        target.setTelefone(source.getTelefone());
        target.setEspecialidade(source.getEspecialidade());
        return target;
    }

    public static DoctorResponse map(DoctorEntity source) {
        if (source == null) return null;
        DoctorResponse target = new DoctorResponse();
        target.setId(source.getId());
        target.setNome(source.getNome());
        target.setCrm(source.getCrm());
        target.setDataNascimento(source.getDataNascimento());
        target.setTelefone(source.getTelefone());
        target.setEspecialidade(source.getEspecialidade());
        return target;
    }

    public static DoctorSummaryResponse mapSummary(DoctorEntity source){
        if (source == null) return null;
        DoctorSummaryResponse target = new DoctorSummaryResponse();
        target.setNome(source.getNome());
        target.setDataNascimento(source.getDataNascimento());
        target.setEspecialidade(source.getEspecialidade());
        return target;
    }

    public static Page<DoctorResponse> map(Page<DoctorEntity> source) {
        return source.map(doctor -> map(doctor));

    }

    public static Page<DoctorSummaryResponse> mapSummary(Page<DoctorEntity> source) {
        return source.map(doctor -> mapSummary(doctor));

    }

}
