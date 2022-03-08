package Tips;

import java.util.Scanner;

public class qw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			System.out.println(sc.next());
			}
		sc.close();
	}

}

//위처럼 eof처리 해줘도 왜 스캐너가 무한반복 되는거지? 백준에서는 맞다고 뜨는데
//System.in으로 입력을 받아서 hasNext로 eof처리를 해주려고 해도 우리가 누른 enter도 입력으로
//처리하기 때문에, 멈추지 않는다

// next(): String, 공백을 만나기전까지 읽음, 다음 토큰을 문자열로 return
// nextLine(): String, 공백을 포함해서 읽음, '\n'을 포함하는 한 line을 읽고 '\n'을 버린 나머지만 return

