package practice;

public class ReverseAString {

	public static void main(String[] args) {
		//reverse();
		//reverse2();
		stringeverese();
		//reverseStringBuffer ();
	}
	
	
	public static void reverse() {
		String i = "bangal";
		for(int j=i.length()-1;j>=0;j--) {
			System.out.print(i.charAt(j));
			
		}
		}

	public static void reverse2() {
		String o = "Selenium";
		String rev="";
			for(int i= o.length()-1;i>=0;i--)	{
				rev= rev+o.charAt(i);
				//System.out.println(rev);
			}
			System.out.println(rev);
	}
	public static void stringeverese() {
		String orig = "This is Yahia sayeed";
	String replace=orig.replaceAll(" ", "");
	//System.out.println(replace);
	String revWord="";
		char[]words=replace.toCharArray();
	for(int i=replace.length()-1;i>=0;i--) {
		orig.charAt(i);
	revWord= revWord+replace.charAt(i);
	}
	System.out.println(revWord);
	
	}
	public static void reverseStringBuffer () {
		
	String s="I love programming ";
	StringBuffer sb= new StringBuffer(s);
	sb.reverse();
String b=	sb.toString();
	System.out.println(b);
	String replace="";
	String c=b.replaceAll(" ", "");
	System.out.println(c);
	}
	

	



}
