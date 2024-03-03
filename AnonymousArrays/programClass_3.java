package AnonymousArrays;

public class programClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		programClass_3.add(new int[][][] {{{10,20,30},{40,50},{60,70,80}}});	

	}
	static void add(int[][][]x) {
		
		int sum = 0;
		for(int i[][]:x) {
			for(int[] j:i) {
				for(int k:j) {
					sum = sum + k;
				}
				System.out.println(sum);
				
			}
		}
		
	}

}
