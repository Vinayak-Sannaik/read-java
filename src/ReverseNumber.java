public class ReverseNumber {
    public static void main(String args[]){
        int number = 1234;
        int reversedNumber = 0;
        while(number > 0){
            int reminder = number % 10;
            reversedNumber = reversedNumber * 10 + reminder;
            number = number/10;
        }
        System.out.println(reversedNumber);
    }
}
