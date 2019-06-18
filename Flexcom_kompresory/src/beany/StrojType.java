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
@Table(name = "stroj_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StrojType.findAll", query = "SELECT s FROM StrojType s")
    , @NamedQuery(name = "StrojType.findByIdstrojType", query = "SELECT s FROM StrojType s WHERE s.idstrojType = :idstrojType")
    , @NamedQuery(name = "StrojType.findByJmeno", query = "SELECT s FROM StrojType s WHERE s.jmeno = :jmeno")})
public class StrojType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idstroj_type")
    private Integer idstrojType;
    @Basic(optional = false)
    @Column(name = "jmeno")
    private String jmeno;

    public StrojType() {
    }

    public StrojType(Integer idstrojType) {
        this.idstrojType = idstrojType;
    }

    public StrojType(Integer idstrojType, String jmeno) {
        this.idstrojType = idstrojType;
        this.jmeno = jmeno;
    }

    public Integer getIdstrojType() {
        return idstrojType;
    }

    public void setIdstrojType(Integer idstrojType) {
        this.idstrojType = idstrojType;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idstrojType != null ? idstrojType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StrojType)) {
            return false;
        }
        StrojType other = (StrojType) object;
        if ((this.idstrojType == null && other.idstrojType != null) || (this.idstrojType != null && !this.idstrojType.equals(other.idstrojType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beany.StrojType[ idstrojType=" + idstrojType + " ]";
    }
    
}
