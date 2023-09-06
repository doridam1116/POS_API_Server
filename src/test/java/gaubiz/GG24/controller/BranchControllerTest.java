package gaubiz.GG24.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.RestController;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@RestController
public class BranchControllerTest {
    private final MockMvc mockMvc;

    public BranchControllerTest(MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }

    @Test
    void branchSetting() {


    }

    @Test
    void changeEmployee() {
    }

    @Test
    void findEmployee() {
    }
}
