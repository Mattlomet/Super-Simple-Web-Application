package com.company.U1M4SummativeLometMatt.controller;

import com.company.U1M4SummativeLometMatt.model.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {

    private List<Quote> quoteList;

    public QuoteController(){

        quoteList = new ArrayList<>();

        quoteList.add(new Quote("Fiction is an improvement on life.","Charles Bukowski"));
        quoteList.add(new Quote("I try to create sympathy for my characters, then turn the monsters loose.","Stephen King"));
        quoteList.add(new Quote("Prose is architecture, not interior decoration.","Ernest Hemingway"));
        quoteList.add(new Quote("It’s none of their business that you have to learn to write. Let them think you were born that way.","Ernest Hemingway"));
        quoteList.add(new Quote("Most writers regard the truth as their most valuable possession, and therefore are most economical in its use.","Mark Twain"));
        quoteList.add(new Quote("To produce a mighty book, you must choose a mighty theme.","Herman Melville"));
        quoteList.add(new Quote("It is perfectly okay to write garbage—as long as you edit brilliantly.","C. J. Cherryh"));
        quoteList.add(new Quote("A blank piece of paper is God’s way of telling us how hard it to be God.","Sidney Sheldon"));
        quoteList.add(new Quote("Not that the story need be long, but it will take a long while to make it short.","Henry David Thoreau"));
        quoteList.add(new Quote("First, find out what your hero wants, then just follow him!","Ray Bradbury"));

    }

    @GetMapping("/quote")
    @ResponseStatus(HttpStatus.OK)
    public Quote getQuoteAndAuthor(){
        Random randomGen = new Random();
        int randomInt = randomGen.nextInt(9);
        return quoteList.get(randomInt);
    }

}
