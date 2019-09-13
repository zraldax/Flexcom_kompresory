/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beany.Pobocka;
import beany.Stroj;
import beany.Zakaznik;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
/**
 *
 * @author Cooler
 */
public class Pobocka_DAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Flexcom_kompresoryPU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx;
    List<Zakaznik> customers;
    List<String> names;
    List<Pobocka> list_of_item;
    
    public Pobocka_DAO() {
    }
    public List<String>getPobocka(int id){
        ArrayList<String> names = new ArrayList<>();
        TypedQuery<Pobocka> query = em.createNamedQuery("Pobocka.findByZakaznikIdzakaznik",Pobocka.class);
        query.setParameter("zakaznikIdzakaznik", id);
        list_of_item = query.getResultList();
        for(Pobocka i : list_of_item){
            names.add(i.getNazev());
        }
        return names;
    }
    public int getId(int id ,String name){
        ArrayList<String> names = new ArrayList<>();
        TypedQuery<Pobocka> query = em.createNamedQuery("Pobocka.findByZakaznikIdzakaznik",Pobocka.class);
        query.setParameter("zakaznikIdzakaznik", id);
        for(Pobocka a :list_of_item){
            if(name.compareTo(a.getNazev())==0)return a.getIdpobocka();
        }
        return -1;
    }
}

