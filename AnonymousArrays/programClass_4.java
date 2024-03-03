package AnonymousArrays;

public class programClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][][] x = {{{10,20,30},{40,50},{60,70,80}}};
		
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x[i].length; j++) {
				for(int k=0; k<x[i][j].length; k++) {
					System.out.print(x[i][j][k]);
				}
			}

		}
		System.out.println();


	}

}
