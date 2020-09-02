package com.company.U1M4SummativeLometMatt.controller;


import com.company.U1M4SummativeLometMatt.model.Answer;
import com.company.U1M4SummativeLometMatt.model.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class MagicController {

    private List<Answer> answerList;


    public MagicController(){
        answerList = new ArrayList<>();

        answerList.add(new Answer("what is 1+1","2"));
        answerList.add(new Answer("what is 1+2","3"));
        answerList.add(new Answer("what is 1+3","4"));
        answerList.add(new Answer("what is 1+4","5"));
        answerList.add(new Answer("what is 1+5","6"));
        answerList.add(new Answer("what is 1+6","7"));
    }

    @PostMapping("/magic")
    @ResponseStatus(HttpStatus.OK)
    public Answer postMagic(@RequestBody String string){
        Random random = new Random();
        int randomInt = random.nextInt(5);
        return answerList.get(randomInt);
    }


}