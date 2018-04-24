import java.util.Scanner;
//inplace so we merge from last
public class merge_sorted_arrays {
public static void main(String args[]){
	int[] a,b;
	int m,n;
	System.out.println("Enter size_a, size_b: ");
	Scanner reader=new Scanner(System.in);
	m=reader.nextInt();
	n=reader.nextInt();
	a=new int[m];
	b=new int[n];
	System.out.println("Enter array A: ");
	for(int i=0;i<m;i++){
		a[i]=reader.nextInt();
	}
	for(int i=0;i<n;i++){
		b[i]=reader.nextInt();
	}
	merge(a,m,b,n);
for(int an : a)
	System.out.println(an);
}
public static void merge(int A[], int m, int B[], int n) {
  //  A=new int[m+n];   
	while(m > 0 && n > 0){
            if(A[m-1] > B[n-1]){
                A[m+n-1] = A[m-1];
                m--;
            }else{
                A[m+n-1] = B[n-1];
                n--;
            }
        }
        while(n > 0){
            A[m+n-1] = B[n-1];
            n--;
        }
    }

}
