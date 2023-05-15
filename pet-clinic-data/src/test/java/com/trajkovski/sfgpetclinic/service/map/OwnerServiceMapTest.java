package com.trajkovski.sfgpetclinic.service.map;

import com.trajkovski.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;
    final Long ownerId = 1L;

    @BeforeEach
    void setup() {
        ownerServiceMap = new OwnerServiceMap(new PetTypeMapService(), new PetServiceMap());
        ownerServiceMap.save(Owner.builder().id(ownerId).build());
    }

    @Test
    void findAll() {
        Set<Owner> all = ownerServiceMap.findAll();
        Assertions.assertFalse(all.isEmpty());
        assertEquals(1, all.size());
    }

    @Test
    void findById() {
        Owner owner = ownerServiceMap.findById(ownerId);
        assertEquals(ownerId, owner.getId());
    }

    @Test
    void deleteById() {
        ownerServiceMap.deleteById(ownerId);
        ownerServiceMap.deleteById(3L);
        Owner owner = ownerServiceMap.findById(3L);
        assertNull(owner);
    }

    @Test
    void delete() {
        ownerServiceMap.delete(ownerServiceMap.findById(ownerId));
        assertEquals(0, ownerServiceMap.findAll().size());
    }

    @Test
    void save() {
        Owner owner2 = Owner.builder().id(2L).build();
        Owner save = ownerServiceMap.save(owner2);
        assertEquals(owner2.getId(), save.getId());
    }

    @Test
    void saveNoId() {
        Owner save = ownerServiceMap.save(new Owner());
        assertNotNull(save);
        assertNotNull(save.getId());
    }


    @Test
    void findByLastName() {
    }
}