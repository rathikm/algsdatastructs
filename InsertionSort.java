
public class InsertionSort {
	public int[] sort(int[] input) {
		int key;
		int[] output = new int[input.length];
		for (int j = 1; j < input.length; j++) {
			key = input[j];
			int i = j - 1; 
			while ((i >= 0) && (input[i] > key)) {
				input[i + 1] = input[i];
				i--;
			}
			input[i + 1] = key;
		}
		
		return input;
	}
	
	public static void main(String[] args) {
		InsertionSort ins = new InsertionSort();
		int[] output = ins.sort(new int[]{5,2,4,6,1,3});
		for (int i:output){
			System.out.println(i);
		}
	}
}
