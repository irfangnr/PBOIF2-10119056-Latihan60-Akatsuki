/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan60.akatsuki;
import java.util.Scanner;
/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Data Akatsuki
 */
public class PBOIF210119056Latihan60Akatsuki {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("====Akatsuki====");
        System.out.print("Silahkan pilih anggota akatsuki : ");
        
        Jutsu jutsu=new Jutsu(input.nextLine());
        System.out.println("Jutsu : "+jutsu.tampil());
        
        AsalDesa desa=new AsalDesa(jutsu.getNama());
        System.out.println("Asal Desa : "+desa.tampil());
        
        Partner partner=new Partner(jutsu.getNama());
        System.out.println("Partner : "+partner.tampil());
        
        System.out.print("Status : ");
        jutsu.status();
    }
    
}
