
public class FindPrime {

	public static void main(String[] args) {
	int arr[]=findPrime(1, 10);
	for (int a:arr) {
		if(a!=0)
		System.out.println(a);
	}
	}
	static boolean isPrime(int n) {
		if(n==1)
			return false;
		for( int i=n-1;i>1;i--) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	static int[] findPrime(int f,int l) {
		int ans[]=new int[l-f];
		int j=0;
		for(int i=f;i<l;i++) {
			if(isPrime(i))
				ans[j++]=i;
		}
		return ans;
	}

}
