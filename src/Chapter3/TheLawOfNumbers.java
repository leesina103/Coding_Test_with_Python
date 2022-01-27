package Chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class TheLawOfNumbers {
	
	// 5 8 3
	// 2 4 5 4 6
	
//	public static int maxSum(int[] arr, int countnum , int maxt) {
//		//최대값이 여러개 일 수 있으므로, arr과 길이가 같은 배열을 만들어서 최대값의 index를 1로 저장
//		//맨 처음 값으로 max를 설정했으니, 중복값이 있으면 계속 1로 저장하다가 max값이 바뀌면 다시 리셋
//		int sum = 0;
//		int max1, max2;		//max1이 가장 큰 수, max2는 두번째로 큰 수(같아도 상관 없음)
//		if(arr[0] > arr[1]) {
//			max1 = arr[0];
//			max2 = arr[1];
//		}
//		else {
//			max1 = arr[1];
//			max2 = arr[0];
//		}
//		
//		// 2 8 3
//		// 3 5		배열의 길이가 2일때, 5+5+5+3 +5+5+5+3
//		
//		//최대값 2개 찾기
//		// i=2부터하면 길이가 2일때 index out of range 에러 뜰 수도 있으니 i=0부터
//		for(int i=0 ; i<arr.length ; i++) {
//			if(max1 < arr[i]) {
//				max2 = max1;
//				max1 = arr[i];
//			}
//			else if(max2 < arr[i] && arr[i] <= max1 )
//				max2 = arr[i];
//		}
//		
//		int maxtcopy = maxt;
//		while(countnum != 0) {
//			sum += max1;
//			maxt--;
//			countnum--;
//			if (maxt==0) {
//				countnum--;
//				sum += max2;
//				maxt = maxtcopy;
//			}
//		}
//		return sum;
//	}
	
	//점화식을 사용해 푸는 법
	//제일 큰 수 3번, 2번째로 큰 수 1번이 계속 반복되므로, 점화식을 이용해 풀기 ex) 6 6 6 5 / 6 6 6 5 반복
	public static int easyMaxSum(int[] arr, int countnum, int maxt) {
		Arrays.sort(arr);
		int arrlen = arr.length;
		int max1 = arr[arrlen-1];
		int max2 = arr[arrlen-2];
		
		int repeat = countnum / (maxt+1);	// 반복구간의 반복횟수
		int partSum = max1*3 + max2;		// 한 반복구간의 합
		int leftNum = countnum % (maxt+1);	// 나머지숫자의 개수
		int left = leftNum * max1;			// 반복구간에 포함되지 않는 나머지의 합
		
		return (repeat * partSum) + left;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int arrsize = scan.nextInt();
		int countnum = scan.nextInt();
		int maxt = scan.nextInt();
		int[] arr = new int[arrsize];
		for(int i=0 ; i<arrsize; i++) {
			arr[i] = scan.nextInt();
		}
		
		scan.close();
//		System.out.println(maxSum(arr, countnum, maxt));
		System.out.println(easyMaxSum(arr, countnum, maxt));
	}

}
