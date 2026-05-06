/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UTSPBO;


public class Mahasiswa {

    
    // Encapsulation (atribut private)
    private String nim;
    private String nama;
    private String jurusan;
    private int semester;
    private double ipk;

    // Constructor default
    public Mahasiswa() {
    }

    // Constructor overload (nim & nama)
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    // Constructor lengkap
    public Mahasiswa(String nim, String nama, String jurusan, int semester, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.semester = semester;
        this.ipk = ipk;
    }

    // Getter & Setter (Encapsulation)
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        if (!nim.isEmpty()) {
            this.nim = nim;
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        if (semester >= 1 && semester <= 8) {
            this.semester = semester;
        }
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        }
    }

    // Method tampilData (overloading)
    public void tampilData() {
        System.out.println("NIM       : " + nim);
        System.out.println("Nama      : " + nama);
        System.out.println("Jurusan   : " + jurusan);
        System.out.println("Semester  : " + semester);
        System.out.println("IPK       : " + ipk);
        System.out.println("------------------------");
    }

    public void tampilData(boolean denganHeader) {
        if (denganHeader) {
            System.out.println("=== DATA MAHASISWA ===");
        }
        tampilData();
    }

    // Method tambahan
    public boolean isLulus() {
        return ipk >= 3.0;
    }

    public void naikSemester() {
        if (semester < 8) {
            semester++;
        }
    }
}