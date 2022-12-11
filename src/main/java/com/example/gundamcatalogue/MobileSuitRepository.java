package com.example.gundamcatalogue;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MobileSuitRepository extends CrudRepository<MobileSuit, Long> {
    List<MobileSuit> findByUniverse(String universe);
}
