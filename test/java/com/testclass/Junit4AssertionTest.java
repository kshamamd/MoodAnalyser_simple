package com.testclass;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
//import org.junit.Assert;

public class Junit4AssertionTest {
    @Test
    public void testAssert() {
        //variable declaration
        String string1="Junit";
        String string2="Junit";
        Object obj1 = new Object();
        Object obj2 = new Object();
        String string5=null;
        int variable1=1;
        int variable2=2;
        int[] arithematicArray1 = { 1, 2, 3 };
        int[] arithematicArray2 = { 1, 2, 3 };

        //Assert statements
        Assertions.assertEquals(string1,string2);
        Assertions.assertSame(string1,string2);
        Assertions.assertSame(obj1, obj2);
        Assertions.assertNotSame(obj1, obj2);
        Assertions.assertNotNull(string1);
        Assertions.assertNull(string5);
        Assertions.assertTrue(variable1<variable2);
        Assertions.assertArrayEquals(arithematicArray1, arithematicArray2);
    }

}
