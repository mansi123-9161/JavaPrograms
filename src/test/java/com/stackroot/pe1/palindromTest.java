package com.stackroot.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class palindromTest {
     palindrom palindrom;
    @Before
    public void setUp() throws Exception {
        //arrange
        System.out.println("inside before");
        this.palindrom = new palindrom();
    }

    @After
    public void tearDown() throws Exception {
        //arrange
        System.out.println("inside after");
        this.palindrom = new palindrom();
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
    public void givenNumberShouldBePalindrom() {
        String actualResult=palindrom.palindrom(12321);
        assertEquals("palindrom",actualResult);
    }
    @Test
    public void givenNumberShouldNotBePalindrom() {
        String actualResult=palindrom.palindrom(1232);
        //assertEquals(1221,actualResult);
        assertEquals("not palindrom",actualResult);
    }
}