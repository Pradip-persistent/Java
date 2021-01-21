import java.util.Scanner;

public class _2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter character O/X");
		char [][]input=new char[3][3];
		for(int i=0;i<3;i++) 
		for(int j=0;j<3;j++)
		{
			
			char temp=in.next().charAt(0);
			if(temp !='O' | temp !='o' | temp !='x' | temp !='X') {
				System.out.println("enter character O/X");
				j--;
				
			}
			else {
				input[i][j]=temp;
			}
		}
		
		if(input[0][0]=='o' | input[0][0]=='O') {
			if((input[0][1]==input[0][0] & input[0][0]==input[0][2]) |(input[0][0]==input[1][0] & input[2][0]==input[0][0]) | (input[0][0]==input[1][1] &input[0][0]==input[2][2]) ) {
				System.out.println("O wins");
			}
		}
		else if(input[0][0]=='X' | input[0][0]=='x') {
			if((input[0][1]==input[0][0] & input[0][0]==input[0][2]) |(input[0][0]==input[1][0] & input[2][0]==input[0][0]) | (input[0][0]==input[1][1] &input[0][0]==input[2][2]) ) {
				System.out.println("X wins");
			}
		}
	}

}
