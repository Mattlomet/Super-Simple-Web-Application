package com.company.U1M4SummativeLometMatt.controller;


import com.company.U1M4SummativeLometMatt.model.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class WordController {

    private List<Definition> definitionList;

    public WordController(){

        definitionList = new ArrayList<>();

        definitionList.add(new Definition("eat","put (food) into the mouth and chew and swallow it."));
        definitionList.add(new Definition("red","of a color at the end of the spectrum next to orange and opposite violet, as of blood, fire, or rubies."));
        definitionList.add(new Definition("blue","of a color intermediate between green and violet, as of the sky or sea on a sunny day."));
        definitionList.add(new Definition("desk","a piece of furniture with a flat or sloped surface and typically with drawers, at which one can read, write, or do other work."));
        definitionList.add(new Definition("monitor","a television receiver used in a studio to select or verify the picture being broadcast from a particular camera."));
        definitionList.add(new Definition("phone","a telephone."));
        definitionList.add(new Definition("headphones","a pair of earphones joined by a band placed over the head, for listening to audio signals such as music or speech."));
        definitionList.add(new Definition("marker","a felt-tip pen with a broad tip."));
        definitionList.add(new Definition("word","a single distinct meaningful element of speech or writing, used with others (or sometimes alone) to form a sentence and typically shown with a space on either side when written or printed."));
        definitionList.add(new Definition("definition","a statement of the exact meaning of a word, especially in a dictionary."));

    }


    @GetMapping("/word")
    @ResponseStatus(HttpStatus.OK)
    public Definition getWord(){
        Random random = new Random();
        int randomInt = random.nextInt(9);
        return definitionList.get(randomInt);
    }
}
