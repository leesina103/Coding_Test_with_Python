package Chapter7;

import java.util.*;

public class Tokbboki_0703 {

	// 최댓값 저장 -> 요청한 떡의 길이가 정확히 맞아떨어질 수 없을 수도 있으므로, 따로 저장해놓기 (안해놓으면 값을 내놓을 수 없음)
	public static int result;
	
	// 주어진 배열에서 value의 값으로 떡 자르기
	public static int cutter(int[] arr, int value) {
		int result = 0;
		for(int e : arr) 
			if(e > value)
				result += e - value;
		return result;
	}
	
	// start, end가 15 16이면 mid가 15로 무한루프 되기때문에, 메모이제이션을 활용하여 방지해주기
	// 애초에 값으로 줘버랴
	public static int maxHeight(int[] arr, int startValue, int endValue, int target) {
		if(startValue > endValue)
			return result;
		int midValue = (startValue + endValue) / 2;
		int height = cutter(arr, midValue);
		if(height == target)
			return midValue;
		else if(height > target) {
			result = midValue;
			return maxHeight(arr, midValue + 1, endValue, target);
		}
		else 
			return maxHeight(arr, startValue, midValue - 1, target);
	}
	// target = 6
	// 10 15 17 19
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();		// target값
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++)
			arr[i] = scan.nextInt();
		Arrays.sort(arr);
		System.out.println(maxHeight(arr, 0, arr[n-1], m));
		scan.close();
	}

}

//4 6
//19 15 10 17