package Chapter3;

public class Change {
	
//	// 3-1 거스름돈 문제
//	public static void change(int money) {
//		//ex) 1260원이면, 500 -> 2개, 100 -> 2개, 50 -> 1개 ,10 -> 1개
//		int count = 0;
//		int num500 = money / 500;		//2개
//		count += num500;
//		int changemoney = money % 500;	//남은 돈 260원
//		System.out.println("500원의 개수 : " + num500);
//		
//		int num100 = changemoney / 100;	//2개
//		count += num100;
//		changemoney %= 100;				//남은 돈 60원
//		System.out.println("100원의 개수 : " + num100);
//		
//		int num50 = changemoney / 50;	//1개
//		count += num50;
//		changemoney %= 50;				//남은 돈 10원
//		System.out.println("50원의 개수 : " + num50);
//		
//		int num10 = changemoney / 10;	//1개
//		count += num10;
//		System.out.println("10원의 개수 : " + num10);
//		System.out.println("동전의 최소 개수 : " + count);
//	}
	
	// 노가다 안하고 배열에 담아서 푸는 법
	public static void easychange(int money) {
		int count = 0;
		int[] arr = {500, 100, 50, 10};
		for(int i=0 ; i<arr.length ; i++) {
			count += money / arr[i];
			money %= arr[i];
		}
		System.out.println("동전의 최소 개수 : " + count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		change(1260);
		easychange(1260);
	}

}
