package com.trajkovski.sfgpetclinic.service;

import com.trajkovski.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Set<Vet> findAll();

    Vet saveVet(Vet vet);
}
