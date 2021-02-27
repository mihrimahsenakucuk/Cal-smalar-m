import java.util.Scanner;

public class Soru01 {

    public static void main (String[] args){

        //1'den 100'e kadar olan sayılardan 3'e bölünen sayıları , 5'e bölünen sayıları ve 3 ile 5' e ortak bölünen sayıları yazdıran programı giriniz .


      Scanner scan = new Scanner(System.in);
      System.out.println("3'e bölünen sayılar: ");
      for(int i =1 ; i <= 100 ; i++){

          if(i % 3 == 0){
              System.out.print(i+ ", ");
          }
      }

      System.out.println("\n\n5'e bölünen sayılar: ");
      for(int i = 1 ; i <= 100 ; i++){
          if(i%5==0){
              System.out.print(i+ ", ");
          }
      }

      System.out.println("\n\n3 ve 5'e ortak bölünen sayılar: ");
      for(int i = 1 ; i <= 100 ; i++){
          if(i % 3 == 0 &  i % 5 == 0){
              System.out.print(i + ", ");
          }
      }

        System.out.println("\n");
    }



}
