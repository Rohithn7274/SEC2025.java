import java.util.Scanner;
class Str{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String a=sc.nextLine();
        String b=sc.nextLine();
        a=(a.toUpperCase());
        b=(b.toLowerCase());
        System.out.println(a.length());
        System.out.println(a.charAt(4));
        if(a.equals(b))
        {
            System.out.println("Equal");
                }
            else
            {
                System.out.println("Not Equal");            
            }        
    }
}