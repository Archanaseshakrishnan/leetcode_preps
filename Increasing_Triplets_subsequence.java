
public class Increasing_Triplets_subsequence {
public static void main(String args[]){
	int[] numa={1, 2, 3, 4, 5};
	int[] nums={5,4,3,2,1};
	System.out.println(Triplets(numa));
	System.out.println(Triplets(nums));
}
public static boolean Triplets(int[] nums){
	int count=0;
	for(int i=0;i<nums.length;i++){
		if(i+1<nums.length){
			if(nums[i+1]>nums[i]){
				count=count+1;
			}
			else{
				count=0;
			}
			if(count>3){
				return true;
			}
		}
	}
	return false;
}
}
