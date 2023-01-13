package com.trajkovski.sfgpetclinic.repository;

import com.trajkovski.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
