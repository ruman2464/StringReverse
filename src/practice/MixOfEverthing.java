package practice;

public class MixOfEverthing {

	public static void main(String[] args) {
		//reverseAString();
		//reverseofInteger(345);
		//sumOfInteger(123) ;
		//isPalindrome("madam");
		 //factorial(5);
		 //isPrime(1);
		// fabonacciNum(4);
		//sumOfAdigit(567);
		//isDuplicate();
		//duplicateFromString() ;
		swapString() ;
	}
	public static void reverseAString() {
		String orig = "I am from Bangladesh";
		String rev = "";
		for(int i = orig.length()-1; i>=0 ;i--) {
			rev = rev+orig.charAt(i);
		}
		System.out.println("Reverse of the string is :"+ rev);
	}
	
	public static void reverseofInteger(int num) {
		int temp;
		temp = num;
		int reverse=0 ;
		while (temp!=0) {
			int r =temp%10;
			reverse = reverse*10 +r;
			temp=temp/10;
			}
		System.out.println("reverse of the integer is "+reverse );
		
	}
	public static void sumOfInteger(int num) {
		int temp = num ;
		int sum = 0;
		
		while (temp!=0) {
			int r = temp%10;
			sum = sum +r;
			temp = temp/10;
			}
		System.out.println("sum of the integer is "+sum);
	}
	public static void isPalindrome(String word) {
		String rev = "";
		for(int i =word.length()-1;i>=0 ;i--) {
			word.charAt(i);
			rev= rev+word.charAt(i);
			
			}
			if(word.equals(rev)) {
				System.out.println("The word is a plaindrome word ");
		}else {
			System.out.println("This is not a palindrome word");
		}
		}
	
	public static void factorial(int num) {//factorial 321
		int fact= 1;
	for(int i=num; i>=1; i--) {
		fact= fact *i;
	}
	System.out.println("Factorialof the num is "+fact );
	}
	
	public static boolean isPrime(int num) {
		if (num<=1 ) {
			System.out.println("not prime num ");
			return false;
		}
		for(int i = 2 ; i<num;i ++ ) {
			if(num%i==0) {
				System.out.println("not a prime num ");
				return false;
			}
		}
		System.out.println("its a prime num ");
		return true;
	}
	public static void fabonacciNum(int num ) {
		int first = 0 ;
		int second= 1;
		int fabo;
		for(int i =1 ; i<=num; i++ ) {
			 fabo= first +second ;
			 System.out.println(fabo);
		first = second; 
		second = fabo;
		
		}
		}
	public static void sumOfAdigit(int num) {
		int temp = num;
		int sum =0;
		while (temp!=0) {
			int r =temp%10;
			sum = sum+r;
			temp =temp/10;
			}
		System.out.println("sum of the digit is "+sum );
	
	}
	
	public static void isDuplicate() {
		String orig= "wrwrrwttt5t";
		char[] words =orig.toCharArray();
		for(int i =0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i]==words[j]) {
					System.out.println("duplicate character is "+words[i]);
					}
			}}	}
	
		public static void duplicateFromString() {
			String []words= {"java", "javasScript","java","c","python","python"};
		
		for(int i = 0; i<words.length;i++) {
			for(int k=i+1; k<words.length;k++) {
				if(words[i]==words[k]) {
					System.out.println("Duplicate is "+words[i]);
				}
			}
		}
		}
		
		public static void swapString() {
			String x= "miju ";
			String y = "Sayeed ";
			x =x+y; //miju sayeed
			y= x.substring(0, x.length()-y.length());
		x=x.substring(y.length());
System.out.println(x);
System.out.println(y);
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
