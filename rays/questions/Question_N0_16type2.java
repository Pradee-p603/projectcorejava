package in.co.rays.questions;

public class Question_N0_16type2 {
	public static void main(String[] args) {
		
	
	  int temp;
      int array[] = {100, 20, 265, 163, 96, 57};
      //size = array.length;

      for(int i = 0; i<array.length; i++ ){
         for(int j = i+1; j<array.length; j++){

            if(array[i]>array[j]){
               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
         }
      }
      System.out.println(" second largest number is:: "+array[(array.length)-2]);
   }
}

