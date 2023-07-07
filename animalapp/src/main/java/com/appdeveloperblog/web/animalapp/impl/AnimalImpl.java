package com.appdeveloperblog.web.animalapp.impl;

import com.appdeveloperblog.web.animalapp.dto.AnimalDto;
import com.appdeveloperblog.web.animalapp.entity.AnimalEntity;
import com.appdeveloperblog.web.animalapp.repository.AnimalRepository;
import com.appdeveloperblog.web.animalapp.service.AnimalService;
import com.appdeveloperblog.web.animalapp.utils.RandomCode;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalImpl implements AnimalService {

    @Autowired
    AnimalRepository animalRepository;

    @Autowired
    RandomCode randomCode;

    @Override
    public AnimalDto createAnimal(AnimalDto animalDto) {

        AnimalEntity animalEntity = new AnimalEntity();

        BeanUtils.copyProperties(animalDto, animalEntity);

        //HardCode pra salvar como código externo
        animalEntity.setCodigo(randomCode.generateCode(30));

        animalRepository.save(animalEntity);

        AnimalDto returnValue = new AnimalDto();

        BeanUtils.copyProperties(animalEntity, returnValue);

        return returnValue;

    }

}
