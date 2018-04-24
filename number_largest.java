import java.util.ArrayList;
import java.util.HashMap;
class maxheap{
int Capacity;
int Size;
int[] elts;
maxheap(int Cap){
	Capacity=Cap;
	Size=0;
	elts=new int[Cap+1];
	elts[0]=Integer.MAX_VALUE;
}
void add(int x, maxheap h){
	int i;
	for(i=++h.Size;h.elts[i/2]<x;i/=2)
		h.elts[i]=h.elts[i/2];
	h.elts[i]=x;
}
int deletemax(maxheap h){
	int i, child, maxelt, lastelt;
	if(h.Size==0)
		return (Integer) null;
	maxelt=h.elts[1];
	lastelt=h.elts[h.Size--];
	for(i=1;i*2<=h.Size;i=child){
	child=i*2;
	if(child!=h.Size && h.elts[child+1]>h.elts[child])
		child++;
	if(lastelt<h.elts[child])
		h.elts[i]=h.elts[child];
	else
		break;
	}
	h.elts[i]=lastelt;
	return maxelt;
}	
}
public class number_largest {
public static void main(String args[]){
		int[] input={3, 30, 34, 5, 9};
		int k=0;
		maxheap[] hp=new maxheap[input.length];
		for(int i=0;i<input.length;i++)
			hp[i]=new maxheap(input.length);
		maxheap h;
		int i;
		for(i=0;i<input.length;i++){
			if(input[i]<10){
				h=hp[input[i]];
				hp[input[i]].add(input[i], h);
			}
			else{
				for(int j=input[i];j!=0;j=j/10){
					k=j%10;
				}
				h=hp[k];
				hp[k].add(input[i], h);
			}
		}
		for(int i1=input.length;i1>=0;i1++){
			while(hp[i1].Size!=0){
				h=hp[i1];
				int num=hp[i1].deletemax(h);
				System.out.print(num);
			}
		}
	}
}

