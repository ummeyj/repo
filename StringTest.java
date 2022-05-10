/*
 * Class: CMSC201 
 * Instructor: Ashique Tanveer
 * Description: (Give a brief description for each Program)
 * Due: 05/09/2022
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Ummey Jannat
*/


package stringTest;
import org.junit.*;
import static org.junit.Assert.*;

public class StringTest {
	 	
	@Test
	public void m1() {
		String test = "test";
	    assertEquals(4, test.length());
	    assertEquals('e', test.charAt(1));
	    assertEquals("est", test.substring(1));
	    assertEquals(2, test.indexOf('s'));
	}   
}
