package br.senai.example.doctor_registration.controllers;

import br.senai.example.doctor_registration.dto.DoctorRequest;
import br.senai.example.doctor_registration.repositories.DoctorRepository;
import br.senai.example.doctor_registration.services.DoctorService;
import org.springframework.http.HttpStatus;
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


}
