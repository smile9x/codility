package my.nmcuong.codility;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BinaryGap {
	static public int evaluate(int N) {
		String str = Integer.toBinaryString(N);
		String[] arrs = str.split("");
		List<Integer> distance = new ArrayList<Integer>();
		
		int leftIndex = 0;
		for (int i = 1; i < arrs.length; i++) {
			if (arrs[i].equals("1")) {
				distance.add(leftIndex);
				leftIndex = 0;
			} else {
				leftIndex ++;
			}
		}		
		Optional<Integer> optResult = distance.stream().reduce(Integer::max);
		if (optResult.isPresent()) {
			return optResult.get();
		} else {
			return 0;
		}
	}
}
