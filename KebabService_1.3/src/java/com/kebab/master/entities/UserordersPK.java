/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kebab.master.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author axel.bentodas
 */
@Embeddable
public class UserordersPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "users_id")
    private int usersId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "orders_id")
    private int ordersId;

    public UserordersPK() {
    }

    public UserordersPK(int id, int usersId, int ordersId) {
        this.id = id;
        this.usersId = usersId;
        this.ordersId = ordersId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsersId() {
        return usersId;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }

    public int getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(int ordersId) {
        this.ordersId = ordersId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) usersId;
        hash += (int) ordersId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserordersPK)) {
            return false;
        }
        UserordersPK other = (UserordersPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.usersId != other.usersId) {
            return false;
        }
        if (this.ordersId != other.ordersId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kebab.master.entities.UserordersPK[ id=" + id + ", usersId=" + usersId + ", ordersId=" + ordersId + " ]";
    }
    
}
