import java.util.Arrays;
import java.util.Scanner;

public class k_th_largest_element {

	public static void main(String args[]){
		int number_array[];
		int n,k;
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the size for the numeric array: ");
		n=reader.nextInt();
		number_array=new int[n];
		System.out.println("Enter array: ");
		for(int i=0;i<n;i++)
		{
			number_array[i]=reader.nextInt();
		}
		Arrays.sort(number_array);
		System.out.println("enter kth num ");
		k=reader.nextInt();
		if(k>n)
			System.out.println("nope");
		else
			System.out.println(number_array[k+1]);
	}
}
