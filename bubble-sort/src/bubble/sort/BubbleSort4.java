/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble.sort;

import java.util.Scanner;

/**
 *
 * @author Aldy
 */
public class BubbleSort4 {
    
        public static void main(String[] args){
            int jumlah, i, j, swap, choice;
            String lanjut;
            boolean running = true;
            
            Scanner jawab = new Scanner(System.in);
            
            while(running){
                Scanner scan = new Scanner(System.in);
                Scanner s = new Scanner(System.in);
                
                System.out.println("=============================================");
                System.out.println("---------Bubble Short - Aldy Tarigan---------");
                System.out.println("=============================================");
                
                System.out.print("Masukkan Jumlah Bilangan Yang Ingin Diinput : ");
                
                jumlah = scan.nextInt();
                
                int array[] = new int[jumlah];
                
                System.out.println("\nMasukkan " + jumlah + " Buah Bilangan");
                System.out.println("---------------------------------------------");
                
                for(i=0; i<jumlah; i++)
                {
                    System.out.print("Bilangan Ke- " + (i+1) + " = ");
                    
                    array[i] = scan.nextInt();
                }
                
                System.out.println("=============================================");
                System.out.println("Pilih Metode Pengurutan !");
                System.out.println("1. Sorting Ascending");
                System.out.println("2. Sorting Descending");
                System.out.print("Metode Yang Dipilih : ");
                
                choice = s.nextInt();
                System.out.println("---------------------------------------------");
                
                if(choice == 1){
                    System.out.print("Bilangan Belum Terurutnya : ");
                    for(int a=0; a<jumlah; a++)
                    {
                        System.out.print(array[a] + " ");
                    }
                    for(i=0; i<(jumlah-1); i++){
                        for(j=0; j<jumlah-i-1; j++){
                            if(array[j] > array[j+1]){
                                swap = array[j];
                                array[j] = array[j+1];
                                array[j+1] = swap;
                            }
                        }
                    }
                            
                    System.out.println("");
                    System.out.println("Bilangan Terurutnya : ");
                    for(i=0; i<jumlah; i++)
                    System.out.print(array[i] + " ");
                }
            }
        }
}
