class Solution {

 static int left(int[] a,int target,int l,int r){
	     while(l<=r){
	            int mid=(l+r)/2;
	            if(a[mid]>=target){
	                r=mid-1;
	            }else{
	                l=mid+1;
	            }
	        }
	    if(l>=a.length){
	        return-1;
	    }
	    if(a[l]!=target){
	        return -1;
	    }
	    // System.out.println(l+" "+r);
	       return l;
	        
	}

static int right(int[] a,int target,int l,int r){
	     while(l<=r){
	            int mid=(l+r)/2;
	            if(a[mid]>target){
	                r=mid-1;
	            }else{
	                l=mid+1;
	            }
	        }
	        if(r<0){
	            return -1;
	        }
	        if(a[r]!=target){
	            return -1;
	        }
	    // System.out.println(l+" "+r);
	       return r;
	        
	}
    public int[] searchRange(int[] nums, int target) {
	        int l=0;
	        int r=nums.length-1;
           
	       int lm=left(nums,target,l,r);
           int rm=right(nums,target,l,r);
	        int[] res={lm,rm};
           return res;
		}
    }
