package com.tp.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

// @WebMvcTest loads only the web layer (fast), restricted to this controller.
@WebMvcTest(HelloController.class)
class HelloControllerTest {

    // MockMvc simulates HTTP requests without starting a real server.
    @Autowired
    private MockMvc mockMvc;

    @Test
    void helloReturnsGreeting() throws Exception {
        mockMvc.perform(get("/hello"))
               .andExpect(status().isOk())                    // HTTP 200
               .andExpect(content().string("Greetings, DevOps!"));
    }
}