package practice;

public class PrimeNumber {//prime numbers are the number grater than 1 and which are divisible by 1 or by the number itself only.
	public static void main(String[] args) {
		//factorial(4);
		isPrime(3);
	
	
	}



	
	public static void factorial(int num) {//factorial
	int n=1;
	for(int i=1;i<=num;i++) {
		n= n*i;
	}
	System.out.println("factorial number of num is :"+n);
	

	}
	
	
	
	public static void isPrime(int num) {
		
	if(num>1) {
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				num++;
			}
		}
		
	}else {
		System.out.println(num+":This is not prime number ");
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	



}
	
	






