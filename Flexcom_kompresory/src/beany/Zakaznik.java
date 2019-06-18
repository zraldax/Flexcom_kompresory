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
@Table(name = "zakaznik")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zakaznik.findAll", query = "SELECT z FROM Zakaznik z")
    , @NamedQuery(name = "Zakaznik.findByIdzakaznik", query = "SELECT z FROM Zakaznik z WHERE z.idzakaznik = :idzakaznik")
    , @NamedQuery(name = "Zakaznik.findByNazev", query = "SELECT z FROM Zakaznik z WHERE z.nazev = :nazev")})
public class Zakaznik implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idzakaznik")
    private Integer idzakaznik;
    @Basic(optional = false)
    @Column(name = "nazev")
    private String nazev;

    public Zakaznik() {
    }

    public Zakaznik(Integer idzakaznik) {
        this.idzakaznik = idzakaznik;
    }

    public Zakaznik(Integer idzakaznik, String nazev) {
        this.idzakaznik = idzakaznik;
        this.nazev = nazev;
    }

    public Integer getIdzakaznik() {
        return idzakaznik;
    }

    public void setIdzakaznik(Integer idzakaznik) {
        this.idzakaznik = idzakaznik;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idzakaznik != null ? idzakaznik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zakaznik)) {
            return false;
        }
        Zakaznik other = (Zakaznik) object;
        if ((this.idzakaznik == null && other.idzakaznik != null) || (this.idzakaznik != null && !this.idzakaznik.equals(other.idzakaznik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beany.Zakaznik[ idzakaznik=" + idzakaznik + " ]";
    }
    
}
