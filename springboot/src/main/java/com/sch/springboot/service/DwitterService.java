package com.sch.springboot.service;

import com.sch.springboot.entity.Dwitter;
import com.sch.springboot.repository.JpaDwitterRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class DwitterService {

    private JpaDwitterRepository dwitterRepository;

    @Autowired
    public DwitterService(JpaDwitterRepository dwitterRepository) {
        this.dwitterRepository = dwitterRepository;
    }

    public String delete(Long id) {
        return dwitterRepository.delete(id);
    }

    public List<Dwitter> list() {
        return dwitterRepository.findAll();
    }

    public String save(Dwitter dwitter) {
        return dwitterRepository.insert(dwitter);
    }
}
