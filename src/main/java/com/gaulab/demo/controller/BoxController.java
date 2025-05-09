package com.gaulab.demo.controller;

import com.gaulab.demo.model.Box;
import com.gaulab.demo.service.BoxService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boxes")
public class BoxController {

    private final BoxService service;

    public BoxController(BoxService service) {
        this.service = service;
    }

    @GetMapping
    public List<Box> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Box create(@RequestBody Box box) {
        return service.save(box);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
