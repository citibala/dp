

package algorithms.dp;

public class StairCaseJump {

	public static int stairCaseArr[] = new int[4];

	public int findNumberOfWays(int n) {
		if (n < 1) {
			return 0;
		}
		if (stairCaseArr[n] > 0) {
			return stairCaseArr[n];
		}
		stairCaseArr[n] = 1 + findNumberOfWays(n - 1) + findNumberOfWays(n - 2) + findNumberOfWays(n - 3);
		return stairCaseArr[n];
	}

	public static void main(String[] args) {

		StairCaseJump obj = new StairCaseJump();
		System.out.print("\nThe number of possible ways to reach" );
		System.out.print(" the staircase(3 steps) end by using 1 ,2 or 3 Jumps:");
		System.out.print(obj.findNumberOfWays(3));
	}
	
/*	
	Number of ways :  { {1,1,1}, {1,2}, {2,1}, {3} }
	
	*/

}
