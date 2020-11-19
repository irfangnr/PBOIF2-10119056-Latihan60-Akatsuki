/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan60.akatsuki;

/**
 *
 * @author ACER
 */
public class AsalDesa extends Akatsuki {
    private String desa;

    public AsalDesa(String nama) {
        super(nama);
    }
    
    public String tampil(){
        if("Pain".equals(getNama())){
            desa="Amegakure";
        }else if("Konan".equals(getNama())){
            desa="Amegakure";
        }else if("Zetsu".equals(getNama())){
            desa="Kusagakure";
        }else if("Obito".equals(getNama())){
            desa="Konohagakure";
        }else if("Hidan".equals(getNama())){
            desa="Syugakure";
        }else if("Kakuzu".equals(getNama())){
            desa="Takigakure";
        }else if("Kisame".equals(getNama())){
            desa="Kirigakure";
        }else if("Uciha Itachi".equals(getNama())){
            desa="Konohagakure";
        }else if("Sasori".equals(getNama())){
            desa="Sunagakure";
        }else if("Deidara".equals(getNama())){
            desa="Iwagakure";
        }

        return desa;
    }
    
    
}
