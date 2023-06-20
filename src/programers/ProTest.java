package programers;

public class ProTest {
	public static void main(String[] args) {
		
		int[] num_list = {4, 2, 6, 1, 7, 6};
		
		int even = 0;
		int odd = 0;
		
		for(int i=0; i<num_list.length; i++) {
			
			if(i%2==0) {
				odd += num_list[i];
			} else {
				even += num_list[i];
			}						
		}
		
		int answer = odd>even ? odd : even;
		
		System.out.println(answer);
		
		
	}

}
