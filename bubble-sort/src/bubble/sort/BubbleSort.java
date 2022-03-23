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
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jumlah, i , j, swap, choice;
        String lanjut;
        boolean running = true;
        
        //Scanner untuk mengambil input user jika ingin mengulang program
        Scanner jawab = new Scanner(System.in);
        
        //Pengulangan program jika variabel bernilai true
        while(running){
            //Scanner untuk mengambil jumlah angka yang mau diurutkan
            Scanner scan = new Scanner(System.in);
            
            //Scanner untuk memilih metode pengurutan
            Scanner s = new Scanner(System.in);
            
            System.out.println("==================================================");
            System.out.println("Program Pengurutan Angka Dengan Metode Bubble Sort");
            System.out.println("--------------------------------------------------");
            
            System.out.println("Masukkan Jumlah Bilangan Yang Ingin Diinput :");
            
            //Mengambil input jumlah bilangan yang mau diurutkan
            jumlah = scan.nextInt();
            
            //Memasukkan jumlah input ke dalam Array
            int array[] = new int[jumlah];
            
            System.out.println("\nMasukkan " + jumlah + " Buah Bilangan Integer");
            System.out.println("-------------------------------------------");
            
            //Pengulangan angka sesuai dengan jumlah angka yang diinput
            for(i=0; i<jumlah; i++)
            {
                System.out.println("Bilangan Ke- " + (i+1) + " =");
                
                array[i]=scan.nextInt();
            }
            
            System.out.println("----------------------------------------");
            System.out.println("Pilih Metode Pengurutan :");
            System.out.println("1. Sorting Ascending");
            System.out.println("2. Sorting Descending");
            System.out.print("Metode Yang Dipilih : ");
            
            //Menangkap input yang dipilih user untuk metode pengurutan
            choice = s.nextInt();
            System.out.println("---------------------------------------------");
            
            //Pengkondisian jika user memilih metode Ascending
            if(choice == 1){
                System.out.println("Bilangan Belum Terurutnya");
                for(int a=0;a<jumlah;a++)
                {
                    System.out.print(array[a] +" ");
                }
                
                for(i=0;i<(jumlah-1);i++)
                {
                    for(j=0;j<jumlah-i-1;j++)
                    {
                        if(array[j] > array[j+1])
                        {
                            swap = array[j];
                            array[j] = array[j+1];
                            array[j+1] = swap;
                        }
                    }
                }
                
                System.out.println("\n-------------------------------------------");
                System.out.println("Bilangan Terurutnya adalah ");
                for(i=0;i<jumlah;i++)
                System.out.print(array[i] +" ");
                
                System.out.println("\n===========================================");
                System.out.println("Apakah anda ingin keluar?");
                System.out.print("Jawab [ya/tidak]> ");
                
                //Menangkap input user untuk mengulang program 
                lanjut = jawab.nextLine();
                
                //cek jawabannya, kalau "ya" maka berhenti mengulang program
                if(lanjut.equalsIgnoreCase("ya")){
                    running = false;
                }
            }
            
            //Pengkondisian jika user memilih Descending
            if(choice == 2){
                System.out.println("Bilangan Belum Terurutnya");
                for(int a=0;a<jumlah;a++)
                {
                    System.out.print(array[a] +" ");
                }
                
                for(i=0;i<(jumlah-1);i++)
                {
                    for(j=0;j<jumlah-i-1;j++)
                    {
                        if (array[j] < array[j+1])
                        {
                            swap = array[j];
                            array[j] = array[j+1];
                            array[j+1] = swap;
                        }
                    }
                }
                
                System.out.println("\n------------------------------------");
                System.out.println("Bilangan Terurutnya adalah :");
                for(i=0;i<jumlah;i++)
                System.out.print(array[i] +" ");
                
                System.out.println("\n======================================");
                System.out.println("Apakah anda ingin keluar?");
                System.out.print("Jawab [ya/tidak]> ");
                
                //Menangkap input user untuk mengulang program
                lanjut = jawab.nextLine();
                
                //Cek jawabannya, kalau "ya" maka berhenti mengulang
                if(lanjut.equalsIgnoreCase("ya")){
                        running = false;
                    }
                }
            }
            
        }
    }
