package myTest;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import myMethod.MyString4;

/**
 * @authors 
 * Chao Chen
 * Yevhen Salitrynskyi
 * Mahshid Farrahinia
 *
 */

public class TestMyString4 {
	
	private char[] myChars = {'D', 'e', 'f', 'i', 'n', 'e', ' ', 't', 'h', 'e', ' ', 'f', 'o', 'l', 'l', 'o', 'w', 'i', 'n', 'g', ' ', 'm', 'e', 't', 'h', 'o', 'd', 's', ' ', 'w', 'i', 't', 'h', ' ', 'y', 'o', 'u', 'r', ' ', 'o', 'w', 'n', ' ', 'i', 'm', 'p', 'l', 'e', 'm', 'e', 'n', 't', 'a', 't', 'i', 'o', 'n', ' ', 'i', 'n', ' ', 'y', 'o', 'u', 'r', ' ', 'c', 'l', 'a', 's', 's', ' ', '(', 'i', '.', 'e', '.', ' ', 'M', 'y', 'S', 't', 'r', 'i', 'n', 'g', ')', '.'};
	private char[] myChars2 = {' ', 'T', 'h', 'e', ' ', 'c', 'o', 'n', 't', 'e', 'n', 't', 's', ' ', 'o', 'f', ' ', 't', 'h', 'e', ' ', 'c', 'h', 'a', 'r', 'a', 'c', 't', 'e', 'r', ' ', 'a', 'r', 'r', 'a', 'y', ' ', 'a', 'r', 'e', ' ', 'c', 'o', 'p', 'i', 'e', 'd', ';', ' ', 's', 'u', 'b', 's', 'e', 'q', 'u', 'e', 'n', 't', ' ', 'm', 'o', 'd', 'i', 'f', 'i', 'c', 'a', 't', 'i', 'o', 'n', ' ', 'o', 'f', ' ', 't', 'h', 'e', ' ', 'c', 'h', 'a', 'r', 'a', 'c', 't', 'e', 'r', ' ', 'a', 'r', 'r', 'a', 'y', ' ', 'd', 'o', 'e', 's', ' ', 'n', 'o', 't', ' ', 'a', 'f', 'f', 'e', 'c', 't', ' ', 't', 'h', 'e', ' ', 'n', 'e', 'w', 'l', 'y', ' ', 'c', 'r', 'e', 'a', 't', 'e', 'd', ' ', 'M', 'y', 'S', 't', 'r', 'i', 'n', 'g', ' ', 'i', 'n', 's', 't', 'a', 'n', 'c', 'e', '.'};	
	private MyString4 ms = new MyString4(myChars);
	private MyString4 ms2 = new MyString4(myChars2);
	
	private PrintStream save_out=System.out;
	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	
	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(out));
	}
	
	@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	
	@Test
	public void testPrintMyString() {
		PrintStream save_out=System.out;
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ms.printMyString();
		assertEquals("Define the following methods with your own implementation in your class (i.e. MyString).", out.toString());
	}
	
	@Test
	public void testPrintMyString2() {
		PrintStream save_out=System.out;
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		ms2.printMyString();
		assertEquals(" The contents of the character array are copied; subsequent modification of the character array "+
		"does not affect the newly created MyString instance.", out.toString());
	}
	
	@Test
	public void testLenth() {
		assertEquals(ms.length(),myChars.length);
		assertEquals(ms2.length(),myChars2.length);
	}
	
	@Test
	public void testCharAt() {
		assertEquals(ms.charAt(0),'D');
		assertEquals(ms.charAt(1),'e');
		assertEquals(ms.charAt(ms.length()-1),'.');
		
		assertEquals(ms2.charAt(0),' ');
		assertEquals(ms2.charAt(1),'T');
		assertEquals(ms2.charAt(ms2.length()-1),'.');
	}
	
	@Test
	public void testSubstring() {
		PrintStream save_out=System.out;
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ms.substring(0,5).printMyString();
		assertEquals("Define", out.toString().trim());
	}
	
	@Test
	public void testSubstring2() {
		PrintStream save_out=System.out;
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ms2.substring(1,12).printMyString();
		assertEquals("The contents", out.toString().trim());
	}

	@Test
	public void testToLowerCase() {
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ms.toLowerCase().printMyString();
		assertEquals("define the following methods with your own implementation in your class (i.e. mystring).", out.toString().trim());
	}

	@Test
	public void testEquals() {
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		boolean isEquals = ms.equals(new MyString4(myChars));
		assertEquals(true, isEquals);
	}
	
	@Test
	public void testValueOf() {
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ms.valueOf(1234).printMyString();
		assertEquals("1234", out.toString().trim());
	}

}
