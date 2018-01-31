package com.company;
import java.util.Scanner;

public class Main {
    public static final int EXIT_CODE = 0;
    public static void main(String[] args) {
        Main objektas = new Main();
    }

    public Main(){
        float a=0;
        float suma=0;
        do {
            a=duokGarantuotaiSkaiciu();
            suma+=a;
        } while (a!=EXIT_CODE);
        System.out.println("Suma: " + suma);
    }

    public float duokGarantuotaiSkaiciu(){
        float rezultatas = 0;

        Scanner sc = new Scanner(System.in);
        boolean arPavyko=false;
        while (arPavyko==false){
            System.out.println("Iveskite skaiciu: ");
            try {
                rezultatas = sc.nextFloat();
                arPavyko=true;
            }catch(Exception klaida){
                System.out.println("Ivestas tekstas yra ne skaicius");
                sc.next();
            }
        }
        return rezultatas;
    }
}
