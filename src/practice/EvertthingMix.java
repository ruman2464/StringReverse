package practice;

public class EvertthingMix {

	public static void main(String[] args) {
		// sumofNum(3, 4);
		// printSumOfEvenNum(1, 10);
		// sumOfOddNum(1 ,10 );
		// sumofSeries(10);
		// seriesOfMultiplication(5);
		// factorialOfAnyNum(5);
		// reverseAString ();
		// multiplicationTable(5);
		// multiplicationTable2(6);
		// MultiplicationOfManyTable(2,5);
		
		//isPrime(1);;
		//isPrime2(1);
		//fibonacciWIthoutRecursion(6);
		//fibonacci2 (13 );
		//fib3 (15);
		//reverse();
		 //reverse2();
		//sumOFDigit(123);
		//sumOfNum(543);
		//reverseAnINteger(321);
		// sumofaNum(3214) ;
		reverseAnint(234);
	}
	
	

	public static void sumofNum(int m, int n) {
		int sum = 0;
		for (int i = m; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("sum of m and n is " + sum);

	}

	public static void printSumOfEvenNum(int m, int n) {
		int sum = 0;
		for (int i = m; i <= n; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
				System.out.print(" " + i);
			}
			// System.out.println(i);
		}
		System.out.println("sum of num is " + sum);
	}

	public static void sumOfOddNum(int m, int n) {
		int sum = 0;
		for (int i = m; i <= n; i++)
			if (i % 2 != 0) {
				sum = sum + i;
				System.out.print("" + i);
			}
		System.out.println("sum of odd num is " + sum);
	}

	public static void sumofSeries(int n) {
		int sum = 0;
		for (int i = 2; i <= n; i = i + 2) {
			sum = sum + i;
			System.out.print(i + " ");
		}
		System.out.println(" add up to " + sum);

	}

	public static void seriesOfMultiplication(int n) {
		int mult = 1;

		for (int i = 1; i <= n; i++) {
			mult = mult * i * i;
			System.out.print("" + i);
		}
		System.out.println("mult of series is " + mult);
	}

	public static void factorialOfAnyNum(int num) {
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;

		}
		System.out.println("factorial of num 5 is " + factorial);

	}

	public static void reverseAString() {
		String orig = "my name is miju";
		String reverse = "";
		// String [] words =orig.split("");
		for (int i = orig.length() - 1; i >= 0; i--) {
			reverse = reverse + orig.charAt(i);
		}
		System.out.println(reverse);
	}

	public static void multiplicationTable(int num) {

		for (int i = 1; i <= 10; i++) {

			System.out.println(num + "X" + i + "=" + num * i);

		}

	}

	public static void multiplicationTable2(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "X" + i + "=" + num * i);
		}
	}

	public static void MultiplicationOfManyTable(int m, int n) {
		for (int i = m; i <= n; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "X" + j + "=" + i * j);
			}
		}

	}

	public static void isPrime(int num) {
		int count = 0;
		if (num <= 1) {
			System.out.println("not a prime num");
		
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
				System.out.println("not a prime number");
				break;
			}
			if (count == 0) {
				System.out.println("it is a prime number");
				break;
			} else {
				System.out.println("not a prime number");
			}

		}

	}
	public static void isPrime2(int num ) {
		int count = 0;
		if(num<=1) {
			System.out.println("Not a prime number");
			
		}
		for( int i= 2 ; i<num ; i++) {
			if(num%i ==0 ) {
				
			count++;
			System.out.println("Not a prime number");
			break;
		}if (count ==0) {
			System.out.println("it  a prime number");
			break;
		}else {
			System.out.println("Not a prime number ");
		}
			
		}
		
	
	}
	public static void fibonacciWIthoutRecursion(int n) {
		int first =0 ;
		int second= 1 ;
		int fibo;
		//System.out.print(first+" "+ second );
		
		for(int i =1  ;i<=n ; i ++) {
			fibo = first +second ;
		System.out.println(""+fibo);
		first = second ;
		second = fibo;
		}
		//System.out.println();
		
		
	}
	
	
	public static void fibonacci2 (int num ) {
		int first = 0;
		int second = 1;
		
		int fibo;
		for( int i = 1; i <=num ; i ++) {
			fibo = first + second;
			System.out.println(fibo);
			first= second;
			second = fibo;
			
		}
	
	}
	
	public static void fib3 (int num ) {
		int first = 0; 
		int second = 1 ;
		int fibo;
		for(int i =1 ; i <= num ; i ++) {
			fibo = first+ second ;
			System.out.println(fibo);
			
			first = second; 
			second = fibo ;
		}
	}
	public static void reverse() {
		String orig = "i love programming ";
		String [] words =orig.split("");
		String rev="";
		for(int i = words.length-1; i >=0;i--) {
			rev= rev+orig.charAt(i);
			
			
		}
	System.out.println("rev of the sring is "+rev);
	
	}
	public static void reverse2() {
		String orig = "i love Programming";
		String replace=orig.replaceAll(" ", "");
		char[] words =replace.toCharArray();
		String rev="";
		for(int i =replace.length()-1;i>=0; i--) {
			rev= rev+replace.charAt(i);
		}
		System.out.println(rev);
		
	}
	public static void sumOFDigit(int num ) {
		
	int  temp = num ;
	int sum = 0;
	while (temp !=0) {
		int   r = temp % 10;
		 sum = sum +r;
	temp =	temp/10;
	
		
	}
	System.out.println(sum);
}
	
	
	public static void sumOfNum(int num ) {
		int temp = num ;
		int sum=0;
		while (temp !=0 ) {
			int r = temp%10;
			sum = sum +r;
			temp =temp/10;
			
			
		}
		System.out.println(sum );
	
	
	}
	public static void reverseAnINteger(int num) {
		
		int temp;
		temp = num ;
	int sum =0;
	
		while (temp!=0) {
			
			int r =temp %10;
			sum = sum*10+r;
			temp=temp/10;
		
		}
		System.out.println("reverse of the num is "+sum );
		
		
	
	
	}
	public static void sumofaNum(int num ) {
		int temp= num ;
		int sum=0;
		while (temp!=0) {
			int r =temp% 10;
			sum = sum+r;
			temp = temp/10;
			
		}
		System.out.println("sum of the num is "+sum );
		
		
	}
	public static void reverseAnint(int num ) {
		int temp = num ;
		int sum=0;
		while (temp!=0) {
		int r =	temp%10;
		 sum = sum *10+r;
		temp =temp /10;
		
		}
		
		System.out.println("reverse of the number is "+sum );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
	
	
	
	
	
	
	
	
	
	
	
	
	


