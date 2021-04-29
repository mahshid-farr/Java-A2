package myMethod;

/**
 * @authors 
 * Chao Chen
 * Yevhen Salitrynskyi
 * Mahshid Farrahinia
 * 
 * This version is the complete version which passes all the test correctly
 * This class provides several methods such as length, charAt, Substring which can be found in the Java library.
 * However, We implemented these methods without using any method from String classes
 * 
 */
public class MyString1 {

	private char[] myChars;
	
	public MyString1() {}
	
	public MyString1(char[] chars) {
		this.myChars = chars.clone();
	}
	
	public void printMyString() {
		throw new UnsupportedOperationException("Not implemented yet") ;
	}

	public int length() {		
		throw new UnsupportedOperationException("Not implemented yet") ;
	}
	
	public char charAt(int index){
		throw new UnsupportedOperationException("Not implemented yet") ;
	}
	
	public  MyString1 substring(int beginIndex , int endIndex) {
		throw new UnsupportedOperationException("Not implemented yet") ;
	}

	public MyString1 toLowerCase() {		
		throw new UnsupportedOperationException("Not implemented yet") ;
	}

	public boolean equals(MyString1 s) {
		throw new UnsupportedOperationException("Not implemented yet") ;
	}
	
	public static MyString1 valueOf(int i) {
		throw new UnsupportedOperationException("Not implemented yet") ;
	}
}
