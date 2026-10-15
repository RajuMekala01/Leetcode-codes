class Solution {
    public int[] productExceptSelf(int[] nums) {
        int answer[]=new int[nums.length];
        int n=nums.length;
        // for(int i=0;i<n;i++){
        //     int product=1;
        //     for(int j=0;j<n;j++){
        //         if(i!=j){
        //             product=product*nums[j];
        //         }
        //     }
        //     answer[i]=product;
        // }
        // return answer;

        //prefix array--
        answer[0]=1;
        for(int i=1;i<n;i++){
            answer[i]=answer[i-1]*nums[i-1];
        }

        //suffix
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            answer[i]=suffix*answer[i];

            suffix=suffix*nums[i];
        }

return answer;


    }
}