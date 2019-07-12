package com.stackroot.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class Assignment9Test {
    Assignment9 assignment9;
    @Before
    public void setup(){
        //arrange
        System.out.println("inside before");
        this.assignment9 = new Assignment9();
    }

    @After
    public void tearDown(){
        System.out.println("inside after");
        this.assignment9=null;
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
    public void GivenInputStringAndShouldReturnReverse() {
        String actualResult=assignment9.reverseString("hello");
        assertEquals("olleh",actualResult);
    }
    @Test
    public void GivenInputStringAndShouldNotReturnReverse() {
        String actualResult=assignment9.reverseString("hello");
        assertNotEquals("olle",actualResult);
    }
    @Test
    public void GivenInputStringShouldNotNull() {
        String actualResult=assignment9.reverseString("hello");
        assertNotNull("hello");
    }

}