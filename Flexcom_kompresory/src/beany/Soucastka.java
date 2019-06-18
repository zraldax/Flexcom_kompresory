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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Cooler
 */
@Entity
@Table(name = "soucastka")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Soucastka.findAll", query = "SELECT s FROM Soucastka s")
    , @NamedQuery(name = "Soucastka.findByIdsoucastka", query = "SELECT s FROM Soucastka s WHERE s.idsoucastka = :idsoucastka")
    , @NamedQuery(name = "Soucastka.findByStrojIdstroj", query = "SELECT s FROM Soucastka s WHERE s.strojIdstroj = :strojIdstroj")
    , @NamedQuery(name = "Soucastka.findBySoucastkaTypeIdsoucastkaType", query = "SELECT s FROM Soucastka s WHERE s.soucastkaTypeIdsoucastkaType = :soucastkaTypeIdsoucastkaType")
    , @NamedQuery(name = "Soucastka.findByPozn\u00e1mka", query = "SELECT s FROM Soucastka s WHERE s.pozn\u00e1mka = :pozn\u00e1mka")
    , @NamedQuery(name = "Soucastka.findByFoto", query = "SELECT s FROM Soucastka s WHERE s.foto = :foto")
    , @NamedQuery(name = "Soucastka.findByDatumInstalace", query = "SELECT s FROM Soucastka s WHERE s.datumInstalace = :datumInstalace")
    , @NamedQuery(name = "Soucastka.findByDatumVymeny", query = "SELECT s FROM Soucastka s WHERE s.datumVymeny = :datumVymeny")})
public class Soucastka implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idsoucastka")
    private Integer idsoucastka;
    @Basic(optional = false)
    @Column(name = "stroj_idstroj")
    private int strojIdstroj;
    @Basic(optional = false)
    @Column(name = "soucastka_type_idsoucastka_type")
    private int soucastkaTypeIdsoucastkaType;
    @Column(name = "pozn\u00e1mka")
    private String poznámka;
    @Column(name = "foto")
    private String foto;
    @Basic(optional = false)
    @Column(name = "datum_instalace")
    @Temporal(TemporalType.DATE)
    private Date datumInstalace;
    @Basic(optional = false)
    @Column(name = "datum_vymeny")
    @Temporal(TemporalType.DATE)
    private Date datumVymeny;

    public Soucastka() {
    }

    public Soucastka(Integer idsoucastka) {
        this.idsoucastka = idsoucastka;
    }

    public Soucastka(Integer idsoucastka, int strojIdstroj, int soucastkaTypeIdsoucastkaType, Date datumInstalace, Date datumVymeny) {
        this.idsoucastka = idsoucastka;
        this.strojIdstroj = strojIdstroj;
        this.soucastkaTypeIdsoucastkaType = soucastkaTypeIdsoucastkaType;
        this.datumInstalace = datumInstalace;
        this.datumVymeny = datumVymeny;
    }

    public Integer getIdsoucastka() {
        return idsoucastka;
    }

    public void setIdsoucastka(Integer idsoucastka) {
        this.idsoucastka = idsoucastka;
    }

    public int getStrojIdstroj() {
        return strojIdstroj;
    }

    public void setStrojIdstroj(int strojIdstroj) {
        this.strojIdstroj = strojIdstroj;
    }

    public int getSoucastkaTypeIdsoucastkaType() {
        return soucastkaTypeIdsoucastkaType;
    }

    public void setSoucastkaTypeIdsoucastkaType(int soucastkaTypeIdsoucastkaType) {
        this.soucastkaTypeIdsoucastkaType = soucastkaTypeIdsoucastkaType;
    }

    public String getPoznámka() {
        return poznámka;
    }

    public void setPoznámka(String poznámka) {
        this.poznámka = poznámka;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Date getDatumInstalace() {
        return datumInstalace;
    }

    public void setDatumInstalace(Date datumInstalace) {
        this.datumInstalace = datumInstalace;
    }

    public Date getDatumVymeny() {
        return datumVymeny;
    }

    public void setDatumVymeny(Date datumVymeny) {
        this.datumVymeny = datumVymeny;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsoucastka != null ? idsoucastka.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Soucastka)) {
            return false;
        }
        Soucastka other = (Soucastka) object;
        if ((this.idsoucastka == null && other.idsoucastka != null) || (this.idsoucastka != null && !this.idsoucastka.equals(other.idsoucastka))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beany.Soucastka[ idsoucastka=" + idsoucastka + " ]";
    }
    
}
