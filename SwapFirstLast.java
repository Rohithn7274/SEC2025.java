public class SwapFirstLast{
    public static void main(String[] args){
        int[] arr = {1,2,2,1,2,0,3,2,2,3,0,1,1,2,1,2};
        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        for(int num : arr){
            System.out.println(num + " ");
        }
        System.out.println();
    }
}