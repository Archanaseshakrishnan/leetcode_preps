import java.util.ArrayList;
import java.util.List;
//in spiralmatrix 2 fill out a matrix and call this function
public class spiral_matrix {
public static void main(String[] args){
	int[][] mat={
			{1}
	};
	List<Integer> res=new ArrayList<Integer>();
	res = spiral(mat);
	System.out.println(res);
	int n=4,sum=1;
	int[][] mat2=new int[4][4];
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++)
		{	mat2[i][j]=sum; sum++;}
	}
	System.out.println("this is 2: ");
	for(int i=0;i<n;i++)
		{for(int j=0;j<n;j++)
			{System.out.print(mat2[i][j]);System.out.print(" ");}
		System.out.println();
		}
	List<Integer> res2=new ArrayList<Integer>();
	res2 = spiral(mat2);
	System.out.println(res2);
}
public static List<Integer> spiral(int[][] matrix){
	int row,col,strtrow,strtcol,endrow,endcol;
	row = matrix.length;
	col = matrix[0].length;
	System.out.println(row);
	System.out.println(col);
	List<Integer> arr = new ArrayList<Integer>();
	//int number_of_elts = row*col;
	endrow = row; 
	endcol = col;
	strtcol = 1;
	strtrow = 1;
	int circle = (row*2)+(col*2)-4;
	System.out.println(circle);
	//cover all circles
	while(circle>=4 && endrow-strtrow>=1 && endcol-strtcol>=1){
		System.out.println("yes");
		arr.addAll(fun(strtrow,endrow,strtcol,endcol,matrix));
		System.out.println(arr);
		strtrow++; strtcol++;
		endrow--; endcol--;
		circle = (endrow*2)+(endcol*2)-4;
	}
	System.out.println(strtrow);
	System.out.println(endrow);
	System.out.println(strtcol);
	System.out.println(endcol);
	//System.out.println(matrix[strtrow-1][strtcol-1]);
	//conditions in which 1 column or 1 row or just an elt remains
	if(strtrow==endrow)//case of 1 col
	{
		if(strtcol==endcol)// 1 elt
		{
			arr.add(matrix[strtrow-1][strtcol-1]);
		}
		else{
			for(int i=strtcol-1;i<=endcol-1;i++)
				arr.add(matrix[strtrow-1][i]);
		}
	}
	else if(strtcol==endcol)//case of 1 row
	{
		if(strtrow==endrow)// 1 elt
		{
			arr.add(matrix[strtrow-1][strtcol-1]);
		}
		else{
			for(int i=strtrow-1;i<=endrow-1;i++)
				arr.add(matrix[i][strtcol-1]);
		}
	}
	return arr;	
}
private static ArrayList<Integer> fun(int strtrow, int endrow, int strtcol, int endcol, int[][] matrix) {
	// TODO Auto-generated method stub
	ArrayList<Integer> res=new ArrayList<Integer>();
	strtrow--;endrow--;strtcol--;endcol--;
	//for start row
	for(int i=strtcol;i<=endcol;i++){
		res.add(matrix[strtrow][i]);
	}
	//next col
	for(int i=strtrow+1;i<=endrow;i++){
		res.add(matrix[i][endcol]);
	}
	//end row
	for(int i=endcol-1;i>=strtcol;i--){
		res.add(matrix[endrow][i]);
	}
	//first col
	for(int i=endrow-1;i>=strtrow+1;i--){
		res.add(matrix[i][strtcol]);
	}
	return res;
}

}
