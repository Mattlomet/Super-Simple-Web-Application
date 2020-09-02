package com.company.U1M4SummativeLometMatt.controller;

import com.company.U1M4SummativeLometMatt.model.Answer;
import com.company.U1M4SummativeLometMatt.model.Quote;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MagicController.class)
public class MagicControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    private List<Answer> answerList;
    @Before
    public void setUp(){
        answerList = new ArrayList<>();
    }


    @Test
    public void shouldReturn200WhenPostMagic() throws Exception {

        answerList.add(new Answer("what is 1+1","2"));


        mockMvc.perform(post("/magic")
                .content(answerList.get(0).getQuestion())
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());

    }



}

