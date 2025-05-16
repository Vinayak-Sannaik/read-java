import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int a = 12, b = 2, c = 9;
        if(a > b && a > c){
            System.out.println(a + " is greater");
        }else if(c > a && c > b){
            System.out.println(c + " is greater");
        }else{
            System.out.println(b + " is greater");
        }
    }
}