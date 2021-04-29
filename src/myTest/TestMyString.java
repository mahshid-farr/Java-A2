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
import myMethod.MyString;

/**
 * @authors 
 * Chao Chen
 * Yevhen Salitrynskyi
 * Mahshid Farrahinia
 *
 */

public class TestMyString {
	
	private char[] myChars = {'D', 'e', 'f', 'i', 'n', 'e', ' ', 't', 'h', 'e', ' ', 'f', 'o', 'l', 'l', 'o', 'w', 'i', 'n', 'g', ' ', 'm', 'e', 't', 'h', 'o', 'd', 's', ' ', 'w', 'i', 't', 'h', ' ', 'y', 'o', 'u', 'r', ' ', 'o', 'w', 'n', ' ', 'i', 'm', 'p', 'l', 'e', 'm', 'e', 'n', 't', 'a', 't', 'i', 'o', 'n', ' ', 'i', 'n', ' ', 'y', 'o', 'u', 'r', ' ', 'c', 'l', 'a', 's', 's', ' ', '(', 'i', '.', 'e', '.', ' ', 'M', 'y', 'S', 't', 'r', 'i', 'n', 'g', ')', '.'};
	private char[] myChars2 = {' ', 'T', 'h', 'e', ' ', 'c', 'o', 'n', 't', 'e', 'n', 't', 's', ' ', 'o', 'f', ' ', 't', 'h', 'e', ' ', 'c', 'h', 'a', 'r', 'a', 'c', 't', 'e', 'r', ' ', 'a', 'r', 'r', 'a', 'y', ' ', 'a', 'r', 'e', ' ', 'c', 'o', 'p', 'i', 'e', 'd', ';', ' ', 's', 'u', 'b', 's', 'e', 'q', 'u', 'e', 'n', 't', ' ', 'm', 'o', 'd', 'i', 'f', 'i', 'c', 'a', 't', 'i', 'o', 'n', ' ', 'o', 'f', ' ', 't', 'h', 'e', ' ', 'c', 'h', 'a', 'r', 'a', 'c', 't', 'e', 'r', ' ', 'a', 'r', 'r', 'a', 'y', ' ', 'd', 'o', 'e', 's', ' ', 'n', 'o', 't', ' ', 'a', 'f', 'f', 'e', 'c', 't', ' ', 't', 'h', 'e', ' ', 'n', 'e', 'w', 'l', 'y', ' ', 'c', 'r', 'e', 'a', 't', 'e', 'd', ' ', 'M', 'y', 'S', 't', 'r', 'i', 'n', 'g', ' ', 'i', 'n', 's', 't', 'a', 'n', 'c', 'e', '.'};	
	private MyString ms = new MyString(myChars);
	private MyString ms2 = new MyString(myChars2);
	
	private char[] myChars1 = {'D', 'e', 'f', 'i', 'n', 'e', ' ', 't', 'h', 'e',' '};
	private MyString ms1 = new MyString(myChars1);
	
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
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ms.printMyString();
		assertEquals("Define the following methods with your own implementation in your class (i.e. MyString).", out.toString());
	}
	
	@Test
	public void testPrintMyString2() {
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
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ms.substring(0,5).printMyString();
		assertEquals("Define", out.toString().trim());
	}
	
	@Test
	public void testSubstring2() {
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ms2.substring(1,12).printMyString();
		assertEquals("The contents", out.toString().trim());
	}
	
	@Test
	public void testSubstring3() {
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ms2.substring(0,0).printMyString();
		assertEquals("", out.toString().trim());
	}
	
	@Test
	public void testSubstring6() {
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ms.substring(0,0).printMyString();
		assertEquals("D", out.toString().trim());
	}
	
	@Test
	public void testSubstring4() {
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ms2.substring(88,88).printMyString();
		assertEquals("r", out.toString().trim());
	}
	
	@Test
	public void testSubstring5() {
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ms1.substring(0,0).printMyString();
		assertEquals("D", out.toString().trim());
	}
	
	@Test
	public void testSubstring7() {
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ms1.substring(1,2).printMyString();
		assertEquals("ef", out.toString().trim());
	}
	
	@Test
	public void testSubstring8() {
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ms1.substring(1,1).printMyString();
		assertEquals("e", out.toString().trim());
	}
	
	@Test
	public void testSubstring9() {
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ms1.substring(10,10).printMyString();
		assertEquals("", out.toString().trim());
	}
	
	@Test
	public void testSubstring10() {
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ms1.substring(9,9).printMyString();
		assertEquals("e", out.toString().trim());
	}
	
	@Test
	public void testSubstring11() {
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ms1.substring(9,10).printMyString();
		assertEquals("e", out.toString().trim());
	}
	
	@Test
	public void testSubstring12() {
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ms1.substring(9,12).printMyString();
		assertEquals("e", out.toString().trim());
	}
	
	@Test
	public void testValueOf2() {
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ms.valueOf(999999999).printMyString();
		assertEquals("999999999", out.toString().trim());
	}
	
	@Test
	public void testValueOf3() {
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ms.valueOf(1).printMyString();
		assertEquals("1", out.toString().trim());
	}
	
	@Test
	public void testValueOf4() {
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ms.valueOf(0).printMyString();
		assertEquals("0", out.toString().trim());
	}
	
	@Test
	public void testEquals() {
		assertEquals(false, ms2.equals(ms));
	}
	
	@Test
	public void testEquals1() {
		assertEquals(true, ms.equals(ms));
	}
	
	@Test
	public void testEquals2() {
		assertEquals(false, ms.equals(ms1));
	}
	
	@Test
	public void testEquals3() {
		assertEquals(false, ms.equals(ms2));
	}
	
	@Test
	public void testToLowerCase() {
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ms.toLowerCase().printMyString();
		assertEquals("define the following methods with your own implementation in your class (i.e. mystring).", out.toString().trim());
	}
	
	@Test
	public void testValueOf() {
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		MyString.valueOf(1234).printMyString();
		assertEquals("1234", out.toString().trim());
	}
}
