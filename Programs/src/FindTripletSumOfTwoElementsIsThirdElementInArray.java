import java.util.List;
import java.util.TreeSet;

public class FindTripletSumOfTwoElementsIsThirdElementInArray {
	public static void main(String[] args) {
		int array[] = {1,5,3,2};
		TreeSet<Integer> sorted = new TreeSet(List.of(3,2,5));
		
		for(Integer element: sorted) {
			int tot = (element % 2 == 0) ?  element / 2 -1 : element / 2;
			
			int i =1;
			while ( tot-- >= 1) {			
				if(sorted.contains(element-i) && sorted.contains(i)) {
					System.out.printf("Pair (%d,%d) addition of %d\n",(element-i),i,element);
				}
				i++;
			}
		}
	}
}
