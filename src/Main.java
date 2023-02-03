import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Armstrong sayı
        System.out.println("Bir sayı giriniz : ");
        int number= scanner.nextInt();
        int total = 0;
        int number = number;
        int basNumber = 0;
        int basValue ;
        int basPow ;

        while (number != 0) {
            number /= 10;
            basNumber++;
        }
        number = number ;

        while (number != 0) {
            basValue = number % 10;
            basPow = 1;

            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;

            }
            total += basPow ;
            number /= 10;
        }
         if (total == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        }
        else {
            System.out.println(number + " sayısı bir Armstrong sayı değildir.");
        }

         */
        // basamak sayıları toplamı
        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        int basValue = 0 , total = 0 ;

        while (number != 0){
           basValue = number % 10 ;
           total += basValue ;
           number /= 10 ;

        }
        System.out.println("basamak sayıları toplamı : " + total);
    }
}