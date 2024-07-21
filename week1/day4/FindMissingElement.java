package week1.day4;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] num= {1,4,3,2,8,6,7}; 
		Arrays.sort(num); //  int[] num= {1,2,3,4,6,7,8}; 
		for(int i = 0; i < num.length-1; i++) {		
			int k =	num[i+1] - num[i];			
			if(k > 1){
				for(int j = 1; j <= (k-1) ; j++) 
				System.out.println(num[i] + j +"");
				break;
		}

	}
  }
}