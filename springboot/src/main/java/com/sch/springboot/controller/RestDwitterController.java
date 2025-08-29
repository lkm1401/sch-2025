package com.sch.springboot.controller;

import com.sch.springboot.entity.Dwitter;
import com.sch.springboot.service.DwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:3003"})
public class RestDwitterController {

    private DwitterService dwitterService;

    @Autowired
    public RestDwitterController(DwitterService dwitterService) {
        this.dwitterService = dwitterService;
    }

    @PostMapping("/dwitters/delete")
    public String deleteDwitter(@RequestBody Dwitter dwitter) {
        System.out.println(dwitter.getId());
        return dwitterService.delete(Long.valueOf(dwitter.getId()));
    }

    @GetMapping("/dwitters")
    public List<Dwitter> getDwitters() {
        return dwitterService.list();
    }

    @PostMapping("/dwitters/register")
    public String register(@RequestBody Dwitter dwitter) {
        return dwitterService.save(dwitter);
    }

}
