package practice;

public class Duplicate {

	public static void main(String[] args) {
		//duplicateElements();
		//duplicate2();
		//duplicate3();
		//duplicateelement3();
		 dupliatewords(); 
	}

	public static void duplicateElements() {

		String[] names = { "java", "javaScript", "ruby", "java","javaScript" };
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i] == names[j]) {
					System.out.println("duplicate elements is :" + names[i]);
				}
			}
		}

	}
	
	
	public static void duplicate2() {
		String k= "Banggladesh";
		
		char[] word=k.toCharArray();
	for(int i=0;i<word.length;i++) {
		for(int m=i+1;m<word.length;m++) {
			if(word[i]==word[m]) 
				System.out.println("duplicate "+word[i]);
			}
		}
	}
	public static void duplicate3() {
		String orig="sayeed";
		orig.split("");
		char[] words=orig.toCharArray();
		for(int i=0;i<orig.length();i++) {
			for(int j=i+1;j<orig.length();j++) {
				if(words[i]==words[j])
					System.out.println("Duplicate character is "+words[i]);
			
			}
		}
		
		
	}
	
	
	public static void duplicateelement3() {
		String orig = "This is Yahia Sayeed";
		//int len =orig.length();
		
		char[] word=orig.toCharArray();
	for(int i=0; i< orig.length();i++) {
		{
			
		}
		for(int j= i+1;j<orig.length();j++) {
			if(word[i]==word[j]) {
				System.out.println("Duplicate element is "+word[j]);
			
			
			}
		}
	}
	
	}
	public static void dupliatewords() {
		String[]words= {"java","java","c","javascript","javascript"};
	
		for(int i= 0;i<words.length;i ++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])){
					System.out.println("Duplicate word is :"+words[i]);
				}
			}
		}
	
	
	
	
	
	
	}
	
	
	
	
	
	
	}


