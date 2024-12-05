/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author korisnik
 */
public class Magacin extends UpravljanjeMagacinom{
    private String naziv;
    private Map<String, Double> zalihe;

    public Magacin() {
    }

    public Magacin(String naziv, Map<String, Double> zalihe, int id, String nazivMagacina, double kapacitet) {
        super(id, nazivMagacina, kapacitet);
        this.naziv = naziv;
        this.zalihe = zalihe;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Map<String, Double> getZalihe() {
        return zalihe;
    }

    public void setZalihe(Map<String, Double> zalihe) {
        this.zalihe = zalihe;
    }
    
    
    public void podaciMagacina(){
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Unesite podatke o magacinu:");
        System.out.print("Naziv magacina:");
        nazivMagacina = sc.next();
        System.out.println("Kapacitet magacina u m2:");
        kapacitet = sc.nextDouble();
        System.out.print("Naziv proizvoda:");
        naziv = sc.next();
        
        }catch(Exception e){
            System.err.println("Greska prilikom unasa! Pokusac opet");
        }
        
        
    }
    
    
}
