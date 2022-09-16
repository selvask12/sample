package Test1;

public class ForLoop5 {
	public static void main(String[] args) {
		int [] marks= {97,96,94,99,94};
		int max=0;
		for (int i=0; i<marks.length ; i++) {
			if (marks[i]>max) {
				max=marks[i];
				
			}
		}
			System.out.println(max);
		}
		
	}


