/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beany.Pobocka;
import java.util.ArrayList;
import javax.persistence.EntityManager;

/**
 *
 * @author Kancl
 */
public class pobocka_dao {
    ArrayList<Pobocka>list_of_polozka;
    private EntityManager em;
    public pobocka_dao() {
    }
    
    public ArrayList<Pobocka> getPobocka(int idzakaznik){
        list_of_polozka = (ArrayList<Pobocka>) em.createNamedQuery("Pobocka.findAll").getResultList();
        return list_of_polozka;
    }
}
