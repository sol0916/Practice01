package programers;

public class Pro120836 {

	public static void main(String[] args) {
		
		int n = 100;

		int start = 1;
		int end = n;
				
		int result = 0;
		
		while(start<=n) {
			if(start*end<n) {
				start++;
			} else if(start*end>n) {
				end--;
			} else {
				result++;
				start++;
				end--;
			}
		}
		
		System.out.println(result);
	}

}
