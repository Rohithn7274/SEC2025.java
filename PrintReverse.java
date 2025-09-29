public class PrintReverse{
    public static void main(String[] args){
        int[] arr = {8,3,9,3,3,9,22,993,993,3,3,3,999,32};
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}