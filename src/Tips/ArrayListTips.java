package Tips;

import java.util.*;

public class ArrayListTips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            String[] arrRowTempItems = {"2","1"};

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

      System.out.println(arr);
//	  System.out.println(arr.get(1)); // 출력예시
//	  System.out.println(arr.get(1).get(0)); // 출력예시
	}

}

////우, 하, 좌, 상
//		int[] dx = {0, 1,  0, -1};
//		int[] dy = {1, 0, -1,  0};
