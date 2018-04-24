
public class insert_position {

	public static void main(String args[]){
		int num,left,right,center;
		int[] a={6,23,45,90,120};
		num=120;
		left=0;right=a.length-1;
		center=(left+right)/2;
		int found=rec(a,left,right,num);
		System.out.println(found);
	}

	public static int rec(int[] a, int left, int right, int num) {
		// TODO Auto-generated method stub
		int center=(left+right)/2;
		while(a[center]!=num && left<=right){
		if(a[center]>num){
			right=center-1;
			
		}
		else if(num<a[center]){
		    left=center+1;
			
		}
		center=(left+right)/2;
		
		}
		if(left<=right){
			return center;
		}
		else
		return right;
	}
}
