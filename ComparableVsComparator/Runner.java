package ComparableVsComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Laptop> laps = new ArrayList<>();
		
		laps.add(new Laptop("Apple", 16, 124000));
		laps.add(new Laptop("HP", 4, 58000));
		laps.add(new Laptop("Lenovo", 3, 35000));
		laps.add(new Laptop("Realme", 8, 54000));
		
		Comparator<Laptop> cm = new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				
			if(o1.getPrice()>o2.getPrice()) {
				
				return 1;
			}
			else {
				return -1;
			}
			
			}
			
		};
		
//		Collections.sort(laps); 
		Collections.sort(laps,cm);
		
		for(Laptop l:laps) {
			System.out.println(l );
		}

	}

}
