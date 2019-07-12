package com.stackroot.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class Assignment8Test {
    Assignment8 assignment8;
    @Before
    public void setup(){
        //arrange
        System.out.println("inside before");
        this.assignment8 = new Assignment8();
    }

    @After
    public void tearDown(){
        System.out.println("inside after");
        this.assignment8=null;
    }
    @BeforeClass
    public static  void beforeClass()
    {
        System.out.println("inside beforeclass");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("inside afterclass");
    }

    @Test
    public void guessedNumberShouldBeCorrect() {
        String actualresult=assignment8.guessTheNumber(54);
        assertEquals("you guessed right!!! congrats",actualresult);
    }

    @Test
    public void guessedNumberShouldNotBeCorrect() {
        String actualresult=assignment8.guessTheNumber(5);
        assertNotEquals("you guessed right!!! congrats",actualresult);
    }
    @Test
    public void guessedNumberIsOutOfRange() {
        String actualresult=assignment8.guessTheNumber(109);
        assertEquals("you guessed wrong !!! input is greater than number",actualresult);
    }
}