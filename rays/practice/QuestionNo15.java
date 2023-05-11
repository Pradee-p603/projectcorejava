package in.co.rays.practice;
   //largest number of array
public class QuestionNo15 {
	public static void main(String[] args) {
		int a[] = {10, 11,12,34,54,23};
		int largest = a[0];
		for(int i = 1; i<a.length; i++) {
			if(a[i]>largest) {
				largest = a[i];
			}
		}
		System.out.println("largest element array is  "  + largest);
	}

}
