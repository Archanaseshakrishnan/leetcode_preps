
public class Subsequence_sum {
public static void main(String args[]){
	int i=0, iprev=-1, j=0, sum=0, count, diff, diffprev=-1, min=-1,n;
	int[] a={2,3,1,2,4,3};
	int num=7;
	n=a.length;
	while(i<n){
		if(i!=j && iprev!=i && iprev!=-1){
			sum=sum-a[iprev]; iprev=i; count=j-i+1;
		}
		else if(i!=j && iprev!=-1){
			sum=sum+a[j]; count=j-i+1;
		}
		else{
			sum=a[i];count=1;
		}
		if(sum<num){
			j++;
		}
		else{
			i++;diff=sum-num;
			if(diffprev==-1){
				diffprev=diff;
				if(min==-1){
					min=count;
				}
				else if(min>count){
					min=count;
				}
				
			}
			else if(diff<=diffprev){
				
				if(min==-1){
					min=count;diffprev=diff;
				}
				else if(min>count){
					min=count;diffprev=diff;
				}
			}
		}
		
	}
	System.out.println(min);
}
}
