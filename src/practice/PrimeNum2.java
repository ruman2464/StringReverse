package practice;

public class PrimeNum2 {

	public static void main(String[] args) {

		//System.out.println(primeNum(3));

		// System.out.println(prime2(3));
		System.out.println(prime3(5 ));

	}

	public static boolean primeNum(int num) {
		if (num <= 1) {
			System.out.println("not prime num");
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("not prime num");
				return false;
			}

		}
		System.out.println("prime num");
		return true;

	}

	public static boolean prime2(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		return true;

	}
	
	
	public static boolean prime3(int num ) {
		
	if(num<=1) {
		return false;
	}
	for(int i= 2; i<num; i++) {
		if(num%i==0) {
			return false;
		}
	}
	return true;
	
	}
	


}
