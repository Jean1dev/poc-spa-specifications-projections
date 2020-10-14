package com.poc.specs.repository;

import com.poc.specs.entity.Cargo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepo extends CrudRepository<Cargo, Integer> {
}
