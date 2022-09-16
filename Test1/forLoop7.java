package Test1;

public class forLoop7 {
	public static void main(String[] args) {
		String[] a= {"onesoft","bristol","cardiff","fjord","geneva","munich"};
	for (int i=0; i<a.length; i++) {
		char b=a[i].charAt(a[i].length()/2);
		if (b=='a'||b=='e'||b=='i'||b=='o'||b=='u') {
			
			System.out.println(a[i]);
			
		}
		
		
		
	}
	}

}
