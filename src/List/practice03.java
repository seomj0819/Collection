package List;

import java.util.ArrayList;
import java.util.Scanner;

public class practice03 {
	public static void main(String[] args) {
		//3조 1번
		//		Scanner sc = new Scanner(System.in);
		//		int N = sc.nextInt();
		//		int[] arr = new int[N];
		//		for(int i=0;i<N;i++) {
		//			arr[i] = sc.nextInt();	
		//		}
		//		int min = arr[0];
		//		
		//		for(int i=1;i<arr.length;i++) {
		//			if(arr[i]<min) min =arr[i];
		//		}
		//		
		//		int max = arr[0];
		//		
		//		for(int i=1;i<arr.length;i++) {
		//			if(arr[i]>max) max = arr[i];
		//				
		//			
		//		}
		//		System.out.println(min+" "+max);


		int[] lotto = new int[6];

		for(int i = 0; i < lotto.length; i++) {
			int random = (int)(Math.random()*45+1);
			lotto[i] = random;

			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--; 
				}
			}
		}
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();

		int temp = 0;   
		for(int i = 0; i < lotto.length; i++) {

			for(int j = 0; j < lotto.length; j++) {
				if(lotto[i] < lotto[j]) { //오름차순
					temp = lotto[i];   

					lotto[i] = lotto[j];   

					lotto[j] = temp;   
				}
			}
		}
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
