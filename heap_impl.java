class heap_struct{
	public int size;
	public int[] elt;
	public int maxelts;
	heap_struct(){
		//System.out.println("in constructor");
		maxelts=100;
		size=0;
		elt=new int[maxelts];
		elt[0]=Integer.MIN_VALUE;
	}
}
public class heap_impl {
	public static heap_struct check(heap_struct h){
		int i;
		//int[] elt=new int[h.size];
		//System.out.println("inside check");
		for(i=1;i<=h.size;i++){
			if(i*2 <= h.size){
				if(h.elt[i]>h.elt[i*2]){
					int temp=h.elt[i*2];
					h.elt[i*2]=h.elt[i];
					h.elt[i]=temp;
					break;
				}
			}
			if(i*2+1 <= h.size){
				if(h.elt[i]>h.elt[i*2+1]){
					int temp=h.elt[i*2+1];
					h.elt[i*2+1]=h.elt[i];
					h.elt[i]=temp;
					break;
				}
			}
		}
		if(i<=h.size){
			h=check(h);
		}
		return h;
	}
	public static heap_struct checkdel(heap_struct h){
		int i;
		for(i=1;i<=h.size;i++){
			System.out.println("i="+i);
			if(i*2<=h.size && i*2+1<=h.size){
				if(h.elt[i]>h.elt[i*2] && h.elt[i]>h.elt[i*2+1]){
				int pos=min(i*2,i*2+1,h);
				System.out.println(pos);
				int temp=h.elt[i];
				h.elt[i]=h.elt[pos];
				h.elt[pos]=temp;
				/*for(int i1=1;i1<=h.size;i1++){
					System.out.println(i1+"-"+h.elt[i1]);
				}*/
				break;
				}
				else if(h.elt[i]>h.elt[i*2]){
					int temp=h.elt[i*2];
					h.elt[i*2]=h.elt[i];
					h.elt[i]=temp;
					break;
				}
				else if(h.elt[i]>h.elt[i*2+1]){
					int temp=h.elt[i*2+1];
					h.elt[i*2+1]=h.elt[i];
					h.elt[i]=temp;
					/*for(int i1=1;i1<=h.size;i1++){
						System.out.println(i1+"-"+h.elt[i1]);
					}*/
					break;
				}
			}
			else if(i*2 <= h.size){
				if(h.elt[i]>h.elt[i*2]){
					int temp=h.elt[i*2];
					h.elt[i*2]=h.elt[i];
					h.elt[i]=temp;
					break;
				}
			}
			else if(i*2+1 <= h.size){
				if(h.elt[i]>h.elt[i*2+1]){
					int temp=h.elt[i*2+1];
					h.elt[i*2+1]=h.elt[i];
					h.elt[i]=temp;
					break;
				}
			}
		}
		if(i<=h.size){
			h=checkdel(h);
		}
		System.out.println(i);
		return h;
	}
	
	private static int min(int i, int j, heap_struct h) {
		// TODO Auto-generated method stub
		if(h.elt[i]>h.elt[j]){
			return j;
		}
		else{
			return i;
		}
		
	}
	public static heap_struct insert(heap_struct h,int d1){
	//	System.out.println("inside insert");
		h.elt[++h.size]=d1;
	//	System.out.println(h.size+" - "+h.elt[h.size]);
		h = check(h);
		return h;
	}
	public static heap_struct del_min(heap_struct h){
		int first=h.elt[1];
		System.out.println(first+" is the min deleted");
		int last=h.elt[h.size--];
		System.out.println(last+" is the last elt");
		h.elt[1]=last;
		checkdel(h);
		return h;
		
	}
public static void main(String args[]){
	heap_struct h=new heap_struct();
	h=insert(h,13);
	h=insert(h,14);
	h=insert(h,16);
	h=insert(h,19);
	h=insert(h,21);
	h=insert(h,19);
	h=insert(h,68);
	h=insert(h,65);
	h=insert(h,26);
	h=insert(h,32);
	h=insert(h,31);
	h= del_min(h);
	for(int i=1;i<=h.size;i++){
		System.out.println(i+"-"+h.elt[i]);
	}
	h= del_min(h);
	for(int i=1;i<=h.size;i++){
		System.out.println(i+"-"+h.elt[i]);
	}
}
}
