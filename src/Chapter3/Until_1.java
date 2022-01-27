package Chapter3;

import java.util.Scanner;

public class Until_1 {
	
	public static int until1(int n, int k) {
		int count = 0;
		while(n!=1) {
			
			if(n%k==0) {
				n /= k;
			}
			else
				n -= 1;
			++count;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		scan.close();
		System.out.println(until1(n, k));
	}

}
