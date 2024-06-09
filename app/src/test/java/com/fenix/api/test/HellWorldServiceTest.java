package com.fenix.api.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fenix.api.HellWorldService;

public class HellWorldServiceTest {

    private HellWorldService hellWorldService;

    @BeforeEach
    public void setUp() {
        hellWorldService = new HellWorldService();
    }

    @Test
    public void testGetMessageOption1() {
        String result = hellWorldService.getMessage("1");
        assertEquals("Hello world 1", result);
    }

    @Test
    public void testGetMessageOption2() {
        String result = hellWorldService.getMessage("2");
        assertEquals("Hello world 1", result);  // Fix as per the actual requirement
    }

    @Test
    public void testGetMessageWrongInput() {
        String result = hellWorldService.getMessage("3");
        assertEquals("Wrong input type", result);
    }
}