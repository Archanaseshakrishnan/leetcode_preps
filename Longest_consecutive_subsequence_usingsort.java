import java.util.Arrays;
//requires O(n) complexity else sorting can be used
public class Longest_consecutive_subsequence_usingsort {
public static void main(String args[]){
	int[] a={100, 4, 200, 1, 3, 2};
	int diff = 0,count=-1;
	Arrays.sort(a);
	for(int i=0;i<a.length;i++){
		
		if(a[i+1]<a.length){
		diff=a[i+1]-a[i];
		if(diff==1){
			if(count==-1)
			count=2;
			else
				count=count+1;
		}
		
	}
		else 
			break;
	}
	System.out.println(count);
}
}
