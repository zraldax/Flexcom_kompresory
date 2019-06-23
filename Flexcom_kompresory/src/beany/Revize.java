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
@Table(name = "revize")
@NamedQueries({
    @NamedQuery(name = "Revize.findAll", query = "SELECT r FROM Revize r")
    , @NamedQuery(name = "Revize.findByNavstevaIdnavsteva", query = "SELECT r FROM Revize r WHERE r.navstevaIdnavsteva = :navstevaIdnavsteva")
    , @NamedQuery(name = "Revize.findByTypRevize", query = "SELECT r FROM Revize r WHERE r.typRevize = :typRevize")})
public class Revize implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "navsteva_idnavsteva")
    private Integer navstevaIdnavsteva;
    @Column(name = "typ_revize")
    private Integer typRevize;

    public Revize() {
    }

    public Revize(Integer navstevaIdnavsteva) {
        this.navstevaIdnavsteva = navstevaIdnavsteva;
    }

    public Integer getNavstevaIdnavsteva() {
        return navstevaIdnavsteva;
    }

    public void setNavstevaIdnavsteva(Integer navstevaIdnavsteva) {
        this.navstevaIdnavsteva = navstevaIdnavsteva;
    }

    public Integer getTypRevize() {
        return typRevize;
    }

    public void setTypRevize(Integer typRevize) {
        this.typRevize = typRevize;
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
        if (!(object instanceof Revize)) {
            return false;
        }
        Revize other = (Revize) object;
        if ((this.navstevaIdnavsteva == null && other.navstevaIdnavsteva != null) || (this.navstevaIdnavsteva != null && !this.navstevaIdnavsteva.equals(other.navstevaIdnavsteva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beany.Revize[ navstevaIdnavsteva=" + navstevaIdnavsteva + " ]";
    }
    
}
