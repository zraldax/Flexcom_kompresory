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
@Table(name = "servis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servis.findAll", query = "SELECT s FROM Servis s")
    , @NamedQuery(name = "Servis.findByNavstevaIdnavsteva", query = "SELECT s FROM Servis s WHERE s.navstevaIdnavsteva = :navstevaIdnavsteva")
    , @NamedQuery(name = "Servis.findByServisn\u00edProtokol", query = "SELECT s FROM Servis s WHERE s.servisn\u00edProtokol = :servisn\u00edProtokol")
    , @NamedQuery(name = "Servis.findByPopisOprav", query = "SELECT s FROM Servis s WHERE s.popisOprav = :popisOprav")})
public class Servis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "navsteva_idnavsteva")
    private Integer navstevaIdnavsteva;
    @Basic(optional = false)
    @Column(name = "servisn\u00ed_protokol")
    private String servisníProtokol;
    @Column(name = "popis_oprav")
    private String popisOprav;

    public Servis() {
    }

    public Servis(Integer navstevaIdnavsteva) {
        this.navstevaIdnavsteva = navstevaIdnavsteva;
    }

    public Servis(Integer navstevaIdnavsteva, String servisníProtokol) {
        this.navstevaIdnavsteva = navstevaIdnavsteva;
        this.servisníProtokol = servisníProtokol;
    }

    public Integer getNavstevaIdnavsteva() {
        return navstevaIdnavsteva;
    }

    public void setNavstevaIdnavsteva(Integer navstevaIdnavsteva) {
        this.navstevaIdnavsteva = navstevaIdnavsteva;
    }

    public String getServisníProtokol() {
        return servisníProtokol;
    }

    public void setServisníProtokol(String servisníProtokol) {
        this.servisníProtokol = servisníProtokol;
    }

    public String getPopisOprav() {
        return popisOprav;
    }

    public void setPopisOprav(String popisOprav) {
        this.popisOprav = popisOprav;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (navstevaIdnavsteva != null ? navstevaIdnavsteva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servis)) {
            return false;
        }
        Servis other = (Servis) object;
        if ((this.navstevaIdnavsteva == null && other.navstevaIdnavsteva != null) || (this.navstevaIdnavsteva != null && !this.navstevaIdnavsteva.equals(other.navstevaIdnavsteva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beany.Servis[ navstevaIdnavsteva=" + navstevaIdnavsteva + " ]";
    }
    
}
