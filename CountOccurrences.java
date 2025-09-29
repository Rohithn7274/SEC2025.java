public class CountOccurrences{
    public static void main(String[] args){
        int[] arr = {0,2,2,1,2,0,3,2,2,3,0,1,1,2,1,0};
        int y=2;
        int freq =0;
        for(int num : arr){
            if(num==y)freq++;
        }
        System.out.println(y + " appears: " + freq + " times");
    }
    
}
