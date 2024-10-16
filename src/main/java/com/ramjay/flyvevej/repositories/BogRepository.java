package com.ramjay.flyvevej.repositories;

import com.ramjay.flyvevej.domain.Bog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BogRepository extends CrudRepository<Bog, String> {
}
