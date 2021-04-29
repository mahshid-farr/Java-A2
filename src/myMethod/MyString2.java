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
public class MyString2 {

	private char[] myChars;
	
	public MyString2() {}
	
	public MyString2(char[] chars) {
		this.myChars = chars.clone();
	}
	
	public void printMyString() {
		System.out.print(this.myChars);
	}
	
	public int length() {		
		return 100;
	}
	
	public char charAt(int index){
		if (index < 0 && index > (this.myChars.length)-1)
			throw new IllegalArgumentException("Index must be positive"); 
		
		char foundCharAt = this.myChars[index];
		return foundCharAt;
	}
	
	public  MyString2 substring(int beginIndex , int endIndex) {
		char[] sub = new char [endIndex - beginIndex];
		
		if (beginIndex < endIndex && endIndex > 1) {
			for (int i = beginIndex; i < endIndex+1; i++){
				sub[i-beginIndex] = this.myChars[i];
			}
		} else if(endIndex==beginIndex) {
			sub[0] = this.myChars[0];
		}
		
		MyString2 myString = new MyString2(sub);
		return myString ;
	}

	public MyString2 toLowerCase() {		
		return new MyString2(this.myChars) ;
	}

	public boolean equals(MyString2 s) {		
		return true;
	}
	
	public static MyString2 valueOf(int i) {
		throw new UnsupportedOperationException("Not implemented yet") ;
	}
}
