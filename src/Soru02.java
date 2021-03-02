import java.util.Scanner;

public class Soru02 {

        public static void main(String[] args) {
            //Kullanıcıdan alınan sayının negatif yada pozitif olduğunu yazdıran programı giriniz.

            Scanner scan = new Scanner(System.in);
            System.out.print("Bir sayı girin:");

            int sayi = scan.nextInt();

            if (sayi < 0)
                System.out.println(sayi + " Negatiftir.");

            else if ( sayi > 0)
                System.out.println(sayi + " Pozitiftir.");

            else
                System.out.println(sayi + "  Sıfırdır.");
        }
    }


