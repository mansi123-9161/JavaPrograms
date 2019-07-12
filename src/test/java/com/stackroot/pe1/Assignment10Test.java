package com.stackroot.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class Assignment10Test {
    Assignment10 assignment10;
    @Before
    public void setup(){
        //arrange
        System.out.println("inside before");
        this.assignment10 = new Assignment10();
    }

    @After
    public void tearDown(){
        System.out.println("inside after");
        this.assignment10=null;
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
    public void givenInputAndStringShouldBeConcatenated() {
        String actualresult=assignment10.addingSubStringByNumber("Stackroute",2);
        assertEquals("Stackrouteackrouteackroute",actualresult);
    }
    @Test
    public void givenInputAndStringShouldBeInSameCase() {
        String actualresult=assignment10.addingSubStringByNumber("Stackroute",2);
        assertEquals("STACKROUTEACKROUTEACKROUTE",actualresult);
    }
    @Test
    public void givenInputAndStringShouldNotBeInSameCase() {
        String actualresult=assignment10.addingSubStringByNumber("Stackroute",2);
        assertNotEquals("StackrouteACKROUTEACKROUTE",actualresult);
    }
    @Test
    public void givenInputAndStringShouldNotBeConcatenatedNTimes() {
        String actualresult=assignment10.addingSubStringByNumber("Stackroute",2);
        assertEquals("STACKROUTEACKROUTEACKROUTE",actualresult);
    }
}