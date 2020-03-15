package com.example.fg;

import com.example.fg.service.FuckingGreatService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class FuckingGreatApplicationTest {

    @Autowired
    FuckingGreatService fuckingGreatService;

    @Test
    public void test() {
        String name = fuckingGreatService.hello();
        assertEquals(name, "cattles");
    }
}