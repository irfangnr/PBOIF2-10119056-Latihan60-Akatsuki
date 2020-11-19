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
public class Jutsu extends Akatsuki{
    private String jurus;

    public Jutsu(String nama) {
        super(nama);
    }

    public String getJurus() {
        return jurus;
    }

    public void setJurus(String jurus) {
        this.jurus = jurus;
    }

    public String tampil(){
        if("Pain".equals(getNama())){
            jurus="Chibaku tensei";
        }else if("Konan".equals(getNama())){
            jurus="Kami no shisha no jutsu";
        }else if("Zetsu".equals(getNama())){
            jurus="Narikawari no jutsu";
        }else if("Obito".equals(getNama())){
            jurus="Juubi Chakra Weapon";
        }else if("Hidan".equals(getNama())){
            jurus="Shiji hyoketsu";
        }else if("Kakuzu".equals(getNama())){
            jurus="Jiongu";
        }else if("Kisame".equals(getNama())){
            jurus="Daikodan no jutsu";
        }else if("Uciha Itachi".equals(getNama())){
            jurus="Ametarasu dan Susano'o";
        }else if("Sasori".equals(getNama())){
            jurus="Hyakki no soen";
        }else if("Deidara".equals(getNama())){
            jurus="Shie \"Nol\"";
        }
        return jurus;
    }

    @Override
    void status() {
        super.status(); //To change body of generated methods, choose Tools | Templates.
    }

}
