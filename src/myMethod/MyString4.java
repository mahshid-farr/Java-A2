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
public class MyString4 {

	/**
	 * Allocates a new MyString instance so that it represents the sequence of
	 * characters currently contained in the character array argument. The contents of
     * the character array are copied; subsequent modification of the character array
     * does not affect the newly created MyString instance.
	 * @param args - an array of characters
	 */
	private char[] myChars;
	
	public MyString4() {}
	
	public MyString4(char[] chars) {
		this.myChars = chars.clone();
	}
	
	public void printMyString() {
		System.out.print(this.myChars);
	}
	
	
	/**
	 * Returns the length of this MyString instance. The length is equal to the number
	 * of characters in this MyString instance.
	 * Returns: the length of the sequence of characters represented by this MyString object.
	 * @param args
	 */
	public int length() {		
		int i = 0;
		for (char ch : this.myChars)
			i++;
	    
		return i;
	}
	
	/**
	 * Returns the char value at the specified index. An index ranges from 0 to length()
     * - 1. The first char value of the sequence is at index 0, the next at index 1, and so
     * on, as for array indexing. 
     * 
     * An index ranges from 0 to length()-1
     * 
	 * Returns: the char value at the specified index of this MyString instance. The first char value is at index 0.
	 * @param index - index of letter
	 */
	public char charAt(int index){
		if (index < 0 && index > (this.myChars.length)-1)
			throw new IllegalArgumentException("Index must be positive"); 
		
		char foundCharAt = this.myChars[index];
		return foundCharAt;
	}
	
	/**
	 * Returns a MyString instance that is a substring of this MyString instance. The
     * substring begins at the specified beginIndex and extends to the character at index
     * endIndex - 1. Thus, the length of the substring is endIndex-beginIndex
	 * Returns: the specified substring.
	 * @param args - beginIndex - the beginning index, inclusive, endIndex - the ending index, exclusive
	 */
	public  MyString4 substring(int beginIndex , int endIndex) {
		char[] sub = new char [endIndex - beginIndex + 1];
		
		if (beginIndex < endIndex && endIndex > 1) {
			for (int i = beginIndex; i < endIndex+1; i++){
				sub[i-beginIndex] = this.myChars[i];
			}
		} else if(endIndex==beginIndex) {
			sub[0] = this.myChars[0];
		}
		
		MyString4 MyString4 = new MyString4(sub);
		return MyString4 ;
	}

	/**
	 * Converts all of the characters in this MyString instance to lower case.
	 * Returns: the MyString instance, converted to lowercase
	 */
	public MyString4 toLowerCase() {		
		for (int i=0; i<this.length(); i++) 
			this.myChars[i] = Character.toLowerCase(this.myChars[i]) ;

		return new MyString4(this.myChars);
	}

	/**
	 * Compares this MyString instance to the specified MyString instance. The result
	 * is true if and only if the argument is not null and is a MyString object that
	 * represents the same sequence of characters as this MyString object.
	 * 
	 * Overrides:
	 * 	equals in class Object
	 * 
	 * Parameters:
	 * 	s - The object to compare this MyString instance against
	 * 
	 * Returns:
	 * 	true if the given MyString object represents a MyString equivalent to this MyString instance, false otherwise
	 */
	public boolean equals(MyString4 s) {
		int sameSymbols = 0 ;
		
		if (s != null && s.length() == this.length())
			for (int i=0; i < s.length(); i++) 
				if (this.myChars[i] != s.charAt(i))
					break ;
				else
					sameSymbols++ ;
					
		if (sameSymbols == s.length())
			return true;
		else
			return false;
	}
	
	/**
	 * Returns the MyString4 representation of the int argument.
	 * The representation is exactly the one returned by the Integer.toString method of
	 * one argument.
	 * Returns: a MyString4 representation of the int argument
	 * @param args - i - the number to convert
	 */
	public static MyString4 valueOf(int i) {
		char[] charsList = new char [Integer.toString(i).length()];
		int number = i;
		
		while (number > 0) {
			charsList[Integer.toString(number).length()-1] = (char)(number%10+'0');
			number=number/10;
		}
		
		return new MyString4(charsList);
	}
}
