package my.nmcuong.codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class OddOccurrencesInArray {
	static public int solution(int[] A) {
		
		Map<Integer, Integer> map = new HashMap<>();
		Arrays.stream(A).boxed().forEach(i -> {
			Integer count = map.get(i);
			if (count == null) {
				count = 0;
			}
			map.put(i, count + 1);
		});

		Optional<Entry<Integer, Integer>> findFirst = map.entrySet().stream().filter(i -> i.getValue() % 2 != 0).findFirst();
		return findFirst.get().getKey();
	}
}
