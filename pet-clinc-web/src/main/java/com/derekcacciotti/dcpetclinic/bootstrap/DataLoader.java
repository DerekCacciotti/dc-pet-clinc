package com.derekcacciotti.dcpetclinic.bootstrap;

import com.derekcacciotti.dcpetclinic.model.Owner;
import com.derekcacciotti.dcpetclinic.model.Vet;
import com.derekcacciotti.dcpetclinic.services.OwnerService;
import com.derekcacciotti.dcpetclinic.services.VetService;
import com.derekcacciotti.dcpetclinic.services.map.OwnerServiceMap;
import com.derekcacciotti.dcpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;



    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();

    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Derek");
        owner1.setLastName("Cacciotti");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Bob");
        owner2.setLastName("Bobberson");

        ownerService.save(owner2);

        System.out.println("Loaded Owners......");


        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Vet");
        vet1.setLastName("Person");

        vetService.save(vet1);



        Vet vet2= new Vet();
        vet1.setId(2L);
        vet1.setFirstName("Vet");
        vet1.setLastName("Person 2");

        vetService.save(vet2);

        System.out.println("Loaded Vets.....");








    }
}
