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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Cooler
 */
@Entity
@Table(name = "navsteva")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Navsteva.findAll", query = "SELECT n FROM Navsteva n")
    , @NamedQuery(name = "Navsteva.findByIdnavsteva", query = "SELECT n FROM Navsteva n WHERE n.idnavsteva = :idnavsteva")
    , @NamedQuery(name = "Navsteva.findByStrojIdstroj", query = "SELECT n FROM Navsteva n WHERE n.strojIdstroj = :strojIdstroj")
    , @NamedQuery(name = "Navsteva.findByDatum", query = "SELECT n FROM Navsteva n WHERE n.datum = :datum")})
public class Navsteva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnavsteva")
    private Integer idnavsteva;
    @Basic(optional = false)
    @Column(name = "stroj_idstroj")
    private int strojIdstroj;
    @Basic(optional = false)
    @Column(name = "datum")
    @Temporal(TemporalType.DATE)
    private Date datum;

    public Navsteva() {
    }

    public Navsteva(Integer idnavsteva) {
        this.idnavsteva = idnavsteva;
    }

    public Navsteva(Integer idnavsteva, int strojIdstroj, Date datum) {
        this.idnavsteva = idnavsteva;
        this.strojIdstroj = strojIdstroj;
        this.datum = datum;
    }

    public Integer getIdnavsteva() {
        return idnavsteva;
    }

    public void setIdnavsteva(Integer idnavsteva) {
        this.idnavsteva = idnavsteva;
    }

    public int getStrojIdstroj() {
        return strojIdstroj;
    }

    public void setStrojIdstroj(int strojIdstroj) {
        this.strojIdstroj = strojIdstroj;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnavsteva != null ? idnavsteva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Navsteva)) {
            return false;
        }
        Navsteva other = (Navsteva) object;
        if ((this.idnavsteva == null && other.idnavsteva != null) || (this.idnavsteva != null && !this.idnavsteva.equals(other.idnavsteva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beany.Navsteva[ idnavsteva=" + idnavsteva + " ]";
    }
    
}
