package practice;

public class MyPracticeOfAllMethod {

	public static void main(String[] args) {
		// revAString();
		// revAInt(543);
		// isPalindromeNum(111);
		// IsPalindromeString( "madm");
		// isPrime(5) ;
		// findFactorial(5);
		// fabonacciNum(5);
		// armstrongNUm(3);
		// sumOfNUm(657);
		// removerGarbageFromString() ;
		// duplicate();
		// swapNumUsingThirdVAriable();
		// swap();
		// swapString();
		// missingNumOfarry();
		// printPyramid();
		// duplicateNum();
		// missingNumInArray();
		// duplicateNumInArray() ;
		// duplicateNum();
		//givenArraySum();

	}

	public static void revAString() {
		String name = "My name is Miju";
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
	}

	public static void revAInt(int num) {
		int temp = num;
		int reverse = 0;
		while (temp != 0) {
			int r = temp % 10;
			reverse = reverse * 10 + r;
			temp = temp / 10;
		}
		System.out.println("reverse of the num is " + reverse);

	}

	public static void isPalindromeNum(int num) {
		int temp = num;
		int reverse = 0;
		while (temp != 0) {
			int r = temp % 10;
			reverse = reverse * 10 + r;
			temp = temp / 10;
		}
		if (num == reverse) {
			System.out.println("this is a palindrome num ");
		} else {
			System.out.println("this is not a palindrome ");
		}
	}

	public static void IsPalindromeString(String name) {
		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		if (name.equals(rev)) {
			System.out.println("This ia a palindrome String");
		} else {
			System.out.println("This is not a palindrome String");
		}

	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("The num is not a prime number ");
				return false;
			}
		}
		System.out.println("this is a prime num");
		return true;
	}

	public static void findFactorial(int num) {
		int fact = 1;
		for (int i = num; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial of the given num is " + fact);
	}

	public static void fabonacciNum(int num) {
		int first = 0;
		int second = 1;
		int fabo = first + second;
		for (int i = 0; i <= num; i++) {
			fabo = first + second;
			System.out.println("fabonacci num is " + fabo);
			first = second;
			second = fabo;
		}
	}

	public static void armstrongNUm(int num) {
		int temp = num;
		int arms = 0;
		while (temp != 0) {
			int r = temp % 10;
			arms = arms * 10 + r * r * r;
			temp = temp / 10;
		}
		System.out.println("amrstrong num is " + arms);

	}

	public static void sumOfNUm(int num) {
		int temp = num;
		int sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = sum + r;
			temp = temp / 10;

		}
		System.out.println("sum of the num is " + sum);
	}

	public static void removerGarbageFromString() {
		String s = "71312332###$#%#%%I AM miju%%%";
		s = s.replaceAll("[^a-zA-z]", "");
		System.out.println(s);
	}

	public static void duplicate() {
		String orig = "my name is mmmmiju";
		char[] words = orig.toCharArray();
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i] == words[j]) {
					System.out.println("duplicate word is " + words[i]);
				}
			}
		}
	}

	public static void swapNumUsingThirdVAriable() {
		int x = 3;
		int y = 5;
		int t;// 3
		t = x;// t=5
		x = y;// x=5
		y = t;
		System.out.println(x);
		System.out.println(y);

	}

	public static void swap() {
		int f = 5;
		int g = 6;
		f = f + g;// f 11
		g = f - g;// g=5
		f = f - g;
		System.out.println(f);
		System.out.println(g);
	}

	public static void swapString() {
		String a = "Hello";
		String b = "World";
		a = a + b;// hellowordsd
		System.out.println(a);

		b = a.substring(0, a.length() - b.length());// hello
		a = a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
	}

	public static void missingNumOfarry() {
		int[] number = { 1, 2, 3, 4, 6, 7 };
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			sum = sum + number[i];

		}
		System.out.println(sum);
		int sum1 = 0;
		for (int j = 1; j <= 7; j++) {
			sum1 = sum1 + j;
		}
		System.out.println(sum1);
		System.out.println(sum1 - sum);
	}

	public static void printPyramid() {

		for (int i = 1; i <= 4; i++) {

			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void duplicateNum() {
		int[] num = { 1, 2, 3, 4, 4, 5 };

		for (int i = 0; i < num.length; i++) {
			for (int k = i + 1; k < num.length; k++) {
				if (num[i] == num[k]) {
					System.out.println("duplicate array is" + num[i]);

				}
			}
		}
	}

	public static void missingNumInArray() {
		int[] a = { 1, 2, 3, 5 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
		int sum1 = 0;
		for (int j = 1; j <= 5; j++) {
			sum1 = sum1 + j;
		}
		System.out.println(sum1);
		System.out.println(sum1 - sum);
	}

	public static void duplicateNumInArray() {
		int[] a = { 1, 2, 2, 3, 3, 4, 5, 6 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("Duplicate num in the array is " + a[i]);
				}
			}
		}
	}

	public static void sumOfArrays(int[] a) {
		int[] err = new int[a.length];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			err[i] = a[i];
		}

	}

//	public static void givenArraySum() {
//		int[] array = { 100, 200, 300, 40, 50 };
//		int sum = 500;
//		for (int i = 0; i < array.length; i++) {
//			for (int j = i + 1; j < array.length; j++) {
//				if (array[j] == sum - array[i]) {
//					// System.out.println("pairs are "+a[i]+","+a[j]);
//					System.out.println(array[i] + "," + array[j]);
//				} else {
//					System.out.println("no pair found");
//
//				}
//			}
//		}
//	}

}
