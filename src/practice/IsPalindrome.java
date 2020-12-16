package practice;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

public class IsPalindrome {

	public static void main(String[] args) {
		//isPalindrome();
		//isPalindrome2() ;
		ispalindrome3();
	
	} 
	public static void isPalindrome() {
		String orig= "race car";
		String rev="";
		for(int i=orig.length()-1;i>=0;i--) {
			rev= rev+orig.charAt(i);
			
		
		}
		System.out.print(rev);
		if(orig.equals(rev)) {
			System.out.println(" it is palindrome");
			
		}else{
			System.out.println(" this is not palindrome ");
		}
	}
	public static void isPalindrome2() {
		
	String orig = "madam";
	String rev="";
	
	for(int i=orig.length()-1;i>=0;i--) {
		rev= rev+orig.charAt(i);
	}
	if (orig.equals(rev)) {
		System.out.println(orig +":This word is Palindrome ");
	}else {
		System.out.println(orig +":This word is not palindrome");
	}
	
	
	
	
	}
	
	public static void ispalindrome3() {
		String orig= "mom";
	String rev="";
		for(int i = orig.length()-1;i>=0;i--) {
			rev= rev+orig.charAt(i);
		}
		if(orig.equals(rev)) {
			System.out.println("The word is palindrome");
		}else {
			System.out.println("The word is not palindrome");
		}
	
	
	}
	
	
	
	
	
	
	
	
	
}
