
public class MissingElement {
	public static void main(String[] args) {
		int arraySize = 10;
		int array[] = {1, 2 ,3, 4, 5, 6, 7, 8, 10};
		
		int additionOfNNaturalNum = (arraySize * (arraySize+1))/2;
		
		int sum = 0;
		for(int i : array) {
			sum += i;
		}
		
		System.out.printf("Missing number %d",(additionOfNNaturalNum - sum));
	}
}
