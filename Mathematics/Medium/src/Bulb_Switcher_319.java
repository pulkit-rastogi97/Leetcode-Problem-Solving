import java.util.Scanner;

//https://leetcode.com/problems/bulb-switcher/

/**
 * Medium

There are n bulbs that are initially off. You first turn on all the bulbs, then you turn off every second bulb.

On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). For the ith round, you toggle every i bulb. For the nth round, you only toggle the last bulb.

Return the number of bulbs that are on after n rounds.

 * @author pulkit-rastogi97
 *
 */
public class Bulb_Switcher_319 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result = Solution.bulbSwitch(n);
		System.out.println(result);
		scan.close();
	}
}
class Solution {
    public static int bulbSwitch(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            count++;
        }
        return count;
    }
}