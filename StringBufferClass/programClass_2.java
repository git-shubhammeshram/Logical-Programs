package StringBufferClass;

public class programClass_2 {
	
	public static void main(String[] args) {
		
		StringBuffer x = new StringBuffer("Shubham");
		StringBuffer z = new StringBuffer("Shubham");
		StringBuffer y = new StringBuffer("Meshram");

		
		
		System.out.println(x.length());
		
		x.append("Meshram");
		System.out.println(x);
		
		System.out.println(x.charAt(7));
		
		System.out.println(x.delete(7, 13));
		System.out.println(x.deleteCharAt(7));
		
		System.err.println(x.equals(z));
		
		System.out.println(x.indexOf("b"));
		System.out.println(x.lastIndexOf("h"));
		
		y.insert(0, "Shubham");
		System.out.println(y);
		
		y.replace(0, 7, "Komal");
		System.out.println(y);
		
//		System.out.println(y.reverse());
		
		System.out.println(y.subSequence(1, 3));
		System.out.println(y);
		
		System.out.println(y.substring(5));
						
		
		
		
		
		
	}

}
