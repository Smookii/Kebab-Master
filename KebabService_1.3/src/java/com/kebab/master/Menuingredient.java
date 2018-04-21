/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kebab.master;

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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author guill
 */
@Entity
@Table(name = "menuingredient")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Menuingredient.findAll", query = "SELECT m FROM Menuingredient m")
    , @NamedQuery(name = "Menuingredient.findById", query = "SELECT m FROM Menuingredient m WHERE m.id = :id")
    , @NamedQuery(name = "Menuingredient.findByIdMenu", query = "SELECT m FROM Menuingredient m WHERE m.idMenu = :idMenu")
    , @NamedQuery(name = "Menuingredient.findByIdIngredient", query = "SELECT m FROM Menuingredient m WHERE m.idIngredient = :idIngredient")})
public class Menuingredient implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idMenu")
    private int idMenu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idIngredient")
    private int idIngredient;

    public Menuingredient() {
    }

    public Menuingredient(Integer id) {
        this.id = id;
    }

    public Menuingredient(Integer id, int idMenu, int idIngredient) {
        this.id = id;
        this.idMenu = idMenu;
        this.idIngredient = idIngredient;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public int getIdIngredient() {
        return idIngredient;
    }

    public void setIdIngredient(int idIngredient) {
        this.idIngredient = idIngredient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menuingredient)) {
            return false;
        }
        Menuingredient other = (Menuingredient) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kebab.master.Menuingredient[ id=" + id + " ]";
    }
    
}
