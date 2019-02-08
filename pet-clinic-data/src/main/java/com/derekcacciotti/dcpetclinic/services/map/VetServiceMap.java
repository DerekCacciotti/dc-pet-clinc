package com.derekcacciotti.dcpetclinic.services.map;

import com.derekcacciotti.dcpetclinic.model.Vet;
import com.derekcacciotti.dcpetclinic.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);

    }

    @Override
    public void deletebyId(Long id) {
        super.deleteById(id);

    }
}
