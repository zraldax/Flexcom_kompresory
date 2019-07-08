/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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
public class Zakaznik_DAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Flexcom_kompresoryPU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx;
    List<Zakaznik> customers;
    List<String> names;
    public Zakaznik_DAO() {
       names= new ArrayList<>();
    }
    
    public List<String> getAllNames(){
        update();
        for(Zakaznik a : customers){
            names.add(a.getNazev());
        }
        return names;
    }
    
    public int getID(String name){
        update();
        for(Zakaznik a :customers){
            if(name.compareTo(a.getNazev())==0)return a.getIdzakaznik();
        }
        return -1;
    }
    
    private void update(){
        TypedQuery<Zakaznik> query = em.createNamedQuery("Zakaznik.findAll",Zakaznik.class);
        customers = query.getResultList();
        }
    public void addZakaznik(String name){
        tx = em.getTransaction();
        Zakaznik zakaznik = new Zakaznik();
        zakaznik.setNazev(name);
        tx.begin();
        em.persist(zakaznik);
        tx.commit();
    }
    
}
