package Chapter3;

import java.util.Scanner;

public class NumCardGame {
	
	public static int numCardGame(int[][] arr) {
		int x = arr.length;
		int y = arr[0].length;
		int minNum;
		int smallest = 0;					//가장 작은 수 중 제일 큰 수
		for(int i=0 ; i<x ; i++) {
			minNum = arr[i][0];
			for(int j=0 ; j<y ; j++) {		// 각 행마다의 가장 작은 수를 탐색
				if(minNum > arr[i][j])
					minNum = arr[i][j];
			}
			if(smallest < minNum)
				smallest = minNum;
		}
		return smallest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int[][] arr = new int[x][y];
		for(int i=0 ; i<x ; i++)
			for(int j=0 ; j<y ; j++)
				arr[i][j] = scan.nextInt(); 
		scan.close();
		System.out.println(numCardGame(arr));
	}

}
