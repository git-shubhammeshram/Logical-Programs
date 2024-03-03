package AnonymousArrays;

public class ProgramClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProgramClass.sum(new int[]{10,20,30});
		
	}
	
	static void sum(int[] x) {
		
		int sum=0;
		for(int i:x) {
			sum = sum+i;
		}
		System.out.println("Total - "+sum);
		
	}

}
