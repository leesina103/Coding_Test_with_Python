// https://programmers.co.kr/learn/courses/30/lessons/60060#
package Chapter15;

public class LyricsSearch_1530 {

	// "????o" 인 경우는 index 4를 반환함 -> 마지막 ? 다음의 index 반환
	// "?osad" return 1
	// '?'의 갯수를 반환
	public static int leftQnum(String query) {
		int start = 0;
		int end = query.length() - 1;
		while(start < end) {
			int mid = (start + end) / 2;
			if(query.charAt(mid) == '?')
				start = mid + 1;
			else 
				end = mid - 1;
		}
		return start;
	}
	
	// "o????" 인 경우는 index 1를 반환함 -> 마지막 ? 다음의 index 반환
	// "osad?" return 4
	public static int rightQnum(String query) {
		int start = 0;
		int end = query.length() - 1;
		while(start < end) {
			int mid = (start + end) / 2;
			if(query.charAt(mid) == '?')
				end = mid - 1;
			else 
				start = mid + 1;
		}
		return start;
	}
	
	public static boolean isMatch(String query, String word) {
		if(word.length() != query.length())
			return false;
		int len = word.length();
		int count;
		// '?'가 맨 앞에 있어서 접두사인 경우
		if(query.charAt(0) == '?') {
			count = leftQnum(query);
			word = word.substring(count, len);
			query = query.substring(count, len);
			if(word.equals(query))
				return true;
			else 
				return false;
		}
		// '?'가 맨 뒤에 있어서 접미사인 경우
		count = rightQnum(query);
		word = word.substring(0, count);
		query = query.substring(0, count);
		if(word.equals(query))
			return true;
		else 
			return false;
		
//		// 첫 글자부터 단어하나씩 비교해서 둘이 같거나 둘 중 하나가 ?라면 넘어가고, 아니라면 false
//		for(int i = 0 ; i < word.length() ; i++) {
//			if(word.charAt(i) == query.charAt(i) || word.charAt(i) == '?' || query.charAt(i) == '?')
//				continue;
//			else 
//				return false;
//		}
//		return true;
	}
	
	public static int[] solution(String[] words, String[] queries) {
		int len = queries.length;
		int[] answer = new int[len];
		for(int i = 0 ; i < len ; i++)
			for(int j = 0 ; j < words.length ; j++)
				if(isMatch(queries[i], words[j]))
					answer[i] += 1;
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
		String[] queries = {"fro??", "????o", "fr???", "fro???", "pro?"};
		int[] arr = solution(words, queries);
		System.out.print("[ ");
		for(int i : arr)
			System.out.print(i + " ");
		System.out.print("]");
//		String string = "????o";
//		String string2 = "?osad";
//		String string3 = "frodo";
//		System.out.println(isMatch(string3, string));
		
	}

}
