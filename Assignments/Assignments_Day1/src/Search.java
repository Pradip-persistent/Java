import java.util.Scanner;

public class Search {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of element");
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("enter element to be searched");
		int num=in.nextInt();
		System.out.println(findPosition(num, arr));
	}
	static int findPosition(int num,int[] nos) {
		int ans=-1;
		for(int i=0;i<nos.length;i++) {
			if(nos[i]==num) {
				ans=i;
				break;
			}
		}
		return ans;
	}
}
