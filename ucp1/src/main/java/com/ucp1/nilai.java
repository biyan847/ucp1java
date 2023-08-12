package com.ucp1;

import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda: ");
        int nilai = scanner.nextInt();

        scanner.close();
    
    
        if(nilai >= 80 && nilai <= 100){
            System.out.println("Nilai Anda adalah A");
        }else if  (nilai >= 77 && nilai <= 79){
            System.out.println("Nilai Anda adalah A-");
        }else if  (nilai >= 75 && nilai <= 77){
            System.out.println("Nilai Anda adalah A/B");
        }else if  (nilai >= 72 && nilai <= 74){
            System.out.println("Nilai Anda adalah B+");
        }else if  (nilai >= 77 && nilai <= 72){
            System.out.println("Nilai Anda adalah B");
        }else if  (nilai >= 67 && nilai <= 69){
            System.out.println("Nilai Anda adalah B-");
        }else if  (nilai >= 65 && nilai <= 67){
            System.out.println("Nilai Anda adalah B/C");
        }else if  (nilai >= 62 && nilai <= 64){
            System.out.println("Nilai Anda adalah c+");
        }else if  (nilai >= 60 && nilai <= 62){
            System.out.println("Nilai Anda adalah c");
        }else if  (nilai >= 55 && nilai <= 59){
            System.out.println("Nilai Anda adalah C-");
        }else if  (nilai >= 50 && nilai <= 54){
            System.out.println("Nilai Anda adalah C/D");
        }else if  (nilai >= 45 && nilai <= 49){
            System.out.println("Nilai Anda adalah D");
        }
         else {
            System.out.println("Nilai Anda adalah E");
        }
        
    }
}