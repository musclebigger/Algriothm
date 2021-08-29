import java.util.Arrays;

public  class Sorting {
    /**
     * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
     * @param input
     * @return
     */
    public static int[] poping(int[] input){
        //比较数字首位，找出最小的所有
        //如果首位数字都相同，第二位做比较，没有第二位数字视为最大，按照最小排序
        //如果第二位相同，遵循第二部
        //tips:使用compareTO而不是boolean原因是comparTo不会栈溢出，当数字过大时。
        for(int i=0;i< input.length-1;i++){
            for(int j=0;j< input.length-1-i;j++){
                if ((""+input[j]+""+input[j+1]).compareTo(""+input[j+1]+""+input[j])>0){
                    int temp= input[j];
                    input[j]= input[j+1];
                    input[j+1]=temp;
                }
            }
        }

        return input;
    }

    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     * @param nums
     * @return
     */
    public int [] moveZeroes(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]+nums[j+1]==nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }





}
