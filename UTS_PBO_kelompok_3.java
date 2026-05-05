
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uts_pbo_kelompok_3;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class UTS_PBO_kelompok_3 {

    

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in) ;
            Mahasiswa[] daftarMhs = new Mahasiswa[10];
            int jumlah = dataMeneger.muatData(daftarMhs);
           
            int pilihan;
            
            
            do{
                System.out.println("\n=== MENU MENEJEMEN MAHASISWA ===\n");
                System.out.println("1. Tambah Mahasiswa");
                System.out.println("2. Tampilkan Semua Mahasiswa");
                System.out.println("3. Cari Mahasiswa Berdasarkan NIM");
                System.out.println("4. Tampilkan Mahasiswa yang Lulus");
                System.out.println("5. Naikkan Semester Semua Mahasiswa");
                System.out.println("6. Keluar");
                
                System.out.print("Pilih Menu: ");
                
                pilihan = Integer.parseInt(scanner.nextLine());
                
                
                switch (pilihan){
                    
                    case 1 :
                        System.out.println("Tambahkan Mahasiswa:");
                        
                        if (jumlah <10){
                            
                            System.out.print("Masukkan Nama: ");
                            String name = scanner.nextLine();
                            
                            System.out.print("Masukkan Jurusan: ");
                            String jurusan = scanner.nextLine();
                            
                            System.out.print("Masukkan NIM: ");
                            int nim = scanner.nextInt();
                            
                            System.out.print("Masukkan Semester: ");
                            int semester = scanner.nextInt();
                            
                            System.out.print("Masukkan IPK: ");
                            double ipk = scanner.nextDouoble();
                            
                            daftarMhs[jumlah++] = new Mahasiswa(nim, name, jurusan, semester, ipk);
                            
                            dataMeneger.simpanData(daftarMhs, jumlah);
                            System.out.println("Data berhasil ditambahkan!");
                           
                            
                        }else {
                            System.out.println("Data Penuh");
                        }
                        break;
                        
                    case 2 :
                        if(jumlah == 0){
                            System.out.println("Data Kosong");
                        }else{
                            for (int i = 0; i < jumlah; i++) {
                                daftarMhs[i].tampilkanData();
                            }
                        }
                        break;
                        
                    case 3:
                        System.out.print("Cari Berdasarkan NIM: ");
                        int cari = Integer.parseInt(scanner.nextLine());
                         
                        boolean ketemu = false;
                        
                        for (int i = 0; i < jumlah; i++) {
                            if (daftarMhs[i].getNim() == cari) {
                                daftarMhs[i].tampilkanData();
                                ketemu = true;
                                break;
                            }
                        }
                        
                        if(!ketemu)System.out.println("Tidak Ada");
                        break;
                        
                    case 4:
                        System.out.println("Mahasiswa yang Lulus: ");
                        boolean ada = false;
                        
                        for (int i = 0; i < jumlah; i++) {
                            if (daftarMhs[i].isLulus()) {
                                daftarMhs[i].tampilkanData();
                                
                                ada = true;
                            }
                        }
                        
                        if (!ada) {
                            System.out.println("Tidak ada mahasiswa yang lulus.");
                        }
                        break;
                        
                    case 5:
                        System.out.println("Semester Dinaikkan");
                        
                        for (int i = 0; i < jumlah; i++) {
                            daftarMhs[i].naikSemester();
                        }
                        dataMeneger.simpanData(daftarMhs, jumlah);
                        break;
                        
                    case 6:
                        dataMeneger.simpanData(daftarMhs, jumlah);
                        System.out.println("Program Berakhir");
                        break;
                        
                    default:
                        System.out.println("Pilih Ulang");
                }        
            }while (pilihan !=6);
            scanner.close();
        
    }                
                
}            
     
