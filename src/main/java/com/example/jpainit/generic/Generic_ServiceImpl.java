package com.example.jpainit.generic;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public abstract class Generic_ServiceImpl<
        E,
        I,
        R extends JpaRepository<E,I>
        > implements Generic_Service<E,I> {
    protected R repository;

    public Generic_ServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public Page<E> findAll(Pageable pageable) {return repository.findAll(pageable);}
    @Override
    public Optional<E> findById(I id) { return repository.findById(id); }
    @Override
    public E saveOrUpdate(E entity) { return repository.save(entity);}
    @Override
    public void deleteById(I id) {repository.deleteById(id);}
}
