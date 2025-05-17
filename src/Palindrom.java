import java.util.Scanner;

public class Palindrom {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter number to check palindrome: ");
        int number = input.nextInt();
        int originalNumber = 121;
//        int number = 121;
        int reversedNumber = 0;
        while(number > 0){
            int reminder = number % 10;
            reversedNumber = reversedNumber * 10 + reminder;
            number = number/10;
        }
        if(originalNumber == reversedNumber){
            System.out.println("Palindrome");
        }else{
            System.out.println("Palindrome not");
        }
    }
}
