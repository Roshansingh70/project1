
import java.util.Scanner;
public class first{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float length;
        float breadth;
        float result;
        System.out.print("Enter the length:");
        length= sc.nextInt();
        System.out.print("Enter the breadth:");
        breadth= sc.nextInt();
        result= length*breadth;
        System.out.println("the area of rectangle is:"+result);
        int sqrt = (int) Math.sqrt(result);
        if (sqrt*sqrt ==result){
            System.out.print("it is perfect square");
        }else{
            System.out.print("It is not a perfect square");
        }




    }

}
