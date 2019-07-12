package com.stackroot.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class javaDemoTest {
    javaDemo javaDemo;
    @Before
public void setup(){
        //arrange
        System.out.println("inside before");
        this.javaDemo = new javaDemo();
    }

    @After
    public void tearDown(){
        System.out.println("inside after");
        this.javaDemo=null;
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
    public void givenTwoStringShouldReturnConcatAndUpperCase() {

        //act
         String actualResult=javaDemo.concatAndUpperCase("hello","world");

        //assert
       assertNotNull(actualResult);
        assertEquals( "HELLOWORLD",actualResult);

    }
    @Test
    public void givenStringAndNullShouldReturnErrorMessage(){

        //act
        String actualResult=javaDemo.concatAndUpperCase("hello",null);

        //assert
        assertNotNull(actualResult);
       assertEquals("nul not allowed",actualResult);

    }
    @Test
    public void givenStringShouldBeNotNull(){
        String actualResult=javaDemo.reverseString(null);
       assertEquals("enter not null",actualResult);
    }
    @Test
    public void givenStringShouldReturnReverseString(){

        String actualResult=javaDemo.reverseString("hello");
        assertEquals("olleH",actualResult);
    }
}