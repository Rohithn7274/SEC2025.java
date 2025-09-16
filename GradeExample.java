public class GradeExample{
    public static void main(String[] args){
        int marks=83;
        String grade=(marks>=90)?"A":(marks>=75)?"B":(marks>=50)?"C":"F";
        System.out.println("Grade: "+grade);
    }
}