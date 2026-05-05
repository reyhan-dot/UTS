/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_pbo_kelompok_4;

/**
 *
 * @author ACER
 */
public class Mahasiswa {
   
    private String name;
    private String jurusan;
    private int nim; 
    private int semester;
    private double ipk;
    
    public Mahasiswa (){
        
    }
    
    public Mahasiswa (int nim,String name){
        this.nim = nim;
        this.name = name;
    }

   
  public Mahasiswa (int nim, String name, String jurusan, int semester, double ipk){
        this.name = name;
        this.ipk = ipk;
        this.nim = nim;
        this.jurusan = jurusan;
        this.semester = semester;
            
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        if(jurusan !=null && !jurusan.isEmpty()){
        this.jurusan = jurusan;
        }
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
         if (nim > 0){
        this.nim = nim;
        }
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
         if (semester > 0 && semester <= 8)
        this.semester = semester;
         
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
         if (ipk >= 0 && ipk <= 4.00)
        this.ipk = ipk;
         
    }
    public void tampilkanData(){
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " +name);
        System.out.println("Jurusan : " +jurusan);
        System.out.println("Semester: " +semester);
        System.out.println("IPK     : " +ipk);
    }
    public boolean isLulus(){
    return ipk >= 3.0;
}
    

    public void naikSemester() {
        if (semester < 8) {
        semester++;
    }
    }

    
    
}

            
    
    


