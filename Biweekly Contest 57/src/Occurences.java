import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Question Link : https://leetcode.com/contest/biweekly-contest-57/problems/check-if-all-characters-have-equal-number-of-occurrences/
 * @author pulkit
 *
 */


public class Occurences {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		String str = scan.next();
		boolean isGood = areOccurrencesEqual(str);
		System.out.println(isGood);
	}
	
	
	private static boolean areOccurrencesEqual(String s) {
		Map<Character, Integer> freq = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			Integer oldFreq = freq.get(s.charAt(i));
			freq.put(s.charAt(i), oldFreq == null ? 1 : oldFreq + 1);
		}

		int frequency = freq.get(s.charAt(0));

		for (Character key : freq.keySet()) {
			if (freq.get(key) != frequency)
				return false;
		}
		return true;
	}
}
