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

/**
 *
 * @author Cooler
 */
@Entity
@Table(name = "foto")
@NamedQueries({
    @NamedQuery(name = "Foto.findAll", query = "SELECT f FROM Foto f")
    , @NamedQuery(name = "Foto.findByIdfoto", query = "SELECT f FROM Foto f WHERE f.idfoto = :idfoto")
    , @NamedQuery(name = "Foto.findByStrojIdstroj", query = "SELECT f FROM Foto f WHERE f.strojIdstroj = :strojIdstroj")
    , @NamedQuery(name = "Foto.findByCesta", query = "SELECT f FROM Foto f WHERE f.cesta = :cesta")})
public class Foto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfoto")
    private Integer idfoto;
    @Basic(optional = false)
    @Column(name = "stroj_idstroj")
    private int strojIdstroj;
    @Basic(optional = false)
    @Column(name = "cesta")
    private int cesta;

    public Foto() {
    }

    public Foto(Integer idfoto) {
        this.idfoto = idfoto;
    }

    public Foto(Integer idfoto, int strojIdstroj, int cesta) {
        this.idfoto = idfoto;
        this.strojIdstroj = strojIdstroj;
        this.cesta = cesta;
    }

    public Integer getIdfoto() {
        return idfoto;
    }

    public void setIdfoto(Integer idfoto) {
        this.idfoto = idfoto;
    }

    public int getStrojIdstroj() {
        return strojIdstroj;
    }

    public void setStrojIdstroj(int strojIdstroj) {
        this.strojIdstroj = strojIdstroj;
    }

    public int getCesta() {
        return cesta;
    }

    public void setCesta(int cesta) {
        this.cesta = cesta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfoto != null ? idfoto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Foto)) {
            return false;
        }
        Foto other = (Foto) object;
        if ((this.idfoto == null && other.idfoto != null) || (this.idfoto != null && !this.idfoto.equals(other.idfoto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beany.Foto[ idfoto=" + idfoto + " ]";
    }
    
}
