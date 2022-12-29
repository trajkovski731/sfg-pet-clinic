package com.trajkovski.sfgpetclinic.service.map;

import com.trajkovski.sfgpetclinic.model.Speciality;
import com.trajkovski.sfgpetclinic.service.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality t) {
        super.delete(t);
    }

    @Override
    public Speciality save(Speciality t) {
        return super.save(t);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
