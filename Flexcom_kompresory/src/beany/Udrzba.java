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

/**
 *
 * @author Cooler
 */
@Entity
@Table(name = "udrzba")
@NamedQueries({
    @NamedQuery(name = "Udrzba.findAll", query = "SELECT u FROM Udrzba u")
    , @NamedQuery(name = "Udrzba.findByNavstevaIdnavsteva", query = "SELECT u FROM Udrzba u WHERE u.navstevaIdnavsteva = :navstevaIdnavsteva")
    , @NamedQuery(name = "Udrzba.findByServisniProtokol", query = "SELECT u FROM Udrzba u WHERE u.servisniProtokol = :servisniProtokol")})
public class Udrzba implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "navsteva_idnavsteva")
    private Integer navstevaIdnavsteva;
    @Basic(optional = false)
    @Column(name = "servisni_protokol")
    private String servisniProtokol;

    public Udrzba() {
    }

    public Udrzba(Integer navstevaIdnavsteva) {
        this.navstevaIdnavsteva = navstevaIdnavsteva;
    }

    public Udrzba(Integer navstevaIdnavsteva, String servisniProtokol) {
        this.navstevaIdnavsteva = navstevaIdnavsteva;
        this.servisniProtokol = servisniProtokol;
    }

    public Integer getNavstevaIdnavsteva() {
        return navstevaIdnavsteva;
    }

    public void setNavstevaIdnavsteva(Integer navstevaIdnavsteva) {
        this.navstevaIdnavsteva = navstevaIdnavsteva;
    }

    public String getServisniProtokol() {
        return servisniProtokol;
    }

    public void setServisniProtokol(String servisniProtokol) {
        this.servisniProtokol = servisniProtokol;
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
        if (!(object instanceof Udrzba)) {
            return false;
        }
        Udrzba other = (Udrzba) object;
        if ((this.navstevaIdnavsteva == null && other.navstevaIdnavsteva != null) || (this.navstevaIdnavsteva != null && !this.navstevaIdnavsteva.equals(other.navstevaIdnavsteva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beany.Udrzba[ navstevaIdnavsteva=" + navstevaIdnavsteva + " ]";
    }
    
}
