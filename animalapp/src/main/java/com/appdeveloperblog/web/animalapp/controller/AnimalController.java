package com.appdeveloperblog.web.animalapp.controller;

import com.appdeveloperblog.web.animalapp.dto.AnimalDto;
import com.appdeveloperblog.web.animalapp.model.AnimalRequest;
import com.appdeveloperblog.web.animalapp.model.AnimalRest;
import com.appdeveloperblog.web.animalapp.service.AnimalService;
import com.appdeveloperblog.web.animalapp.utils.RandomCode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("animal")
public class AnimalController {

    @Autowired
    AnimalService animalService;

    private static Logger logger = LogManager.getLogger(AnimalController.class);

    RandomCode randomCode = new RandomCode();

    @GetMapping
    public String getAnimal(){
        return "get animal was called!!!";
    }

    @PostMapping
    public AnimalRest setAnimal(@RequestBody AnimalRequest animalRequest){

        AnimalRest returnValue = new AnimalRest();
        AnimalDto animalDto = new AnimalDto();

        BeanUtils.copyProperties(animalRequest, animalDto);

        AnimalDto createUser = animalService.createAnimal(animalDto);

        BeanUtils.copyProperties(createUser, returnValue);

        logger.info("Classe de Retorno: " + returnValue.toString());

        return returnValue;

    }
}
