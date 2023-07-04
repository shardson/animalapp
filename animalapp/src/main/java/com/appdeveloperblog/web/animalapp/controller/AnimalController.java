package com.appdeveloperblog.web.animalapp.controller;

import com.appdeveloperblog.web.animalapp.model.AnimalRequest;
import com.appdeveloperblog.web.animalapp.model.AnimalRest;
import com.appdeveloperblog.web.animalapp.utils.RandomCode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("animal")
public class AnimalController {

    private static Logger logger = LogManager.getLogger(AnimalController.class);

    RandomCode randomCode = new RandomCode();

    @GetMapping
    public String getAnimal(){
        return "get animal was called!!!";
    }

    @PostMapping
    public AnimalRest setAnimal(@RequestBody AnimalRequest animalRequest){

        AnimalRest returnValue = new AnimalRest();

        BeanUtils.copyProperties(animalRequest, returnValue);

        returnValue.setCodigo(randomCode.generateUserId(30));

        logger.info("Classe de Retorno: " + returnValue.toString());

        return returnValue;

    }
}
