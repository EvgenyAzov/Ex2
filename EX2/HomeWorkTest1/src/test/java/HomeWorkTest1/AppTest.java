package HomeWorkTest1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Partition_F_Min() {
    	String result = App.GetCharFromInt(1);
    	String expected = "F";
    	assertEquals(expected,result);  	 	
    }
   
    @Test
    public void Partition_F_MinPlusOne() {
    	int num = 1;
    	String result = App.GetCharFromInt(1+num);
    	String expected = "F";
    	assertEquals(expected,result);  	 	
    }
    
    @Test
    public void Partition_F_Nominal() {
    	int num = 1;
    	String result = App.GetCharFromInt(25);
    	String expected = "F";
    	assertEquals(expected,result);  	 	
    }
    
    @Test
    public void Partition_F_Max() {

    	String result = App.GetCharFromInt(49);
    	String expected = "F";
    	assertEquals(expected,result);  	 	
    }
    
    @Test
    public void Partition_F_MaxMinusOne() {
    	int num = 1;
    	String result = App.GetCharFromInt(49-num);
    	String expected = "F";
    	assertEquals(expected,result);  	 	
    }
    
    @Test
    public void OutOfRange() {
    	String result = App.GetCharFromInt(50);
    	String expected = "error";
    	assertEquals(expected,result);  	 	
    }
    
    
    
    
}
