package Test1;

public class Answer {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int total=0;
		 int count=0;
		for (int i=0; i<a.length; i++) {
			total=a[i]+total;
			//avg=total/a.length;
			count=count+1;
		}
		System.out.println(total);
		System.out.println(total/count);
		
			
			
			
		}
		
	}


