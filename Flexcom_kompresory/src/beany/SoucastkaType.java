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
@Table(name = "soucastka_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SoucastkaType.findAll", query = "SELECT s FROM SoucastkaType s")
    , @NamedQuery(name = "SoucastkaType.findByIdsoucastkaType", query = "SELECT s FROM SoucastkaType s WHERE s.idsoucastkaType = :idsoucastkaType")
    , @NamedQuery(name = "SoucastkaType.findByName", query = "SELECT s FROM SoucastkaType s WHERE s.name = :name")
    , @NamedQuery(name = "SoucastkaType.findByKod", query = "SELECT s FROM SoucastkaType s WHERE s.kod = :kod")
    , @NamedQuery(name = "SoucastkaType.findByPoznamka", query = "SELECT s FROM SoucastkaType s WHERE s.poznamka = :poznamka")})
public class SoucastkaType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsoucastka_type")
    private Integer idsoucastkaType;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "kod")
    private String kod;
    @Column(name = "poznamka")
    private String poznamka;

    public SoucastkaType() {
    }

    public SoucastkaType(Integer idsoucastkaType) {
        this.idsoucastkaType = idsoucastkaType;
    }

    public SoucastkaType(Integer idsoucastkaType, String name, String kod) {
        this.idsoucastkaType = idsoucastkaType;
        this.name = name;
        this.kod = kod;
    }

    public Integer getIdsoucastkaType() {
        return idsoucastkaType;
    }

    public void setIdsoucastkaType(Integer idsoucastkaType) {
        this.idsoucastkaType = idsoucastkaType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
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
        hash += (idsoucastkaType != null ? idsoucastkaType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SoucastkaType)) {
            return false;
        }
        SoucastkaType other = (SoucastkaType) object;
        if ((this.idsoucastkaType == null && other.idsoucastkaType != null) || (this.idsoucastkaType != null && !this.idsoucastkaType.equals(other.idsoucastkaType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beany.SoucastkaType[ idsoucastkaType=" + idsoucastkaType + " ]";
    }
    
}
