
public class ReverseStringWordWise {

	public static void main(String[] args) {
		String s = "i like this program very much";
		
		int length = s.length();
		char[] chars = s.toCharArray();
		
		int count = 0;
		int start = 0;
		char delimiter = ' ';
		int delimiterIdx = -1;
		int i = 0;
		
		while( count < length) {
			if(chars[count] == delimiter) {
				delimiterIdx = count;
				i = delimiterIdx;
			}else if(count == (length - 1)) {
				delimiterIdx = count+1;
				i = delimiterIdx;
			}

			int endV = start+(delimiterIdx-start)/2;
			while(start < endV) {
				  char temp = chars[start];
				  chars[start++] = chars[--i]; 
				  chars[i] = temp;
				 
			}
			
			start = delimiterIdx+1;
			
			count++;
		}
		System.out.println(new String(chars));
		while((length) > 0)
			System.out.print(chars[--length]);
	}

}
