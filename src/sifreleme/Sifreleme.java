/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sifreleme;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Sifreleme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String alfabe="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("LUTFEN BUYUK HARF GIRINIZ(INGLIZCE ALFABE)");
        Scanner a=new Scanner(System.in);
        
        Girdiler obj = new Girdiler(a.nextLine(),a.nextLine());
        obj.kalan=obj.mesaj.length()%obj.anahtar.length();  
        String a2=obj.anahtar;
        for (int i = 1; i < obj.mesaj.length()/obj.anahtar.length(); i++) { 
            a2+=obj.anahtar;
        }
        
        obj.anahtar=a2;
        obj.anahtar+=obj.anahtar.substring(0,obj.kalan); 
        obj.sifrelenmis=""; 
        
        for (int i = 0; i < obj.mesaj.length(); i++) {
            obj.sifrelenmis+=alfabe.charAt((alfabe.indexOf(obj.anahtar.charAt(i))+alfabe.indexOf(obj.mesaj.charAt(i))+1)%alfabe.length());
        }
        System.out.println(obj.sifrelenmis);
    }
    
}
