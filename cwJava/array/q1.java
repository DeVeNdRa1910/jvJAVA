package cwJava.array;

public class q1 {
    public static void main(String[] args) {
        //target sum
        int[] arr = {4,6,2,3,5,8,9,1};
        int tsum =7;
        System.out.println(targetSum(arr , tsum));
    }
    public static int targetSum(int[] arr , int tsum){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if((arr[i]+arr[j]) == tsum ){
                    count++;
                }
            }
        }
        return count;

    }
}
