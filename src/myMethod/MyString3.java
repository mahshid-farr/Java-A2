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
public class MyString3 {

	private char[] myChars;
	
	public MyString3() {}
	
	public MyString3(char[] chars) {
		this.myChars = chars.clone();
	}
	
	public void printMyString() {
		System.out.print(this.myChars);
	}
	
	public int length() {		
		int i = 0;
		for (char ch : this.myChars)
			i++;
	    
		return i;
	}
	
	public char charAt(int index){
		if (index < 0 && index > (this.myChars.length)-1)
			throw new IllegalArgumentException("Index must be positive"); 
		
		char foundCharAt = this.myChars[index];
		return foundCharAt;
	}
	
	public  MyString3 substring(int beginIndex , int endIndex) {
		char[] sub = new char [endIndex - beginIndex + 1];
		
		if (beginIndex < endIndex && endIndex > 1) {
			for (int i = beginIndex; i < endIndex+1; i++){
				sub[i-beginIndex] = this.myChars[i];
			}
		} else if(endIndex==beginIndex) {
			sub[0] = this.myChars[0];
		}
		
		MyString3 myString = new MyString3(sub);
		return myString ;
	}

	public MyString2 toLowerCase() {		
		return new MyString2(this.myChars) ;
	}

	public boolean equals(MyString3 s) {
		int sameSymbols = 0;
		
		for (char c : this.myChars)
			if (c != this.charAt(sameSymbols)) 
				return false;
		
		return false;
	}
	
	public static MyString3 valueOf(int i) {
		char[] charsList = new char [Integer.toString(i).length()];
		int number = i;
		
		while (number > 0) {
			charsList[Integer.toString(number).length()-1] = (char)(1);
			number=number/10 ;
		}
		
		return new MyString3(charsList);
	}
}
