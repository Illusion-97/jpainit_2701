package com.example.jpainit.generic;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

public class Generic_Controller<
        E,
        I,
        S extends Generic_Service<E,I>
        > {
    protected S service;

    public Generic_Controller(S service) {
        this.service = service;
    }

    @GetMapping
    public Page<E> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @PostMapping
    public E saveOrUpdate(@RequestBody E entity) {
        return service.saveOrUpdate(entity);
    }

    @GetMapping("{id}")
    public Optional<E> findById(@PathVariable I id) {
        return service.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable I id) {
        service.deleteById(id);
    }
}
