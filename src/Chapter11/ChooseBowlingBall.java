package Chapter11;

import java.util.Scanner;

public class ChooseBowlingBall {
	
	public static int choose(int[] arr) {
		int count = 0;
		for(int i=0 ; i<arr.length-1 ; i++)
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[i] != arr[j])
					count++;
			}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {1,3,2,3,2};
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int max = scan.nextInt();
		int[] arr = new int[num];
		for(int i=0 ; i<num ; i++)
			arr[i] = scan.nextInt(); 
		scan.close();
		System.out.println(choose(arr));
	}

}
