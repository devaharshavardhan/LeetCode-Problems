class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f=First(nums,target);
        int l=Last(nums,target);
        return new int[]{f,l};}
        private int First(int[] nums,int target){
            int s=0;
            int e=nums.length-1;
            int res=-1;
            while(s<=e){
                int mid=s+(e-s)/2;
                if(nums[mid]==target){
                    res=mid;
                    e=mid-1;
                }
                else if(nums[mid]<target) s=mid+1;
                else e=mid-1;
            }return res;
            }
            private int Last(int[] nums,int target){
            int s=0;
            int e=nums.length-1;
            int res=-1;
            while(s<=e){
                int mid=s+(e-s)/2;
                if(nums[mid]==target){
                    res=mid;
                    s=mid+1;
                }
                else if(nums[mid]<target) s=mid+1;
                else e=mid-1;
            }return res;
        }
    }
