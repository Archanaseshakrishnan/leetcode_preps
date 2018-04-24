
public class histogram_recursion {
	int count=0;
	static int areaprev=0;
	public static void main(String[] args){
	int heights[]={2,1,5,6,2,3};
	func(0,heights.length-1,heights);
	System.out.println(areaprev);
	//System.out.println(trap(heights));
	}
	private static int func1(int l,int r,int[]a){
		int min=Integer.MAX_VALUE;
		int index=-1,area=0;
		if(l>=r)
			return areaprev;
		for(int i=l;i<=r;i++){
			if(a[i]<min){
				min=a[i];index=i;
			}
		}
		area=min*(r-l+1);
		if(area>areaprev)
			areaprev=area;
		return index;
	}

	private static void func(int l, int r, int[] a) {
		// TODO Auto-generated method stub
		int index;
		if(l<r)
			{index=func1(l,r,a);
		func(l,index-1,a);
		func(index+1,r,a);
			}
	}
	public static int trap(int[] height) {
	    int result = 0;
	   if(height==null || height.length<=2)
	        return result;
	
	    int left[] = new int[height.length];
	    int right[]= new int[height.length];
	
	    //scan from left to right
	    int max = height[0];
	    left[0] = height[0];
	    for(int i=1; i<height.length; i++){
	        if(height[i]<max){
	            left[i]=max;
	        }else{
	            left[i]=height[i];
	            max = height[i];
	        }
	    }
	
	    //scan from right to left
	    max = height[height.length-1];
	    right[height.length-1]=height[height.length-1];
	    for(int i=height.length-2; i>=0; i--){
	        if(height[i]<max){
	            right[i]=max;
	        }else{
	            right[i]=height[i];
	            max = height[i];
	        }
	    }
	
	    //calculate totoal
	    for(int i=0; i<height.length; i++){
	        result+= Math.min(left[i],right[i])-height[i];
	    }
	
	    return result;
	}
}
