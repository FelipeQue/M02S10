package br.senai.example.doctor_registration.controllers;

import br.senai.example.doctor_registration.dto.DoctorGetRequest;
import br.senai.example.doctor_registration.dto.DoctorRequest;
import br.senai.example.doctor_registration.dto.DoctorResponse;
import br.senai.example.doctor_registration.dto.DoctorSummaryResponse;
import br.senai.example.doctor_registration.services.DoctorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/doctors")
public class DoctorController {

    private DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrar(@Valid @RequestBody DoctorRequest request) {
        doctorService.cadastrar(request);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void atualizar(@PathVariable Long id, @RequestBody DoctorRequest request) {
        doctorService.atualizar(id, request);
    }

    @GetMapping
    public ResponseEntity<Page<DoctorSummaryResponse>> listar(
            DoctorGetRequest filtros, Pageable paginacao
    ){
        return ResponseEntity.ok(doctorService.listar(filtros, paginacao));
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DoctorResponse buscar(@PathVariable Long id){
        return doctorService.buscar(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long id){
        doctorService.remover(id);
    }


}
