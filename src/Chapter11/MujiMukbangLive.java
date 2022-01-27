package Chapter11;

// https://programmers.co.kr/learn/courses/30/lessons/42891?language=java#
public class MujiMukbangLive {
	
	public static int solution(int[] food_times, long k) {
		int i = 0;
		
		int sum = 0;
		for(int e : food_times)
			sum += e;
		if(k >= sum)
			return -1;
		
		while(k > 0) {
			if(food_times[i] == 0)
				++i;
			food_times[i++] -= 1;
			k--;
			if(i == food_times.length)		// 배열을 한번 다 돌면 처음부터 다시 돌기
				i = 0;
		}
		
		while(food_times[i] == 0) {
			++i;
			if(i == food_times.length)		
				i = 0;
		}
		
		return i+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {3,1,2};
//		System.out.println(solution(arr, 5));	//result 1
		
//		int[] arr = {1,100};
//		System.out.println(solution(arr, 10));	//result 2
		
		
		int[] arr = {4, 2, 3, 6, 7, 1, 5, 8};
		int sum = 0;
		for(int e : arr)
			sum += e;
		System.out.println(sum);
		System.out.println(solution(arr, 16));	//result 3
		System.out.println(solution(arr, 27));	//result 5
	}

}
