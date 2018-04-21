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
@Table(name = "userorders")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userorders.findAll", query = "SELECT u FROM Userorders u")
    , @NamedQuery(name = "Userorders.findById", query = "SELECT u FROM Userorders u WHERE u.id = :id")
    , @NamedQuery(name = "Userorders.findByIdUser", query = "SELECT u FROM Userorders u WHERE u.idUser = :idUser")
    , @NamedQuery(name = "Userorders.findByIdOrder", query = "SELECT u FROM Userorders u WHERE u.idOrder = :idOrder")})
public class Userorders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idUser")
    private int idUser;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idOrder")
    private int idOrder;

    public Userorders() {
    }

    public Userorders(Integer id) {
        this.id = id;
    }

    public Userorders(Integer id, int idUser, int idOrder) {
        this.id = id;
        this.idUser = idUser;
        this.idOrder = idOrder;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
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
        if (!(object instanceof Userorders)) {
            return false;
        }
        Userorders other = (Userorders) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kebab.master.Userorders[ id=" + id + " ]";
    }
    
}
