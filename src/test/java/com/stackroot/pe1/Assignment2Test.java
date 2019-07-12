package com.stackroot.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class Assignment2Test {

    Assignment2 assignment2;
    @Before
    public void setup(){
        //arrange
        System.out.println("inside before");
        this.assignment2 = new Assignment2();
    }

    @After
    public void tearDown(){
        System.out.println("inside after");
        this.assignment2=null;
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
    public void givenINtegerShouldBeGraterThan20AndLessThan30AndEven() {
        String actualresult=assignment2.tomAndJerry(23);
        assertEquals("tom",actualresult);
    }
    @Test
    public void givenINtegerShouldBeGraterThan20AndLessThan30AndOdd() {
        String actualresult=assignment2.tomAndJerry(24);
        assertEquals("jerry",actualresult);
}
    @Test
    public void givenINtegerIsOutOfGivenLimit() {
        String actualresult=assignment2.tomAndJerry(39);
        assertEquals("out of bound value",actualresult);
}
}