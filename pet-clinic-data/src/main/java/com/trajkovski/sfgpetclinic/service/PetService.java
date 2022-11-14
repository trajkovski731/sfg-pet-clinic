package com.trajkovski.sfgpetclinic.service;

import com.trajkovski.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Set<Pet> findAll();

    Pet savePet(Pet pet);
}
