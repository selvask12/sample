package Test1;

public class Add {
	public static void main(String[] args) {
		int a=4;
		int b=4;
		String c="add";
		switch (c) {
			case "add": System.out.println(a+b);
			break;
			case "sub": System.out.println(a-b);
			break;
			case "multiple": System.out.println(a*b);
			break;
			case "divide": System.out.println(a%b);
			break;
			default: System.out.println("invalid");
			
		}
	}

}
