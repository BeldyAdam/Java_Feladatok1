package javafeladatok1;

import java.util.Random;
import java.util.Scanner;


public class JavaFeladatok1 {

    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // 1. Feladat
        int rSzam = rnd.nextInt(3, 11);
        
        // 2. Feladat / 3. Feladat
        System.out.println("Kérek egy tetszőleges betűt!");
        String bekertBetu = sc.nextLine();
        while(bekertBetu.length() > 1){
            System.out.println("Kérek egy tetszőleges betűt!");
            bekertBetu = sc.nextLine();
        }
        
        // 4. Feladat
        for (int i = 0; i < rSzam-1; i++) {
            System.out.printf("%s, ",bekertBetu);
        }
        System.out.printf("%s\n", bekertBetu);
        
        // 5. Feladat
        
        double[] valosSzamokTomb = new double[5];
        valosSzamokTomb[0] += Math.PI;
        System.out.printf("%f, ",valosSzamokTomb[0]);
        for (int i = 1; i < valosSzamokTomb.length; i++) {
            valosSzamokTomb[i] += Math.E;
            System.out.printf("%f, ",valosSzamokTomb[i]);
        }
        System.out.println("");
        
        // 6. Feladat
        
        valosSzamokTomb[2] = 1.0 / 3;
        for (int i = 0; i < valosSzamokTomb.length; i++) {
            if(valosSzamokTomb[i] > 0){
                System.out.printf("%f, ", valosSzamokTomb[i]);
            }else{
                System.out.print(" ");
            }
        }
        
        // 7. Feladat
        for (int i = 0; i < valosSzamokTomb.length; i++) {
            if(valosSzamokTomb[i] > 10.1 && valosSzamokTomb[i] <= 19.5){
                rSzam = rnd.nextInt(3, 11);
                valosSzamokTomb[i] = (double)rSzam;
            }
        }
    }
    
}
