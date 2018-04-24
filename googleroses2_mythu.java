
public class googleroses2_mythu {
static int gmax=-1;
static int find(int[] arr,int index){
	int count=1;
	int j = index-1;
	int k = index+1;
	while(j>=0 && arr[j]==1){
		j--;count+=1;
	}
	while(k<arr.length && arr[k]==1){
		k++;count+=1;
	}
	return count;
}
static void roses(int[] p, int k){
	int[] arr=new int[p.length];
	for(int i=0;i<p.length;i++){
		arr[p[i]-1]=1;
		int c=find(arr,p[i]-1);
		if(c==k){
			if(i+1>gmax){
				gmax=i+1;
			}
		}
		else if(i+1-c>=k){
			if(gmax>-1){
				gmax=i+1;
			}
		}
	}
}
public static void main(String args[]){
	int[] P={3,1,5,4,2};
	roses(P,2);
	System.out.println(gmax);
}
}
