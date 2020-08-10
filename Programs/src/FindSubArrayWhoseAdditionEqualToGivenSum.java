
public class FindSubArrayWhoseAdditionEqualToGivenSum {

	public static void main(String[] args) {
		int totalElement = 5;
		int array[] = {1,2,3,7,5};
		int startIdx = 0;
		int sum = 0;
		int givenSum = 120;
		int j = 0;

		for(;j<totalElement;) {
			if(sum > givenSum) {
				sum = sum - array[startIdx];
				startIdx++;
			}else if(sum == givenSum) {
				break;
			}else {
				sum = sum + array[j++];
			}
		}
		
		if(sum<givenSum) {
			System.out.println("SubArray not found...");
		}else {
			for(int i=startIdx;i<j;i++) {
				System.out.print(array[i]);
			}
			
			System.out.printf("\nPositions from %d to %d",startIdx,(j-1));
		}
	}

}
