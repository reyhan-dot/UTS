/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uts_pbo_kelompok_3;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class UTS_PBO_kelompok_3 {

    private static Object input;
    

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
        Mahasiswa[] daftarMhs = new Mahasiswa[10];
        int jumlah = 0;
        
        while(true){
            System.out.println("\n=== MENU MENEJEMEN MAHASISWA ===\n");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Semua Mahasiswa");
            System.out.println("3. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("4. Tampilkan Mahasiswa yang Lulus");
            System.out.println("5. Naikkan Semester Semua Mahasiswa");
            System.out.println("6. Keluar");
            
            System.out.print("Pilih Menu: ");
            int pilihan = scanner.nextInt();
             scanner.nextLine();
             
            switch (pilihan){
                
                case 1 :
                System.out.println("Tambahkan Mahasiswa:");
                        
                if (jumlah <10){
                 System.out.print("Masukkan Nama: ");
                String name = scanner.nextLine();
                
                
                System.out.print("Masukkan NIM: ");
                int nim = scanner.nextInt();
                scanner.nextLine();
                
                System.out.print("Masukkan Jurusan: ");
                String jurusan = scanner.nextLine();
                
                System.out.print("Masukkan Semester: ");
                int semester = scanner.nextInt();
                
                System.out.print("Masukkan IPK: ");
                Double ipk = scanner.nextDouble();
                
            
                Mahasiswa mhs = new Mahasiswa(nim, name, jurusan, semester, ipk);
                    daftarMhs[jumlah] = mhs;
                    jumlah++;
                    
                }else {
                    System.out.println("Data Penuh");
                }
                
                case 2 :
                    for (int i = 0; i < jumlah; i++) {
                    daftarMhs[i].tampilkanData();
                }
                    
                case 3:
                System.out.println("Cari Berdasarkan NIM: ");
                int cariNim = scanner.nextInt();
                scanner.nextLine();

                boolean ditemukan = false;

                for (int i = 0; i < jumlah; i++) {
                    if (daftarMhs[i].getNim() == cariNim) {
                    System.out.println("Data ditemukan:");
                    daftarMhs[i].tampilkanData();
                    daftarMhs[i].getNim();
                    ditemukan = true;
                    break;
                    }
                }

                if (!ditemukan) {
                System.out.println("Data tidak ditemukan!");
                }
                
                case 4:
                System.out.println("Mahasiswa yang Lulus: ");
                boolean ada = false;

                for (int i = 0; i < jumlah; i++) {
                    if (daftarMhs[i].isLulus()) {
                    daftarMhs[i].tampilkanData();
                    daftarMhs[i].getNim();
                    ada = true;
                    }
                }

                if (!ada) {
                System.out.println("Tidak ada mahasiswa yang lulus.");
                }  
                
                case 5:    
                System.out.println("Semester Dinaikkan");
                
                for (int i = 0; i < jumlah; i++) {
                daftarMhs[i].naikSemester();
                }
                
                case 6:
                System.out.println("Program Berakhir");
                break; 

            }
            scanner.close();
        }
                
            
    }  
    
}
