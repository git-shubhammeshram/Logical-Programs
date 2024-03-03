package StringPart1;

public class equalsMethod {
	public static void main(String[] args) {
		
		String name = "Shubham";
		String name2 = "Shubham";
		
		System.out.println(name.equals(name2));
		
		if (name.equals(name2)) {
			System.out.println("Same String");
		}
		else {
			System.out.println("Diff String");
		}
	}

}
