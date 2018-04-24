
public class median_of_two_sorted_arrays {
	public static int l;
public static void main(String args[]){
	int a[]={1};
	int b[]={2,56,98,100,156};
	int c[],len,medpos,j=0,k=0,found=0,i,result;
	c=new int[a.length+b.length];
	len=a.length+b.length;
	medpos=len/2;
	for(i=0;i<medpos;i++)
	{
		if(a[j]<b[k]){
			c[i]=a[j];
			j++;
			if(j>=a.length){
				found=1;break;
			}
		}
		else{
			c[i]=b[k];
			k++;
			if(k>=b.length){
				found=2;break;
			}
		}
		
	}
	if(found==1){
		for(l=i+1;l<medpos;l++)
		{
			c[l]=b[k];k++;
		}
		result=c[l-1];
	}
	else if(found==2){
		for(l=i+1;l<medpos;l++)
		{
			c[l]=a[j];j++;
		}
		result=c[l-1];
	}
	else
		result=c[i-1];
	System.out.println(result);
}


}
