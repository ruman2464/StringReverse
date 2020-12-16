package practice;

public class FactorialNumber {

	public static void main(String[] args) {
		//isfactorial (5);
		//facetorial2(5);
		//sumOfNumber();
		fact(7 );
	}
	public static void isfactorial (int num ) {
		
		int fact =1;
		for (int i=num;i>=1; i --) {
			fact= fact * i;
		}
		System.out.println("Factoria of num is "+fact);
		
	}
	  public static void facetorial2(int num) {
		  int factorial= 1;
		  for(int j= num; j>=1 ;j--) {
			  factorial = factorial* j;
		  }
		  
		  System.out.println("factorial of number " + num + " is "+ factorial);
	  }
	  
	  
	  public static void factorial3(int num ) {
		 int fact=1 ;
		  for(int u=num; u >=1; u--) {
			  fact = fact* u ;
		  }
		  System.out.println("factorial of num"+num+" is "+fact);
	  }
	  public static void sumOfNumber() {
		  int sum= 0;
		  for (int i= 1 ; i <=10; i ++) {
			  
			 sum = sum+i;
			  
		  }
		  System.out.println("sum of number 1 to 10 is "+sum);
	  }
	  public static void fact(int num ) {
		 int fact= 1;
		  
		  for( int i = 1; i<= num; i ++) {
			  fact= fact*i;
		  }
		  System.out.println("factorial of num is "+fact);
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

}
