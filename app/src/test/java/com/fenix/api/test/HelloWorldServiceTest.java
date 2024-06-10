package com.fenix.api.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fenix.api.HelloWorldService;

public class HelloWorldServiceTest {

    private HelloWorldService helloWorldService;

    @BeforeEach
    public void setUp() {
        helloWorldService = new HelloWorldService();
    }

    @Test
    public void testGetMessageOption1() {
        String result = helloWorldService.getMessage("1");
        assertEquals("Hello world 1", result);
    }

    @Test
    public void testGetMessageOption2() {
        String result = helloWorldService.getMessage("2");
        assertEquals("Hello world 1", result);  // Fix as per the actual requirement
    }

    @Test
    public void testGetMessageWrongInput() {
        String result = helloWorldService.getMessage("3");
        assertEquals("Wrong input type", result);
    }
}
