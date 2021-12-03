import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        //1234
        int rem = 0;
        int reversed =0 ;
        while(num !=0){
            rem = num % 10;
            reversed = reversed * 10 + rem;
            num = num/ 10;
        }
        System.out.println("Reverse of a number is ;" + reversed);
    }
}