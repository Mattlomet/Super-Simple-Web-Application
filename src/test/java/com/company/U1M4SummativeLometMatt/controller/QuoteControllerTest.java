package com.company.U1M4SummativeLometMatt.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(QuoteController.class)
public class QuoteControllerTest {


    @Autowired
    private MockMvc mockMvc;

    ObjectMapper mapper = new ObjectMapper();

    // was confused how to test for randomly generated items so i just checked for a valid status code

    @Test
    public void shouldReturn200WhenGetQuote() throws Exception {
        mockMvc.perform(get("/quote"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
