package com.trajkovski.sfgpetclinic.service;

import com.trajkovski.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
