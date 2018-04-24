
public class binary_add {
	private static String result="";
	private static int flag;
	public static void func_2add(String a,String b){
		int lena=a.length();
		int lenb=b.length();
		int aint,bint;
		if(lena<lenb){
		aint = Integer.parseInt(a);
		bint = Integer.parseInt(b);
		}
		else
		{
			aint=Integer.parseInt(b);
			bint=Integer.parseInt(a);
		}
		while(aint!=0){
			int tempa = aint%10;
			int tempb = bint%10;
			int sum=tempa + tempb + binary_add.flag;
			if(sum>=2){
				binary_add.flag=1;
				sum=sum-2;
			}
			else{
				binary_add.flag=0;
			}
			String sume=Integer.valueOf(sum).toString();
			binary_add.result=sume+binary_add.result;
			bint=bint/10;
			aint=aint/10;
		}
		while(bint!=0){
			int tempb = bint%10;
			int sum = tempb + binary_add.flag;
			if(sum>=2){
				binary_add.flag=1;
				sum=sum-2;
			}
			else{
				binary_add.flag=0;
			}
			String sume=Integer.valueOf(sum).toString();
			binary_add.result=sume+binary_add.result;
			bint=bint/10;
			/*if(bint!=0)
			binary_add.result=Integer.valueOf(bint).toString()+binary_add.result;*/
			
		}
		
		System.out.println(flag+binary_add.result);
	}
public static void main(String args[]){
	func_2add("10","111");
}
}
