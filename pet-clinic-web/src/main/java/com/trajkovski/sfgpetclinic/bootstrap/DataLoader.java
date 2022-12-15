package com.trajkovski.sfgpetclinic.bootstrap;

import com.trajkovski.sfgpetclinic.model.Owner;
import com.trajkovski.sfgpetclinic.model.Vet;
import com.trajkovski.sfgpetclinic.service.OwnerService;
import com.trajkovski.sfgpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Filip");
        owner1.setLastName("Trajkovski");

        Owner owner2 = new Owner();
        owner2.setFirstName("Latinka");
        owner2.setLastName("Belchovska");

        ownerService.save(owner1);
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Belco");
        vet1.setLastName("Belcovski");

        Vet vet2 = new Vet();
        vet2.setFirstName("Maja");
        vet2.setLastName("Belcovska");

        vetService.save(vet1);
        vetService.save(vet2);

        System.out.println("Data loaded !!!!");


    }
}
