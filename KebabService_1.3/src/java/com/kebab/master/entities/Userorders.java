/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kebab.master.entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author axel.bentodas
 */
@Entity
@Table(name = "userorders")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userorders.findAll", query = "SELECT u FROM Userorders u")
    , @NamedQuery(name = "Userorders.findById", query = "SELECT u FROM Userorders u WHERE u.userordersPK.id = :id")
    , @NamedQuery(name = "Userorders.findByUsersId", query = "SELECT u FROM Userorders u WHERE u.userordersPK.usersId = :usersId")
    , @NamedQuery(name = "Userorders.findByOrdersId", query = "SELECT u FROM Userorders u WHERE u.userordersPK.ordersId = :ordersId")})
public class Userorders implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UserordersPK userordersPK;

    public Userorders() {
    }

    public Userorders(UserordersPK userordersPK) {
        this.userordersPK = userordersPK;
    }

    public Userorders(int id, int usersId, int ordersId) {
        this.userordersPK = new UserordersPK(id, usersId, ordersId);
    }

    public UserordersPK getUserordersPK() {
        return userordersPK;
    }

    public void setUserordersPK(UserordersPK userordersPK) {
        this.userordersPK = userordersPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userordersPK != null ? userordersPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userorders)) {
            return false;
        }
        Userorders other = (Userorders) object;
        if ((this.userordersPK == null && other.userordersPK != null) || (this.userordersPK != null && !this.userordersPK.equals(other.userordersPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kebab.master.entities.Userorders[ userordersPK=" + userordersPK + " ]";
    }
    
}
