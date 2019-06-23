/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beany;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cooler
 */
@Entity
@Table(name = "stroj")
@NamedQueries({
    @NamedQuery(name = "Stroj.findAll", query = "SELECT s FROM Stroj s")
    , @NamedQuery(name = "Stroj.findByIdstroj", query = "SELECT s FROM Stroj s WHERE s.idstroj = :idstroj")
    , @NamedQuery(name = "Stroj.findByStrojTypeIdstrojType", query = "SELECT s FROM Stroj s WHERE s.strojTypeIdstrojType = :strojTypeIdstrojType")
    , @NamedQuery(name = "Stroj.findByPobockaIdpobocka", query = "SELECT s FROM Stroj s WHERE s.pobockaIdpobocka = :pobockaIdpobocka")
    , @NamedQuery(name = "Stroj.findByVyrobniCislo", query = "SELECT s FROM Stroj s WHERE s.vyrobniCislo = :vyrobniCislo")
    , @NamedQuery(name = "Stroj.findByObjednaciCislo", query = "SELECT s FROM Stroj s WHERE s.objednaciCislo = :objednaciCislo")
    , @NamedQuery(name = "Stroj.findByRevizovat", query = "SELECT s FROM Stroj s WHERE s.revizovat = :revizovat")
    , @NamedQuery(name = "Stroj.findByRokVyroby", query = "SELECT s FROM Stroj s WHERE s.rokVyroby = :rokVyroby")
    , @NamedQuery(name = "Stroj.findByPoznamka", query = "SELECT s FROM Stroj s WHERE s.poznamka = :poznamka")})
public class Stroj implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idstroj")
    private Integer idstroj;
    @Basic(optional = false)
    @Column(name = "stroj_type_idstroj_type")
    private int strojTypeIdstrojType;
    @Basic(optional = false)
    @Column(name = "pobocka_idpobocka")
    private int pobockaIdpobocka;
    @Basic(optional = false)
    @Column(name = "vyrobni_cislo")
    private int vyrobniCislo;
    @Basic(optional = false)
    @Column(name = "objednaci_cislo")
    private String objednaciCislo;
    @Basic(optional = false)
    @Column(name = "revizovat")
    private boolean revizovat;
    @Basic(optional = false)
    @Column(name = "rok_vyroby")
    @Temporal(TemporalType.DATE)
    private Date rokVyroby;
    @Column(name = "poznamka")
    private String poznamka;

    public Stroj() {
    }

    public Stroj(Integer idstroj) {
        this.idstroj = idstroj;
    }

    public Stroj(Integer idstroj, int strojTypeIdstrojType, int pobockaIdpobocka, int vyrobniCislo, String objednaciCislo, boolean revizovat, Date rokVyroby) {
        this.idstroj = idstroj;
        this.strojTypeIdstrojType = strojTypeIdstrojType;
        this.pobockaIdpobocka = pobockaIdpobocka;
        this.vyrobniCislo = vyrobniCislo;
        this.objednaciCislo = objednaciCislo;
        this.revizovat = revizovat;
        this.rokVyroby = rokVyroby;
    }

    public Integer getIdstroj() {
        return idstroj;
    }

    public void setIdstroj(Integer idstroj) {
        this.idstroj = idstroj;
    }

    public int getStrojTypeIdstrojType() {
        return strojTypeIdstrojType;
    }

    public void setStrojTypeIdstrojType(int strojTypeIdstrojType) {
        this.strojTypeIdstrojType = strojTypeIdstrojType;
    }

    public int getPobockaIdpobocka() {
        return pobockaIdpobocka;
    }

    public void setPobockaIdpobocka(int pobockaIdpobocka) {
        this.pobockaIdpobocka = pobockaIdpobocka;
    }

    public int getVyrobniCislo() {
        return vyrobniCislo;
    }

    public void setVyrobniCislo(int vyrobniCislo) {
        this.vyrobniCislo = vyrobniCislo;
    }

    public String getObjednaciCislo() {
        return objednaciCislo;
    }

    public void setObjednaciCislo(String objednaciCislo) {
        this.objednaciCislo = objednaciCislo;
    }

    public boolean getRevizovat() {
        return revizovat;
    }

    public void setRevizovat(boolean revizovat) {
        this.revizovat = revizovat;
    }

    public Date getRokVyroby() {
        return rokVyroby;
    }

    public void setRokVyroby(Date rokVyroby) {
        this.rokVyroby = rokVyroby;
    }

    public String getPoznamka() {
        return poznamka;
    }

    public void setPoznamka(String poznamka) {
        this.poznamka = poznamka;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idstroj != null ? idstroj.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stroj)) {
            return false;
        }
        Stroj other = (Stroj) object;
        if ((this.idstroj == null && other.idstroj != null) || (this.idstroj != null && !this.idstroj.equals(other.idstroj))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beany.Stroj[ idstroj=" + idstroj + " ]";
    }
    
}
