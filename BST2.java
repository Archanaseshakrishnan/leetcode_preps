class treenode1{
		public int data;
		public treenode1 left;
		public treenode1 right;
		public treenode1(int d1){
			data=d1;
			left=null;
			right=null;
		}
		public treenode1(){
			data=0;
			left=null;
			right=null;
		}
}
class tree1{
	public treenode1 root;
	public tree1(){
	//	System.out.println("tree1 constructor");
		root=null;
	}
	public void insert(int d1){
		if(root==null){
			root=new treenode1(d1);
			//System.out.println(root.data);
		}
		else{
			treenode1 temp=root;
			temp=insert1(temp,d1);
		}
	}
	
	public treenode1 insert1(treenode1 temp,int d1){
		if(temp==null){
			temp=new treenode1(d1);
		}
		else if(temp.data>d1){
			temp = insert1(temp.left,d1);
		}
		else if(temp.data<d1){
			temp = insert1(temp.right,d1);
		}
		 
		return temp;
	}
	public void inordertraversal(treenode1 temp){
		if(temp!=null){
			inordertraversal(temp.left);
			System.out.println(temp.data);
			inordertraversal(temp.right);
		}
	}
}
public class BST2 {
	public static void main(String args[]){
	tree1 main1=new tree1();
	main1.insert(5);
	main1.insert(6);
	main1.insert(4);
	//System.out.println(main1.root.data);
	main1.inordertraversal(main1.root);
	}
}
