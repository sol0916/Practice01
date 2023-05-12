package practice02;

public class Array02Ex {

	public static void main(String[] args) {
		
		int[][] javaScores = {{10, 20, 30}, {40, 50}};
		
		for(int i=0; i<javaScores.length; i++) {
			for(int k=0; k<javaScores[i].length; k++) {
				System.out.println("javaScores["+i+"]["+k+"]="+javaScores[i][k]);
			}
			
		}
		
		int[][] sample = new int[3][];
		sample[0] = new int[3];
		sample[1] = new int[2];
		sample[2] = new int[3];
		
		for(int i=0; i<sample.length; i++) {
			for(int k=0; k<sample[i].length; k++) {
				System.out.println("sample["+i+"]["+k+"]="+sample);
			}
		}

	}

}
