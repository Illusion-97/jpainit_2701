package com.example.jpainit.generic;

import com.example.jpainit.entities.basic.models.B_Foo;
import com.example.jpainit.entities.basic.repositories.B_FooRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public abstract class Generic_Service<
        E,
        I,
        R extends JpaRepository<E,I>
        > {
    protected R repository;

    public Generic_Service(R repository) {
        this.repository = repository;
    }

    public Page<E> findAll(Pageable pageable) {return repository.findAll(pageable);}
    public Optional<E> findById(I id) { return repository.findById(id); }
    public E saveOrUpdate(E entity) { return repository.save(entity);}
    public void deleteById(I id) {repository.deleteById(id);}
}
