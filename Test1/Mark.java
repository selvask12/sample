package Test1;

public class Mark {
	public static void main(String[] args) {
		int mark =110;
		
		
		 if (mark>=90&&mark<100) {
			System.out.println("A");
		}
		else if (mark>80&&mark<90) {
			System.out.println("B");
		}
		else if (mark>70&&mark<=80) {
			System.out.println("c");
		}
		else if (mark>60&&mark<=70) {
			System.out.println("D");
		}
		else {
			System.out.println("fail");
			
		}
	}

}
