import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class setlocal{
	public int start;
	public int end;
	void setstart(int num){
		start=num;
	}
	void setend(int num){
		end=num;
	}
	
	
	
}
public class merge_intervals {

public static void main(String args[]){
		
	int n, input1, input2;
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter n: ");
	n=reader.nextInt();
	
	List<setlocal> mine=new ArrayList<setlocal>();
	
	System.out.println("Enter numbers: ");
	for(int i=0;i<n;i++)
	{
		setlocal frst=new setlocal();
				input1=reader.nextInt();
				frst.setstart(input1);
				input2=reader.nextInt();
				frst.setend(input2);
				mine.add(frst);
	}
	Collections.sort(mine, new Comparator<setlocal>() {
        @Override
		public int compare(setlocal o1, setlocal o2) {
			// TODO Auto-generated method stub
        	if(o1.start>o2.start)
			return 1;
        	else if(o1.start==o2.start)
    			return 0;
        	else
        		return -1;
		}
    });
	System.out.println("Before: ");
	for(setlocal e : mine){
		System.out.println(e.start+"--"+e.end);
			}
	System.out.println("Enter the new set: ");
	setlocal second=new setlocal();
	input1=reader.nextInt();
	second.setstart(input1);
	input2=reader.nextInt();
	second.setend(input2);
	mine.add(second);
	//mine.add(second);
	Collections.sort(mine, new Comparator<setlocal>() {
        @Override
		public int compare(setlocal o1, setlocal o2) {
			// TODO Auto-generated method stub
        	if(o1.start>o2.start)
			return 1;
        	else if(o1.start==o2.start)
    			return 0;
        	else
        		return -1;
		}
    });
	
	System.out.println("After Insertion: ");
	for(setlocal e : mine){
		System.out.println(e.start+"--"+e.end);
			}
	int j=0;
	for(int i=0;i<mine.size();i++){
		j=i+1;
		if(j<mine.size())
		if(mine.get(i).end>mine.get(j).start){
			mine.get(i).end=mine.get(j).end;
			mine.remove(j);
		}
	}
	System.out.println("After Merge: ");
	for(setlocal e : mine){
		System.out.println(e.start+"--"+e.end);
			}
		
}

}
