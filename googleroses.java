
public class googleroses {
	static int gmax = -1;
	static int solution(int[] p, int k) {
        int start=0,end=p.length-1,cur=0;
        int day=check(start,end,k,p,cur);
        return day;
    }
    static int find(int start, int end, int k, int[] p,int cur){
        int day=cur+1;
        int left=(p[cur]-1)-1;
        int right=(p[cur]-1)+1;
        if(left-start+1==k || end-right+1==k){
            return day;
        }
        else if(left-start+1>k && end-right+1<k){
            cur++;
            return find(start,left,k,p,cur);
        }
        else if(left-start+1<k && end-right+1>k){
            cur++;
            return find(right,end,k,p,cur);
        }
        return -1;
    }
    //31542, 1 = 4
    //31542, 2 = -1
    static int check(int start,int end,int k,int[] p,int cur){
    	
    	if(end-start+1<k || end<=start || end<0 || start<0 || end>=p.length || start>=p.length ){
    		return cur;
    	}
    	else if(p[cur]>=start && p[cur]<=end){
    		return Math.max(check(start,p[cur]-2,k,p,cur+1),check(p[cur],end,k,p,cur+1));
    	}
    	else {
    		return check(start,end,k,p,cur+1);
    	}
    }
    static void check2(int start,int end,int k,int[] p,int cur,int left,int so_far_max){
    	if(left ==1){
    		//means left
    		if(p[cur]>=start && p[cur]<=end){
    			if(p[cur]==end){
    				if(so_far_max+1>gmax){
    					gmax=so_far_max+1;
    					check2( start, p[cur]-2, k, p, cur+1, 1, so_far_max+1);
            			check2(p[cur],end,k,p,cur+1,0,so_far_max+1);
    				}
    				check2( start, p[cur]-2, k, p, cur+1, 1, so_far_max);
        			check2(p[cur],end,k,p,cur+1,0,so_far_max);
    			}
    			check2( start, p[cur]-2, k, p, cur+1, 1, so_far_max);
    			check2(p[cur],end,k,p,cur+1,0,so_far_max);
    		}
    	}
    }
    public static void main(String args[]){
    	int[] P={3,1,5,4,2};
    	System.out.println(solution(P, 1));
    }
}
