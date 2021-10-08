package offer11;

/*
旋转数组
 */
public class Solution1 {
    public int minArray(int[] numbers) {
        int temp = numbers[0];
        for(int i=0; i<numbers.length; ++i){
            if(numbers[i]<temp){
                return numbers[i];
            }else{
                temp = numbers[i];
            }
        }
        return numbers[0];
    }
}
