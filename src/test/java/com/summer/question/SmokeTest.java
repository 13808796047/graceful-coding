package com.summer.question;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @Author Summer
 * @Since 2022/4/23 1:11 AM
 * @Version 1.0
 */
@SpringBootTest
@AutoConfigureMockMvc
public class SmokeTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public  void should_return_ok_when_request_endpoint_of_health() throws Exception {
        mockMvc
                .perform(get("/actuator/health"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status").value("DOWN"));
    }
}
