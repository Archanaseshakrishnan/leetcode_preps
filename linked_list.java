class Link{
	public int data;
	public Link next;
	public Link(int d1){
	data=d1; next=null;
	}
	/*public Link(Link node, int d1){
		next=node;
		data=d1;
	}*/
/*	public void printLink(){
		System.out.println("{ "+data+" }");
	}*/
}
class LinkList{
	private Link first;
	public LinkList(){
		first=null;
	}

	public void insert(int d1,int pos){
		Link link=new Link(d1);
		//first insert
		if(first==null)
			{
			//System.out.println(x);
			first=link;
			}
		else{
			int i=0,j=0;
			Link temp=first;
			Link cur=first;
			while(cur!=null){
				i++;
				cur=cur.next;
			}
			while(temp.next!=null && j<pos-1 && j<i){
				j++;
				temp=temp.next;
			}
			//insertion at top - for queue and stack
			if(pos!=0){
			if(temp.next!=null)
				{
				link.next=temp.next; 
				}
			temp.next=link;}
			//insertion at first 
			else
			{
				link.next=first;
				first=link;
			}
			//first=temp;
			
		}
	}
	public void printList(){
		Link cur=first;int i=0;
		while(cur!=null){
			System.out.println("i= "+i+" : "+cur.data);
			i++;
			cur=cur.next;
		}
	}
	public int delete(int val){
		Link temp=first;
		int i=0;
		int pos=find(val);
		int len=lengt();
		int result = 0;
		if(pos!=0 && pos<len-1){
			while(i<pos-1){
				temp=temp.next;i++;
			}
			result=temp.next.data;
			temp.next=temp.next.next;
		}
		//deletion at first - queue
		else if(pos==0){
			result=first.data;
			first=first.next;
			
		}
		// deletion at lastpos - stack
		else{
			while(temp.next.next!=null)
				temp=temp.next;
			result=temp.next.data;
			temp.next=null;
		}
		return result;
	}
	public int lengt() {
		// TODO Auto-generated method stub
		Link temp=first;
		int len=0;
		while(temp!=null){
			len++; temp=temp.next;
		}
		return len;
	}
	public int find(int val) {
		// TODO Auto-generated method stub
		int i=0;
		Link temp=first;
		while(temp!=null){
			if(temp.data==val){
				return i;
			}
			else{
				i++;temp=temp.next;
			}
		}
		return -1;
	}
}
public class linked_list {
public static void main(String args[]){
	LinkList nl=new LinkList();
	nl.insert(8, 0);
	nl.insert(91, 1);
	nl.insert(19, 1);
	nl.insert(20, 0);
	nl.insert(9, 4);
	nl.printList();
	System.out.println(nl.find(20));
	System.out.println(nl.lengt());
	nl.delete(9);
	nl.printList();
	System.out.println("--------------");
	nl.insert(90, 4);
	nl.printList();
	
}
}
