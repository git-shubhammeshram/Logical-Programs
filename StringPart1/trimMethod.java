package StringPart1;

public class trimMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "   ";
		
		System.out.println(name);
		System.out.println(name.trim());
		
		int i = name.length();
		if (name.trim().length()==0) {
			
			System.out.println("Name is empty");
			
		}
		else {
			System.out.println("Valid name");
		}
		

	}

}
