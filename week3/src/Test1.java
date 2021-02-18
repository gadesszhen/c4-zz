import java.util.*;


public class Test1 {
    public static List<List<Integer>> threeSum(int[] nums,int target) {
//结果链表
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        //先进行排序
        Arrays.sort(nums);
        for(int i = 0;i < len-2; i ++){
            //大于0提前结束
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==target){
                    //数字一样跳过 防止重复
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right&&nums[left]==nums[left+1])
                        left++;
                    while(left<right&&nums[right]==nums[right-1])
                        right--;
                    left ++;
                    right --;
                }
                //小 右移
                else if(sum <0) left++;
                    //大 左移
                else  if(sum>0) right--;
            }
        }
        return res;
    }
    public static void main(String args[]){
        System.out.println("Please input the length of your list：");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("Please input your list:");
        for (int i=0;i<n;i++){
            nums[i] = in.nextInt();
        }
        System.out.println("Please input the target:：");
        int target = in.nextInt();
        System.out.println("The output is "+threeSum(nums,target));
    }
}
