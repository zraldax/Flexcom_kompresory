/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beany.Pobocka;
import beany.Stroj;
import java.util.ArrayList;
import java.util.Date;
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
public class Stroj_DAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Flexcom_kompresoryPU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx;
    List<Stroj>list_of_polozka;
    public List<String>getStroj(int id){
        ArrayList<String> names = new ArrayList<>();
        TypedQuery<Stroj> query = em.createNamedQuery("Stroj.findByPobockaIdpobocka",Stroj.class);
        query.setParameter("pobockaIdpobocka", id);
        list_of_polozka = query.getResultList();
        for(Stroj i : list_of_polozka){
            names.add(i.getName());
        }
        return names;
    }
    public StrojData getStrojData(String name){
        if(list_of_polozka.size()>0)
        for(Stroj i : list_of_polozka){
                if(i.getName().toLowerCase().equals(name.toLowerCase()))
                    return new StrojData(
                        i.getVyrobniCislo(),
                        i.getKod(),
                        name,
                        i.getStrojTypeIdstrojType(),
                        i.getPobockaIdpobocka(),
                        i.getObjednaciCislo(),
                        i.getRevizovat(),
                        i.getRokVyroby(),
                        i.getPoznamka()
                    );
        }
        return null;                
    }
}
