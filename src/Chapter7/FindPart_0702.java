package Chapter7;

import java.util.*;

public class FindPart_0702 {

	// 찾을 배열 arr, start/end사이의 중간값으로 계속 찾다가, 범위를 반씩 계속 줄여나가며 target값을 찾기
	public static int binarySearch(int[] arr, int start, int end, int target) {
		if(start > end)
			return 0;
		int mid = (start + end) / 2;
		if(arr[mid] == target)
			return 1;
		else if(arr[mid] > target)
			return binarySearch(arr, start, mid - 1, target);
		else
			return binarySearch(arr, mid + 1, end, target);
	}
	// 놓친 부분 -> 맨 처음 if문에서 mid값을 비교하니까, 다음 재귀호출할때 mid값은 제외하고 호출하면 되는데,
	// 그냥 다 넣어서 호출해서 다른 코드가 또 추가되서 비효율적.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] partNum = new int[n];		// 가지고 있는 부품 번호
		for(int i = 0 ; i < n ; i++)
			partNum[i] = scan.nextInt();
		int m = scan.nextInt();
		int[] checkNum = new int[m];	// 있는지 확인 할 부품 번호
		for(int i = 0 ; i < m ; i++)
			checkNum[i] = scan.nextInt();
		// 먼저 sort하는 이유는 찾는 함수를 들어가서 sort하면 sort하는 게 반복적으로 사용되니 비효율적이다.
		Arrays.sort(partNum);
		for(int i = 0 ; i < m ; i++) {
			if(binarySearch(partNum, 0, n-1, checkNum[i]) == 1)
				System.out.print("yes ");
			else 
				System.out.print("no ");
		}
		
//		계수 정렬을 이용한 풀이
//		int[] partNum2 = new int[1000001];
//		int n2 = scan.nextInt();
//		int x;
//		while(n2 > 0) {
//			x = scan.nextInt();
//			partNum2[x] = 1; 
//			n2--;
//		}
//		int m2 = scan.nextInt();
//		int[] checkNum2 = new int[m2];
//		for(int i = 0 ; i < m2 ; i++)
//			checkNum2[i] = scan.nextInt();
//		
//		for(int e : checkNum2) {
//			if(partNum2[e] == 1)
//				System.out.print("yes ");
//			else 
//				System.out.print("no ");
//		}
		scan.close();
		// 이렇게 한 개씩 찾지말고 한꺼번에 찾는 법은 없을까
	}

}

//5
//8 3 7 9 2
//2 3 7 8 9 -> sort
//3
//5 7 9