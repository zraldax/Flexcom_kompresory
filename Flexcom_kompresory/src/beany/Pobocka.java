/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beany;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Cooler
 */
@Entity
@Table(name = "pobocka")
@NamedQueries({
    @NamedQuery(name = "Pobocka.findAll", query = "SELECT p FROM Pobocka p")
    , @NamedQuery(name = "Pobocka.findByIdpobocka", query = "SELECT p FROM Pobocka p WHERE p.idpobocka = :idpobocka")
    , @NamedQuery(name = "Pobocka.findByZakaznikIdzakaznik", query = "SELECT p FROM Pobocka p WHERE p.zakaznikIdzakaznik = :zakaznikIdzakaznik ORDER BY p.nazev")
    , @NamedQuery(name = "Pobocka.findByNazev", query = "SELECT p FROM Pobocka p WHERE p.nazev = :nazev")
    , @NamedQuery(name = "Pobocka.findByKontaktniOsoba", query = "SELECT p FROM Pobocka p WHERE p.kontaktniOsoba = :kontaktniOsoba")
    , @NamedQuery(name = "Pobocka.findByEmail", query = "SELECT p FROM Pobocka p WHERE p.email = :email")
    , @NamedQuery(name = "Pobocka.findByTelefon", query = "SELECT p FROM Pobocka p WHERE p.telefon = :telefon")})
public class Pobocka implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpobocka")
    private Integer idpobocka;
    @Basic(optional = false)
    @Column(name = "zakaznik_idzakaznik")
    private int zakaznikIdzakaznik;
    @Basic(optional = false)
    @Column(name = "nazev")
    private String nazev;
    @Column(name = "kontaktni_osoba")
    private String kontaktniOsoba;
    @Column(name = "email")
    private String email;
    @Column(name = "telefon")
    private String telefon;

    public Pobocka() {
    }

    public Pobocka(Integer idpobocka) {
        this.idpobocka = idpobocka;
    }

    public Pobocka(Integer idpobocka, int zakaznikIdzakaznik, String nazev) {
        this.idpobocka = idpobocka;
        this.zakaznikIdzakaznik = zakaznikIdzakaznik;
        this.nazev = nazev;
    }

    public Integer getIdpobocka() {
        return idpobocka;
    }

    public void setIdpobocka(Integer idpobocka) {
        this.idpobocka = idpobocka;
    }

    public int getZakaznikIdzakaznik() {
        return zakaznikIdzakaznik;
    }

    public void setZakaznikIdzakaznik(int zakaznikIdzakaznik) {
        this.zakaznikIdzakaznik = zakaznikIdzakaznik;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String getKontaktniOsoba() {
        return kontaktniOsoba;
    }

    public void setKontaktniOsoba(String kontaktniOsoba) {
        this.kontaktniOsoba = kontaktniOsoba;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpobocka != null ? idpobocka.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pobocka)) {
            return false;
        }
        Pobocka other = (Pobocka) object;
        if ((this.idpobocka == null && other.idpobocka != null) || (this.idpobocka != null && !this.idpobocka.equals(other.idpobocka))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beany.Pobocka[ idpobocka=" + idpobocka + " ]";
    }
    
}
