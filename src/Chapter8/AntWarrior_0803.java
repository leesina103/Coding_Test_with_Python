package Chapter8;

import java.util.*;

public class AntWarrior_0803 {

	public static int[] cache = new int[100];
	
	public static int maxFood(int[] arr, int n) {
		if(n == 0)
			return arr[0];
		if(n == 1)
			return Math.max(arr[0], arr[1]);
		return cache[n] = Math.max(maxFood(arr, n-1), maxFood(arr, n-2) + arr[n]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++)
			arr[i] = scan.nextInt(); 
		System.out.println(maxFood(arr, n-1));
		scan.close();
	}

}

//4
//1 3 1 5