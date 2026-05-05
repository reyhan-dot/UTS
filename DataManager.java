/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_pbo_kelompok_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class dataMeneger {
    private static final String FILE_NAME = "";
    
    // Menyimpan data ke file
    public static void simpanData(Mahasiswa[] daftarMhs, int jumlah) throws IOException {
        
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            writer.println(jumlah); // Simpan jumlah mahasiswa
            for (int i = 0; i < jumlah; i++) {
            writer.println(
                    daftarMhs[i].getNim() + "," +
            daftarMhs[i].getName() + "," +
            daftarMhs[i].getJurusan() + "," +
            daftarMhs[i].getSemester() + "," +
            daftarMhs[i].getIpk()
            );
        }
            
        }       
    }        
            
           
    public static int muatData(Mahasiswa[] daftarMhs) throws FileNotFoundException {
                File file = new File(FILE_NAME);
                if (!file.exists()||file.length() == 0) {
                    System.out.println("File belum ada. Mulai dengan data kosong.");
                    return 0;
                }
                
                try (Scanner scanner = new Scanner(file)) {
                    if (!scanner.hasNextLine()){
                        return 0;
                    }
                int jumlah = Integer.parseInt(scanner.nextLine());
                
                for (int i = 0; i < jumlah; i++){
                    if(!scanner.hasNextLine())break;
                    
                    String []data= scanner.nextLine().split(",");
                    
                    if (data.length == 5){
                        daftarMhs[i] = new Mahasiswa(
                        Integer.parseInt(data[0]),
                        data[2],
                        data[3],
                        Integer.parseInt(data[3]),
                        Double.parseDouble(data[4])
                        );
                    }
                }
                return jumlah;   
            } catch (Exception e){
                    System.out.println("Gagal memuat Data: " + e.getMessage());
            
        return 0;
    }        
}       
} 



