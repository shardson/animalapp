package com.appdeveloperblog.web.animalapp.repository;

import com.appdeveloperblog.web.animalapp.entity.AnimalEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends CrudRepository<AnimalEntity, Long> {

}
