package Chapter11;

import java.util.Arrays;
import java.util.Scanner;

public class AdventurerGuild {
	
	// 5
	// 2 3 1 2 2
	// 1 2 / 2 2 3
	public static int maxGroup(int[] arr) {
		Arrays.sort(arr);
		int arrlen = arr.length;
		int groupCount = 0;
		int scared = arr[arrlen-1];		// 가장 높은 공포도를 가진 사람
		
		while(true) {
			arrlen -= scared;	
			groupCount++;		
			if(arrlen <=0)
				break;
			scared = arr[arrlen-1];
		}
		return groupCount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int[] arr = new int[len];
		for(int i=0 ; i<len ; i++)
			arr[i] = scan.nextInt();
		scan.close();
		System.out.println(maxGroup(arr));
		
//		int[] a = {2,3,1,2,2};
//		int[] b = {2,1,2,2,2,3,3,4};
//		System.out.println(maxGroup(a));
//		System.out.println(maxGroup(b));
	}

}
