public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int maxdiff=Integer.MAX_VALUE;
        int diff=0;
        int result=0;
        int sum;
        int left,right;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            left=i+1;
            right=nums.length-1;
            while(left<right){
            sum=nums[i]+nums[left]+nums[right];
            if(sum==target){
                return target;
            }
            diff=Math.abs(sum-target);
            if(diff<maxdiff){
                maxdiff=diff;
                result=sum;
            }
            if(sum<target){
                left++;
            }
            else{
                right--;
            }
            }
        }
        return result;
    }
} 
