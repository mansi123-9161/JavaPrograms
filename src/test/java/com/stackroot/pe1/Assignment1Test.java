package com.stackroot.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class Assignment1Test {

    Assignment1 assignment1;
    @Before
    public void setup(){
        //arrange
        System.out.println("inside before");
        this.assignment1 = new Assignment1();
    }

    @After
    public void tearDown(){
        System.out.println("inside after");
        this.assignment1=null;
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
    public void givenInputIsPalindromAndGreaterThan25() {
        String actualresult=assignment1.checkPalindromAndData(888888);
        assertEquals("the given number palindrome number and greater than 25",actualresult);
    }
    @Test
    public void givenInputIsPalindromAndLesserThan25() {
        String actualresult=assignment1.checkPalindromAndData(232);
        assertEquals("the given number not palindrome and less than 25",actualresult);
    }
    @Test
    public void givenInputIsNotPalindrom() {
        String actualresult=assignment1.checkPalindromAndData(2321);
        assertEquals("not palindrome",actualresult);
    }
}