package com.trajkovski.sfgpetclinic.bootstrap;

import com.trajkovski.sfgpetclinic.model.*;
import com.trajkovski.sfgpetclinic.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final SpecialityService specialityService;
    private final PetTypeService petTypeService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService,
                      VetService vetService,
                      SpecialityService specialityService,
                      PetTypeService petTypeService,
                      VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.specialityService = specialityService;
        this.petTypeService = petTypeService;
        this.visitService = visitService;
    }


    @Override
    public void run(String... args) throws Exception {

        int petCount = petTypeService.findAll().size();
        if (petCount == 0) {
            loadData();
        }


    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDog = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCat = petTypeService.save(cat);


        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentist");
        Speciality savedRadiology = specialityService.save(radiology);
        Speciality savedSurgery = specialityService.save(surgery);
        Speciality savedDentistry = specialityService.save(dentistry);


        Owner owner1 = new Owner();
        owner1.setFirstName("Filip");
        owner1.setLastName("Trajkovski");
        owner1.setAddress("Aerodrom 13");
        owner1.setAddress("+38975346091");
        owner1.setCity("Skopje");

        Pet filipsPet = new Pet();
        filipsPet.setPetType(savedDog);
        filipsPet.setOwner(owner1);
        filipsPet.setBirthDate(LocalDate.of(2015, 1, 1));
        owner1.getPets().add(filipsPet);
        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setFirstName("Latinka");
        owner2.setLastName("Belchovska");
        owner2.setCity("Berovo");
        owner2.setAddress("Random");
        owner2.setTelephone("3454531");

        Pet latinkaPet = new Pet();
        latinkaPet.setBirthDate(LocalDate.now());
        latinkaPet.setOwner(owner2);
        latinkaPet.setPetType(savedCat);

        owner2.getPets().add(latinkaPet);
        ownerService.save(owner2);

        Visit catVisit = new Visit();
        catVisit.setPet(latinkaPet);
        catVisit.setDescription("Visited");
        catVisit.setDate(LocalDate.now());

        visitService.save(catVisit);

        Vet vet1 = new Vet();
        vet1.setFirstName("Belco");
        vet1.setLastName("Belcovski");
        vet1.getSpecialities().add(savedRadiology);

        Vet vet2 = new Vet();
        vet2.setFirstName("Maja");
        vet2.setLastName("Belcovska");
        vet2.getSpecialities().add(dentistry);
        vet2.getSpecialities().add(savedSurgery);

        vetService.save(vet1);
        vetService.save(vet2);

        System.out.println("Data loaded !!!!");
    }
}
