import java.util.ArrayList;

public class Summary_ranges {
public static void main(String args[]){
	int[] nums={0,1,2,4,5,7};
	System.out.println(summary(nums));
}
//its a sorted array
public static ArrayList<String> summary(int[] nums){
	int low=Integer.MAX_VALUE,high=-1,i;
	ArrayList<String> result=new ArrayList<String>();
	for(i=0;i<nums.length;i++){
		
		if(i+1<nums.length){
			if(nums[i+1]-nums[i]==1){
				if(low>nums[i]){
					low=nums[i];
				}
				if(high<nums[i+1]){
					high=nums[i+1];
				}
			}
			else{
				if(low==Integer.MAX_VALUE && high==-1)
					result.add(String.valueOf(nums[i]));
				else
				result.add(String.valueOf(low)+"->"+String.valueOf(high));
				low=Integer.MAX_VALUE;high=-1;
			}
		}
	}
	if(high==nums[i-1]){
		//included do nothing
	}
	else{
		result.add(String.valueOf(nums[i-1]));
	}
	return result;
}
}
