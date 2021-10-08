package offer11;

/*
二分法，时间按复杂度O(logn)
 */
public class Solution2 {
    public int minArray(int[] numbers) {
        int head = 0;
        int rear = numbers.length-1;
        while(head < rear){
            int mid = (rear - head)/2 + head;
            if(numbers[mid]>numbers[rear]){
                head = mid + 1;
            }else if(numbers[mid]<numbers[rear]){
                rear = mid;
            }else{
                --rear;
            }
        }
        return numbers[head];
    }
}
