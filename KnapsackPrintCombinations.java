package com.bala;

import java.util.ArrayList;
import java.util.List;

public class KnapsackPrintCombinations {

	public static void main(String args[]) {
		int val[] = new int[] { 60, 100, 120 };
		int wt[] = new int[] { 10, 20, 30 };
		System.out.println(ks(50, wt, val, val.length));
	}

	public static int ks(int w, int wt[], int val[], int n) {

		int dp[][] = new int[n + 1][w + 1];

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= w; j++) {
				if (i == 0 || j == 0) {
					dp[i][j] = 0;
				} else if (wt[i - 1] <= j) {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - wt[i - 1]] + val[i - 1]);
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		
		
		List<Integer> items=new ArrayList<>();
		 int x=n;
		 int y=w;
		
		while (x>0 && y>0) {
			
			if(dp[x][y]==dp[x-1][y]) {
				x--;
			}else if( wt[x-1] <= y && (dp[x][y]== (dp[x-1][y-wt[x-1]]+ val[x-1]))) {
				items.add(val[x-1]);
				System.out.print(val[x-1]+" ");
				y=y-wt[x-1];
				x--;
				
			}
			
		}
		return dp[n][w];
	}

}
