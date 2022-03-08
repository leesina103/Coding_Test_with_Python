// 순차 탐색
package Chapter7;

public class sequentialSearch_ex_0701 {
	
	public static int seqSearch(int n, int[] arr, int x) {
		int i = 1;
		for(i = 1 ; i <= n ; i++) 
			if(arr[i] == x)
				break;
//				return i;
		if(i == n)
			return 0;
		return i;
	}
	
	// 수업자료 코드 (index가 1부터 시작한다고 가정)
	public static int seqSearch2(int n, int[] arr, int x) {
		int location = 1;
		while(location <= n && arr[location] != x)
			location++;
		if(location > n)
			location = 0;
		return location;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,10,7,11,5,13,8};
		System.out.println(seqSearch(6, arr, 5));
		System.out.println(seqSearch2(6, arr, 5));
	}

}

//10 7 11 5 13 8
//1 2 3 4 5 6