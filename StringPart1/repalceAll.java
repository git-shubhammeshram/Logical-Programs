package StringPart1;

public class repalceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentc = "India  was was my country";
		System.out.println(sentc.replaceAll("was", "is"));
		System.out.println(sentc.replaceAll("was(.)", "is"));
		System.out.println(sentc.replaceAll("was(.*)", "is"));




	}

}
