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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Cooler
 */
@Entity
@Table(name = "pobocka")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pobocka.findAll", query = "SELECT p FROM Pobocka p")
    , @NamedQuery(name = "Pobocka.findByIdpobocka", query = "SELECT p FROM Pobocka p WHERE p.idpobocka = :idpobocka")
    , @NamedQuery(name = "Pobocka.findByZakaznikIdzakaznik", query = "SELECT p FROM Pobocka p WHERE p.zakaznikIdzakaznik = :zakaznikIdzakaznik")
    , @NamedQuery(name = "Pobocka.findByN\u00e1zev", query = "SELECT p FROM Pobocka p WHERE p.n\u00e1zev = :n\u00e1zev")
    , @NamedQuery(name = "Pobocka.findByKontaktn\u00edOsoba", query = "SELECT p FROM Pobocka p WHERE p.kontaktn\u00edOsoba = :kontaktn\u00edOsoba")
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
    @Column(name = "n\u00e1zev")
    private String název;
    @Column(name = "kontaktn\u00ed_osoba")
    private String kontaktníOsoba;
    @Column(name = "email")
    private String email;
    @Column(name = "telefon")
    private String telefon;

    public Pobocka() {
    }

    public Pobocka(Integer idpobocka) {
        this.idpobocka = idpobocka;
    }

    public Pobocka(Integer idpobocka, int zakaznikIdzakaznik, String název) {
        this.idpobocka = idpobocka;
        this.zakaznikIdzakaznik = zakaznikIdzakaznik;
        this.název = název;
    }

    public Integer getIdpobocka() {
        return idpobocka;
    }

    public int getZakaznikIdzakaznik() {
        return zakaznikIdzakaznik;
    }

    public void setZakaznikIdzakaznik(int zakaznikIdzakaznik) {
        this.zakaznikIdzakaznik = zakaznikIdzakaznik;
    }

    public String getNázev() {
        return název;
    }

    public void setNázev(String název) {
        this.název = název;
    }

    public String getKontaktníOsoba() {
        return kontaktníOsoba;
    }

    public void setKontaktníOsoba(String kontaktníOsoba) {
        this.kontaktníOsoba = kontaktníOsoba;
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
    public String toString() {
        return "beany.Pobocka[ idpobocka=" + idpobocka + " ]";
    }
    
}
