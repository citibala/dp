

package algorithms.dp;

public class MinimumCostPath {

	static int costArr[][] = {
			{ 1, 1, 2 }, 
			{ 3, 3, 2 },
			{ 4, 1, 5 } };
	private static int findMinimumCost(int m, int n) {
		
		int i, j;
		int res[][] = new int[m + 1][n + 1];

		res[0][0] = costArr[0][0];

		for (i = 1; i <= m; i++)
			res[i][0] = res[i - 1][0] + costArr[i][0];

		for (j = 1; j <= n; j++)
			res[0][j] = res[0][j - 1] + costArr[0][j];

		for (i = 1; i <= m; i++)
			for (j = 1; j <= n; j++)
				res[i][j] = minNumber(res[i - 1][j], res[i][j - 1]) + costArr[i][j];

		return res[m][n];
	}

	public static int minNumber(int x, int y) {
		if (x < y)
			return x;
		else
			return y;
	}

	public static void main(String args[]) {
		
		System.out.print("\nMinimum cost to reach (2,2) by moving left or down : " );
		System.out.print(findMinimumCost(2, 2));
	}
}

