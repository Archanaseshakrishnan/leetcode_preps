
public class insert_position_working_pgm {
	public static int searchInsert(int[] nums, int target) {
	    if(nums==null)
	        return -1;
	    if(target>nums[nums.length-1]){
	        return nums.length;
	    }
	 
	    int i=0;
	    int j=nums.length;
	 
	    while(i<j){
	        int m=(i+j)/2;
	        if(target>nums[m]){
	            i=m+1;
	        }else{
	            j=m;
	        }
	    }
	 
	    return j;
	}
	public static void main(String args[]){
		int[] a={6,23,45,90,120};
		int num=95;
		int position=searchInsert(a,num);
		System.out.println(position);
	}
}
