package Chapter15;

import java.util.*;

public class SpecificNum_1527 {

	// 정렬된 배열에서 같은 수를 찾는 것이므로 (2)계수 정렬을 이용할 수 있을까? -> 계수정렬을 사용할 시간에 세는 것이 더 빠름
	// 계수 정렬을 사용한다면, 1 1 2 2 2 2 3 -> arr[1]=2, arr[2]=4, arr[3]=1로 만들어서 바로 개수를 찾을 수 있지만,
	// 이런 정렬을 하는데 쓰는 시간보다 하나를 찾는 것이 더 빠름
	// (3) 이렇게 개수를 찾는 함수를 따로 정의하는 것이 아니고, 이진 탐색으로 한 수를 찾을 때마다, 그 수를 제외시키는 방법은 어떠한가?
	// 원래 푼 방법을 (1)이라하고 (1) vs (3)의 시간복잡도를 비교해봤을 때, (x는 답의 개수라고 가정)
	// (1) -> logn + x(while문 반복횟수) => x + logn
	// (3) -> 이진탐색함수호출 x번 * logn => xlogn
	// 원래 방식(1)이 더 효율적이라고 판단.
	public static int countNum(int n, int xindex, int x, int[] arr) {
		int count = 1;		// 이 함수에 들어왔다는 건 수를 찾았기 때문이니, 해당 index의 수는 미리 count해서 1로 시작
		int rightidx = xindex + 1;
		int leftidx = xindex - 1;
		// 해당 xindx를 기준으로 오른쪽, 왼쪽으로 x가 안나올때까지 search하기
		while(arr[rightidx++] == x) 
			count++;
		while(arr[leftidx--] == x)
			count++;
		return count;
	}
	
	public static int binarySearchIndex(int n, int x, int[] arr) {
		int start = 0;
		int end = n-1;
		while(start <= end) {
			int mid = (start + end) / 2;
			if(arr[mid] == x)
				return mid;
			else if(arr[mid] > x)
				end = mid - 1;
			else 
				start = mid + 1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();		//원소의 개수
		int x = scan.nextInt(); 	//찾는 수
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++)
			arr[i] = scan.nextInt();
		int xindex = binarySearchIndex(n, x, arr);
		
		if(xindex == -1)
			System.out.println(xindex);
		else 
			System.out.println(countNum(n, xindex, x, arr));
		
		scan.close();
	}

}

//7 2
//1 1 2 2 2 2 3

//7 4
//1 1 2 2 2 2 3