package com.derekcacciotti.dcpetclinic.services.map;

import com.derekcacciotti.dcpetclinic.model.Owner;
import com.derekcacciotti.dcpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
      return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        this.delete(object);
    }

    @Override
    public void deletebyId(Long id) {
        this.deleteById(id);

    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
