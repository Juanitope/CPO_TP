/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_douillet_tall;

/**
 *
 * @author douil
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprio;
    
 public Voiture(String LeModele, String LaMarque, int LaPuissanceCV) {
    Modele = LeModele ;
    Marque = LaMarque;
    PuissanceCV = LaPuissanceCV;
    Proprio = null;
    }
        @Override
        public String toString() { 
            String chaine;
             chaine= Modele + Marque + PuissanceCV;
             return chaine;
        }
}
