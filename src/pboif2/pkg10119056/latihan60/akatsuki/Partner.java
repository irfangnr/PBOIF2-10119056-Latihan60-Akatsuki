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
public class Partner extends Akatsuki{
    private String partner;

    public Partner(String nama) {
        super(nama);
    }

    public String getpartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }
    
    
    
    public String tampil(){
        if("Pain".equals(getNama())){
            partner="Konan";
        }else if("Konan".equals(getNama())){
            partner="Pain";
        }else if("Zetsu".equals(getNama())){
            partner="Tidak ada";
        }else if("Obito".equals(getNama())){
            partner="Deidara";
        }else if("Hidan".equals(getNama())){
            partner="Kukuzu";
        }else if("Kakuzu".equals(getNama())){
            partner="Hidan";
        }else if("Kisame".equals(getNama())){
            partner="Uciha Itachi";
        }else if("Uciha Itachi".equals(getNama())){
            partner="Kisame";
        }else if("Sasori".equals(getNama())){
            partner="Deidara";
        }else if("Deidara".equals(getNama())){
            partner="Sasori";
        }

        return partner;
    }
    
}
    

