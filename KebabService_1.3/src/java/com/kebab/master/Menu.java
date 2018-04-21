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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author guill
 */
@Entity
@Table(name = "menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Menu.findAll", query = "SELECT m FROM Menu m")
    , @NamedQuery(name = "Menu.findById", query = "SELECT m FROM Menu m WHERE m.id = :id")
    , @NamedQuery(name = "Menu.findByIdOrders", query = "SELECT m FROM Menu m WHERE m.idOrders = :idOrders")
    , @NamedQuery(name = "Menu.findByType", query = "SELECT m FROM Menu m WHERE m.type = :type")
    , @NamedQuery(name = "Menu.findByHour", query = "SELECT m FROM Menu m WHERE m.hour = :hour")
    , @NamedQuery(name = "Menu.findByNbMenu", query = "SELECT m FROM Menu m WHERE m.nbMenu = :nbMenu")})
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idOrders")
    private int idOrders;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "hour")
    private String hour;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nbMenu")
    private int nbMenu;

    public Menu() {
    }

    public Menu(Integer id) {
        this.id = id;
    }

    public Menu(Integer id, int idOrders, String type, String hour, int nbMenu) {
        this.id = id;
        this.idOrders = idOrders;
        this.type = type;
        this.hour = hour;
        this.nbMenu = nbMenu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdOrders() {
        return idOrders;
    }

    public void setIdOrders(int idOrders) {
        this.idOrders = idOrders;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public int getNbMenu() {
        return nbMenu;
    }

    public void setNbMenu(int nbMenu) {
        this.nbMenu = nbMenu;
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
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kebab.master.Menu[ id=" + id + " ]";
    }
    
}
