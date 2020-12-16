package practice;

public class MyCodingPrcticeEverything {

	public static void main(String[] args) {
		//strigrev ();
		// reversEachwords() ;
		// reversEachwords();
		// revWordsWithStringBUilder() ;
		//isprime (0);
		sumofdigit(456);
		}
	public static void strigrev () {
		String s = "My name is Miju ";
		String rev="";
		char[]words =s.toCharArray();
	for( int i=words.length-1;i>=0;i--) {
		s.charAt(i);
		rev=rev+s.charAt(i);
		
	}
	System.out.println(rev);
	}
	public static void reversEachwords() {
		String str= "My name is Miju";
		String [] words=str.split(" ");
		String revString ="";
		for(String w:words) {
			String revwords="";
		for(int i=w.length()-1;i>=0;i--) {
			revwords=revwords+w.charAt(i);
		}
		revString=revString+revwords+" ";
		}
		System.out.println(revString);
			
	}
		public static void revWordsWithStringBUilder() {
			String s = "my name is Miju";
		String revWords="";
			String []words=s.split(" ");
		for(String w:words) {
			
			StringBuffer sb = new StringBuffer(w);
			sb.reverse();
		revWords= revWords+sb.toString()+" ";
		}
		System.out.println(revWords);
		}
		
		public static boolean isprime (int num) {
			if (num<=1) {
				System.out.println(num+"this is not a prime number");
				return false;
			}
			for( int i =2;i<num;i++) {
				if(num%i==0) {
					System.out.println(num+"this is not a prime number");
				return false;
				}
			}
			System.out.println(num+"this is prime num ");
				return true;
			
		
		}
		
		public static void sumofdigit(int num) {
			int temp = num;
			int sum= 0;
			while (temp!=0) {
				int r = temp%10;
				 sum = sum+r;
				 temp=temp/10;
			}
			System.out.println(sum);
		}







}
