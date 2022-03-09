package Chapter15;

import java.util.*;

public class FixedPoint_1528 {

	// index와 값이 동일한 원소 == 고정점
	// index가 값보다 크다면, 오른쪽 탐색 (ex) [2] = 1이면, 오른쪽
	public static int binaryFixedSearch(int n, int[] arr) {
		int start = 0;
		int end = n - 1;
		while(start <= end) {
			int mid = (start + end) / 2;
			if(mid == arr[mid])
				return mid;
			else if(mid > arr[mid])
				start = mid + 1;
			else 
				end = mid - 1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();		//원소의 개수
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++)
			arr[i] = scan.nextInt();
		System.out.println(binaryFixedSearch(n, arr));
		scan.close();
	}

}

//5
//-15 -6 1 3 7

//7
//-15 -4 2 8 9 13 15

//7
//-15 -4 3 8 9 13 15