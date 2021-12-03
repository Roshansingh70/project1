import java.util.Scanner;
public class second {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float marks;
        System.out.print("Enter the marks:");
        marks=sc.nextInt();
        if (marks>80){
            System.out.print("Your grade is : A");
        }
        if (marks>60 & marks<=80){
            System.out.print("Your grade is : B");
        }
        if (marks>50 & marks<=60){
            System.out.print("Your grade is : C");
        }
        if (marks>45 & marks<=50){
            System.out.print("Your grade is : D");
        }
        if (marks>25 & marks<=45){
            System.out.print("Your grade is : E");
        }
        if (marks<25){
            System.out.println("Your grade is : F");
            System.out.print("You are fail.");
        }



    }

}
