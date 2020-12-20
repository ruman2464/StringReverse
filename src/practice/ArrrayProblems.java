package practice;

public class ArrrayProblems {

	public static void main(String[] args) {
		 //pairofArray() ;
		// fizbuzz(100);
		//mostoccured();
		//mostOccured2();
		//pairOfarray();
		// pairofSum();
		 maxinarray();
		 getmin();
		 int ishrak = 7;
		 
	
	}

	

	public static void fizbuzz(int num) {
		for (int i = 1; i <= num; i++) {
			if (i % 3 ==0&&i%5==0) {
				System.out.println(i + " hi,hello");
			} else if (i % 3 == 0) {
				System.out.println(i + " hi");
			} else if (i % 5 == 0 ) {
				System.out.println(i + " hello");
			} else {
				System.out.println(i + " is not divisible by 3 and 5");
			}

		}

	}

	public static void mostoccured() {
		int[] a = { 6, 6, 5, 3, 5, 3, 3, 3 };
		int maxocured = 0;
		int currentOccured = 1;
		int index=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					
					currentOccured++;
				}

			}
			if (currentOccured > maxocured) {
				maxocured = currentOccured;
				index=i;
				
			}
			currentOccured=1;

		}
		System.out.println(a[index]+ " occured"+ maxocured+" times");

	}
	public static void abc(String orig, char word) {
		int count =0;
		for(int i =0;i<orig.length();i++) {
			if(word==orig.charAt(i))
			
		count++;
		}
		System.out.println(count);
		
		
	}
	public static void mostOccured2() {
		int[]a = {1,2,3,4,4,5,4,4,2,2};
		int maxOccured=0;
		int curOccured=1;
		int index=0;
		for( int i =0;i<a.length;i++) {
			for(int j= i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					curOccured++;
				}
				}
			if(curOccured>maxOccured) {
			maxOccured= curOccured;	
			index=a[i];
			}
			curOccured=1;
		}
		System.out.println(index+" occured "+maxOccured+" times");
	
	}
	public static void pairOfarray() {//wrong approach...
		int [] a= {14,342,245,249,222};
		int sum= 500;
		
		for( int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]==sum-a[i]) {
					
				}
				System.out.println("pairs are "+a[i]+","+a[j]);
			}
			
		}
	
	
	}
	public static void pairofSum() {
		int sum=10;
		int a []= {1,2,4,6,3,4};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]+a[i]==sum) {
					System.out.println("the pairs are "+a[i]+","+a[j]);
					
				}
				//if i print here it will give all the pairs of the array.
			}
		}
		
		
	}
	public static void maxinarray() {
		int a[]= {1,2,3,44,24,44,2};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		System.out.println(max);
	}
	public static void getmin() {
		int[] a = {1,0,21,3,22,3,2};
	int min=a[0];
		for(int i = 0;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
		}
	}System.out.println(min);
	
	}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
