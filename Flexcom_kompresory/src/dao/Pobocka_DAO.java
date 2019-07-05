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
public class Pobocka_DAO {
    ArrayList<Pobocka>list_of_polozka;
    private EntityManager em;
    public Pobocka_DAO() {
    }
    
    public ArrayList<Pobocka> getPobocka(int idzakaznik){
        list_of_polozka = (ArrayList<Pobocka>) em.createNamedQuery("Pobocka.findByZakaznikIdzakaznik").setParameter("zakaznikIdzakaznik",idzakaznik).getResultList();
        return list_of_polozka;
    }
}
