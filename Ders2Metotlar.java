package JavayaGiris1;
import JavayaGiris2.Ogrenci;

import java.util.Scanner;
public class Ders2Metotlar {
    //fonx(metotlar) dersi
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        //soru1: fonx(x)=x^2+2x-9
        //soru2: power(x,y)=x^y
        fonx(3);
        power(3,4);


    }

    static void fonx(int x){

        int result=(x*x)+(2*x)-9;
        System.out.println("\nAnswer to Question 1: "+result);

    }

    static void power(int x,int y){

        int result=1;
        for(int i=1;i<=y;i++){
            result *= x;
        }
        System.out.println("Answer to Question 2: "+ result);

    }






}
