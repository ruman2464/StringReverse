package practice;

public class RverseWords {

	public static void main(String[] args) {
		//reverseword();
		
		revString2() ;
		
	}
	public static void reverseword() {
		String s= "WELCOME TO JAVA";
		String[] words=s.split(" ");
	String revString="";
		for(String w:words) {
			String revWord=" ";
		for(int i=w.length()-1;i>=0;i--) {
			revWord=revWord+w.charAt(i);
		}
		revString=revString+revWord+" ";
		
	}
		System.out.println(revString);
	}
	
	
	
	public static void revString2() {
		String orig = "I Love Java";
		String []words=orig.split("");
		String revString="";
		for(String w:words) {
			String revWords="";
			for(int i=w.length()-1;i>=0;i--) {
				
				revWords =revWords+w.charAt(i);
				
			}
			revString=revString+revWords+"";
			
		}
		
		System.out.println(revString);
	}



}