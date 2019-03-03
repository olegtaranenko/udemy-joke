package com.olegtaranenko.udemy.jokeapp.services;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class JokeServiceImpl implements JokeService {
    private ChuckNorrisQuotes quotes;

    @Autowired
    public JokeServiceImpl(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }

    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
