package com.testclass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import validator.MoodAnalyser;

public class MoodAnalyserTest {
    @Test
    public void givenSadMessageShouldReturnsSad() {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood=moodAnalyser.analyseMood("Hello I am in sad mood");
        Assertions.assertEquals("SAD",mood);
        System.out.println(mood);
    }
    @Test
    public void givenHappyMessageShouldReturnsSad() {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood=moodAnalyser.analyseMood("Hello I am in happy mood");
        Assertions.assertEquals("HAPPY",mood);
        System.out.println(mood);
    }
    @Test
    public void givenAnyMessageShouldReturnsSad() {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood=moodAnalyser.analyseMood("Hello I am in sad mood");
        Assertions.assertEquals("SAD",mood);
    }

}
