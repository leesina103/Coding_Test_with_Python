package Chapter11;

import java.util.Arrays;
import java.util.Scanner;

public class CantMake {
	
	public static int cantMake(int[] arr) {
		Arrays.sort(arr);
		int target = 1;
		for(int i : arr) {
			if(target < i)
				break;
			target += i;
		}
		return target;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {3,2,1,1,9};
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] arr = new int[num];
		for(int i=0 ; i<num ; i++)
			arr[i] = scan.nextInt(); 
		scan.close();
		System.out.println(cantMake(arr));
	}

}
