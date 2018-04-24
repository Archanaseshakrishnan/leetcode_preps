
public class Histogram_min_area {
public static void main(String args[]){
	int[] heights={2,1,5,6,2,3,3,3};
	int i=0, j=i;
	int area=0,max=-1;
	int ht=1;
	while(i<heights.length){
		
		if(j<heights.length)
		{ht = min(i,j,heights);
		System.out.print("Min in i= "+i+" and j= "+j+", ");
		}
		if(i<j)
		area = ht*(j-i+1);
		else
			area=heights[j];
		System.out.print("area= "+area+", ");
		if(max <=area && heights[j]<=area)
		{
			max=area;
			if(j+1<heights.length)
			j++;
			
		}
		else
			{
			if(max<=heights[j])
			max=heights[j];
			if(j<heights.length && i<j)
				i++;
			else
				i++;
			}
		System.out.print("max area= "+max+", ");
		
		if(i==j){
			if(j+1<heights.length)
				j++;	
		}
		System.out.println("in i= "+i+" and j= "+j+", ");
		
	}
	System.out.println(max);
}

private static int min(int i, int j,int[] heights) {
	// TODO Auto-generated method stub
	int min=Integer.MAX_VALUE;
	
	for(int k=i;k<=j;k++){
		if(min>heights[k])
			min=heights[k];
	}
	if(i==j)
		return heights[j];
	else
	return min;
}
}
