/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package uk.co.utel.test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jthor
 */
public class ResultDataTest {
    
    public ResultDataTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    


    /**
     * Test of getId method, of class ResultData.
     */
    @org.junit.jupiter.api.Test
    public void testGetId() {
        System.out.println("getId");
        ResultData instance = new ResultData();
        long expResult = 0L;
        long result = instance.getId();
        instance.setId(expResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class ResultData.
     */
    @org.junit.jupiter.api.Test
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        ResultData instance = new ResultData();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
         assertEquals(id, instance.getId());
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class ResultData.
     */
    @org.junit.jupiter.api.Test
    public void testGetMessage() {
        System.out.println("getMessage");
        ResultData instance = new ResultData();
        String expResult = "";
        instance.setMessage("");
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setMessage method, of class ResultData.
     */
    @org.junit.jupiter.api.Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = "";
        ResultData instance = new ResultData();
        instance.setMessage(message);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class ResultData.
     */
    @org.junit.jupiter.api.Test
    public void testHashCode() {
        System.out.println("hashCode");
        ResultData instance = new ResultData();
        int expResult = 845;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class ResultData.
     */
    @org.junit.jupiter.api.Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        ResultData instance = new ResultData();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ResultData.
     */
    @org.junit.jupiter.api.Test
    public void testToString() {
        System.out.println("toString");
        ResultData instance = new ResultData();
        String expResult = "ResultData{id=0, message=null}";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
