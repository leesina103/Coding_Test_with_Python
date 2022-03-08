// 이진 탐색
package Chapter7;

public class binarySearch_ex_0701 {

	// 재귀 함수를 이용한 코드
	public static int binarySearch3(int start, int n, int[] arr, int x) {
		if(start > n)
			return 0;
		int mid = (start + n) / 2;
		if(arr[mid] == x)
			return mid;
		else if(arr[mid] > x)
			return binarySearch3(start, mid - 1, arr, x);
		else 
			return binarySearch3(mid + 1, n, arr, x);
	}
	
	// 반복문을 이용한 코드
	public static int binarySearch(int n, int[] arr, int x) {
		int start = 0;
		int end = n;
		while(start <= end) {
			int mid = (start + end) / 2;
			if(arr[mid] == x)
				return mid;
			else if(arr[mid] > x)
				end = mid - 1;
			else 
				start = mid + 1;
		}
		return 0;
	}
	
	// 수업자료 코드
	public static int binarySearch2(int n, int[] arr, int x) {
		int low = 1;
		int high = n;
		int location = 0;
		while(low <= high && location == 0) {
//			왜 floor함수가 적용이 안되지?
//			Math.floor() -> 입력된 값보다 작거나 같은 가장 큰 정수 값을 double 형으로 반환
//			ex) double d1 = -10.675;  	Math.floor(d1) -> 11.0;
//			근데 여기서 굳이 floor 함수를 써줄 필요가 있을까? 어차피 나머지는 없어지는데
//			int mid = Math.floor((low + high) / 2);
			int mid = (low + high) / 2;
			if(x == arr[mid])
				location = mid;
			else if(x < arr[mid])
				high = mid - 1;
			else 
				low = mid + 1;
		}
		return location;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 5, 7, 8, 10, 11, 13};
		System.out.println(binarySearch(6, arr, 8));
		System.out.println(binarySearch3(0, 6, arr, 8));
	}

}

//10 7 11 5 13 8
//5 7 8 10 11 13
//1 2 3 4 5 6