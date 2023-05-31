package com.trajkovski.sfgpetclinic.service.springdatajpa;

import com.trajkovski.sfgpetclinic.repository.PetRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = PetSDJpaService.class)
class PetSDJpaServiceTest {

    @Autowired
    private PetSDJpaService petSDJpaService;

    @MockBean
    PetRepository petRepository;

    @Test
    void testThis() {
        System.out.println("Here I am");
    }

}