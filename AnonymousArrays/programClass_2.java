package AnonymousArrays;

public class programClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		programClass_2.sum(new int[][] {{10,20,30},{40,50}});

	}
	
	static void sum(int[][] x) {
		
		int sum = 0;
		for(int i[]:x) {
			for(int j:i) {
				sum = sum+j;
			}
			System.out.println(sum);
		
	}
		
	}

}
