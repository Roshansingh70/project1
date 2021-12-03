import java.util.Scanner;
public class checkplaindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Data representation
//step 2 input
        System.out.print("Type true for male of false for female:");
        boolean male = sc.nextBoolean();
        System.out.print("Enter age:");
        int age = sc.nextInt();
        if (male)
        {
            if (age < 20)
                System.out.print("he is a man:");
            else
                System.out.print("he is a boy:");
        }
        else
        {
            if (age < 20)
                System.out.print("she is a woman:");
            else
                System.out.print("she is a girl:");
        }


    }
}




