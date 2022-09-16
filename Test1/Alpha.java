package Test1;

public class Alpha {
	public static void main(String[] args) {
		String plate="TN07CH0403";
		String a="";
		String b="";
		String c="";
		
		for (int i=0; i<plate.length(); i++) {
			if (plate.charAt(i)>='0' && plate.charAt(i)<='9') {
				a=a+plate.charAt(i);
			}
			else if (plate.charAt(i)>='A'&&plate.charAt(i)<='Z') {
				b=b+plate.charAt(i);	
			}
			else if (plate.charAt(i)>='a'&&plate.charAt(i)<='z') {
				c=c+plate.charAt(i);
			}
		}
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		
	}
}
		
	
			
		
		
	


