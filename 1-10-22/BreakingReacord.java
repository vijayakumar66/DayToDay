package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakRecord {

	public static List<Integer> breakingRecords(List<Integer> scores) {
		List<Integer> list = new ArrayList<>();
		int max = scores.get(0), min = scores.get(0);
		int maxcount = 0, mincount = 0;
		for (int value : scores) {
			if (max < value) {
				max = value;
				maxcount++;
			}
			if (min > value) {
				min = value;
				mincount++;
			}

		}
		list.add(maxcount);
		list.add(mincount);
		return list;
	}

	public static void main(String[] args) {
		ArrayList<Integer> scores = new ArrayList<>();
		scores.add(7);
		scores.add(10);
		scores.add(5);
		scores.add(12);
		scores.add(3);
		scores.add(1);
		System.out.println(breakingRecords(scores));
	}

}
