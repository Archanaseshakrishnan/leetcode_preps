import java.util.Scanner;

public class rotate_array_k_times {
	
public static void main(String args[]){
	int[] a;
	
	int[] b;
	
	int n,k,i;
	//assuming it is integer array
	//n, k, array as input
	Scanner reader = new Scanner(System.in);  // Reading from System.in
	System.out.println("Enter a number: ");
	n = reader.nextInt();
	a=new int[n];
	System.out.println("Enter k: ");
	k=reader.nextInt();
	b=new int[n];
	System.out.println("Enter a[]: ");
	for(i=0;i<n;i++)
	{
		a[i]=reader.nextInt();
	}
	for(i=0;i<n;i++)
	{
		b[i]=a[(i+k+1)%n];
	}
	for(i=0;i<n;i++)
	{
		System.out.println(b[i]);
	}
	
	
}
}
