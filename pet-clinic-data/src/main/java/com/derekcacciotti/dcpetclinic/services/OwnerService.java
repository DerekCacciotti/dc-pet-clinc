package com.derekcacciotti.dcpetclinic.services;

import com.derekcacciotti.dcpetclinic.model.Owner;


public interface OwnerService extends  CrudService<Owner, Long> {
    Owner findByLastName(String lastName);





}
