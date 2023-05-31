package com.trajkovski.sfgpetclinic.service.springdatajpa;

import com.trajkovski.sfgpetclinic.repository.OwnerRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ActiveProfiles("springdatajpa")
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = OwnerSDJpaService.class)
public class CustomTest {

    @Autowired
    OwnerSDJpaService ownerSDJpaService;

    @MockBean
    OwnerRepository ownerRepository;

    @Test
    void test() {
        System.out.println("This");
    }

}
