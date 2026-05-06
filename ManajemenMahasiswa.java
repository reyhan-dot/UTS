/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UTSPBO;

import java.util.Scanner;


public class ManajemenMahasiswa {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ==============================
        // Array of Object
        // ==============================
        Mahasiswa[] daftarMhs = new Mahasiswa[10];
        int jumlah = 0;
       
        int pilihan = 0;

        // ==============================
        // Menu Program (do-while)
        // ==============================
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Semua");
            System.out.println("3. Cari berdasarkan NIM");
            System.out.println("4. Tampilkan yang Lulus");
            System.out.println("5. Naikkan Semester Semua");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");

            // Validasi input angka
            if (!input.hasNextInt()) {
                System.out.println("Input harus angka!");
                input.next();
                continue;
            }

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1 -> {
                    if (jumlah < 10) {

                        System.out.print("NIM: ");
                        String nim = input.nextLine();

                        if (nim.isEmpty()) {
                            System.out.println("NIM tidak boleh kosong!");
                            break;
                        }

                        System.out.print("Nama: ");
                        String nama = input.nextLine();

                        System.out.print("Jurusan: ");
                        String jurusan = input.nextLine();

                        System.out.print("Semester (1-8): ");
                        int semester = input.nextInt();

                        System.out.print("IPK (0-4): ");
                        double ipk = input.nextDouble();
                        input.nextLine();

                        // Membuat object (constructor lengkap)
                        daftarMhs [jumlah++] = new Mahasiswa(nim, nama, jurusan, semester, ipk);
                        
                        

                        System.out.println("Data berhasil ditambahkan!");

                    } else {
                        System.out.println("Data sudah penuh!");
                    }
                    break;
                }

                case 2 -> {
                    if (jumlah == 0) {
                        System.out.println("Belum ada data!");
                    } else {
                        for (int i = 0; i < jumlah; i++) {
                            daftarMhs[i].tampilData(true);
                            
                        }
                    }
                    break;
                }

                case 3 -> {
                    System.out.print("Masukkan NIM: ");
                    String cari = input.nextLine();
                    boolean ditemukan = false;

                    for (int i = 0; i < jumlah; i++) {
                        if (daftarMhs[i].getNim().equals(cari)) {
                            daftarMhs[i].tampilData(true);
                            ditemukan = true;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;
                }

                case 4 -> {
                    boolean ada = false;
                    for (int i = 0; i < jumlah; i++) {
                        if (daftarMhs[i].isLulus()) {
                            daftarMhs[i].tampilData(true);
                            ada = true;
                        }
                    }

                    if (!ada) {
                        System.out.println("Tidak ada mahasiswa lulus.");
                    }
                    break;
                }

                case 5 -> {
                    for (int i = 0; i < jumlah; i++) {
                        daftarMhs[i].naikSemester();
                    }
                    System.out.println("Semester semua mahasiswa dinaikkan!");
                    
                    break;
                }

                case 6 -> System.out.println("Program selesai.");

                default -> System.out.println("Pilihan tidak valid!");
                
            }

        } while (pilihan != 6);
    }
}
