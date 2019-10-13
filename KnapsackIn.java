
public class KnapsackIn {
	
	
	public static void main(String args[]) {
		int ar[]= {5,10,15};
		int wr[]= {2,3,4};

		System.out.println(ks(5,ar, wr));
	}
	
	public static int ks(int w, int a[], int W[]) {
		int dp[]=new int[w+1];
		
		for(int i=0; i<=w; i++) {
			for(int j=0; j< a.length; j++) {
				if(i>=W[j])
				dp[i]=Math.max(dp[i], dp[i-W[j]]+a[j]);
			}
			
		}
		return dp[w];
	}

	
}
