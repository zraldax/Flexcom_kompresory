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
@Table(name = "uzivatel")
@NamedQueries({
    @NamedQuery(name = "Uzivatel.findAll", query = "SELECT u FROM Uzivatel u")
    , @NamedQuery(name = "Uzivatel.findByIduzivatel", query = "SELECT u FROM Uzivatel u WHERE u.iduzivatel = :iduzivatel")
    , @NamedQuery(name = "Uzivatel.findByName", query = "SELECT u FROM Uzivatel u WHERE u.name = :name")
    , @NamedQuery(name = "Uzivatel.findByPassoworld", query = "SELECT u FROM Uzivatel u WHERE u.passoworld = :passoworld")
    , @NamedQuery(name = "Uzivatel.findByEmail", query = "SELECT u FROM Uzivatel u WHERE u.email = :email")})
public class Uzivatel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iduzivatel")
    private Integer iduzivatel;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "passoworld")
    private String passoworld;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;

    public Uzivatel() {
    }

    public Uzivatel(Integer iduzivatel) {
        this.iduzivatel = iduzivatel;
    }

    public Uzivatel(Integer iduzivatel, String name, String passoworld, String email) {
        this.iduzivatel = iduzivatel;
        this.name = name;
        this.passoworld = passoworld;
        this.email = email;
    }

    public Integer getIduzivatel() {
        return iduzivatel;
    }

    public void setIduzivatel(Integer iduzivatel) {
        this.iduzivatel = iduzivatel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassoworld() {
        return passoworld;
    }

    public void setPassoworld(String passoworld) {
        this.passoworld = passoworld;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iduzivatel != null ? iduzivatel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Uzivatel)) {
            return false;
        }
        Uzivatel other = (Uzivatel) object;
        if ((this.iduzivatel == null && other.iduzivatel != null) || (this.iduzivatel != null && !this.iduzivatel.equals(other.iduzivatel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beany.Uzivatel[ iduzivatel=" + iduzivatel + " ]";
    }
    
}
