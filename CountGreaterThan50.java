public class CountGreaterThan50{
    public static void main(String[] var0){
        int[] arr = new int[]{0,2,2,1,2,0,3,2,2,3,0,1,1,2,1,0};
        int count = 0;
        for(int num : arr){
             if(num>50)count ++;
        }
        System.out.println("Count>50: "+count);
    }
}