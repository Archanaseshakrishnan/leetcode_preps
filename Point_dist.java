import java.io.*;
import java.util.*;
public class Point_dist {

	public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        System.out.println("Enter n: ");
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        
	        int[][] points=new int[n][4];
	        int[][] ref=new int[n][2];
	        for(int i=0;i<n;i++)
	            for(int j=0;j<4;j++)
	                points[i][j]=sc.nextInt();
	        
	        
	        //cases q point is centre
	        //case 1: 1st quadrant - >x, y>
	        //case 2: 2nd quadrant - <x, y>
	        //case 3: 3rd quadrant - <x, <y
	        //case 4: 4th quadrant - >x, <y
	        //case 5: x1==x2, >y change y to negative scale
	        //case 6: y1==y2, >x change x to negative scale
	        //case 7: x1==x2, <y change y to positive scale
	        //case 8: y1==y2, <x change x to positive scale
	        for(int i=0;i<n;i++){
	            if(points[i][0]==points[i][2])//same x value
	            {   ref[i][0]=points[i][0];
	                if(points[i][1]==points[i][3])
	                {
	                     ref[i][1]=points[i][1];
	                }
	                else if(points[i][1]>points[i][3]){
	                    //p's y is greater
	                    int dist=points[i][1]-points[i][3];
	                    ref[i][1]= points[i][3]+2*dist;
	                }
	             else{//p's y is smaller
	                 int dist=points[i][3]-points[i][1];
	                 ref[i][1]=points[i][3]-2*dist;
	             }
	            }
	            else if(points[i][1]==points[i][3])//same y value
	            {   ref[i][1]=points[i][1];
	                if(points[i][0]==points[i][2])
	                {
	                     ref[i][0]=points[i][0];
	                }
	                else if(points[i][0]>points[i][2]){
	                    //p's x is greater
	                    int dist=points[i][0]-points[i][2];
	                    ref[i][0]= points[i][2]+2*dist;
	                }
	             else{//p's x is smaller
	                 int dist=points[i][2]-points[i][0];
	                 ref[i][0]=points[i][2]-2*dist;
	             }
	            }
	            else if(points[i][0]>points[i][2]){
	                //p's x greater - only compare if y is lesser or greater
	                //if something is greater add the distance
	                // if something is lesser sub the distance
	                if(points[i][1]>points[i][3]){
	                    //x and y greater for p
	                    int dist1=points[i][0]-points[i][2];
	                    int dist2=points[i][1]-points[i][3];
	                    ref[i][0]=points[i][0]+dist1;
	                    ref[i][1]=points[i][1]+dist2;
	                }
	                else if(points[i][1]<points[i][3]){
	                    //x greater and y lesser for p
	                    int dist1=points[i][0]-points[i][2]; 
	                    int dist2=points[i][3]-points[i][1];
	                    ref[i][0]=points[i][0]+dist1;
	                    ref[i][1]=points[i][1]-dist2;
	                }
	            }
	            else if(points[i][0]<points[i][2]){
	                //p's x is lesser
	                if(points[i][1]>points[i][3]){
	                    //x lesser and y greater for p
	                    int dist1=points[i][2]-points[i][0]; 
	                    int dist2 = points[i][1]-points[i][3];
	                    ref[i][0]=points[i][0]-dist1;
	                    ref[i][1]=points[i][3]+dist2;
	                }
	                else if(points[i][1]<points[i][3]){
	                    //x and y lesser for p
	                    int dist1=points[i][2]-points[i][0]; 
	                    int dist2=points[i][3]-points[i][1];
	                    ref[i][0]=points[i][2]+dist1;
	                    ref[i][1]=points[i][3]+dist2;
	                }
	                
	            }
	        }
	        for(int i=0;i<n;i++){
	            System.out.print(ref[i][0]);
	            System.out.print(" ");
	            System.out.print(ref[i][1]);
	            System.out.println();
	        }
	    }
	}
