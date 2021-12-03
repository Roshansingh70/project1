import java.util.Scanner;
public class addnumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int sum = 0;
        int individual_num = 0;
        while (num != 0){
            individual_num = num % 10;
            sum = sum + individual_num;
            num = num /10;
        }
        System.out.println("The sum of digits of the number is " + sum);
    }
}