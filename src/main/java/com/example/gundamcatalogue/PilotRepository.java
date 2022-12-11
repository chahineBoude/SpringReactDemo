package com.example.gundamcatalogue;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PilotRepository extends CrudRepository<Pilot, Long> {

    List<Pilot> findByUniverse(String universe);

}
