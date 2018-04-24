/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kebab.master.controller;

import com.kebab.master.entities.Orders;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author axel.bentodas
 */
@Stateless
public class OrdersFacade extends AbstractFacade<Orders> {

    @PersistenceContext(unitName = "KebabService_1.3PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrdersFacade() {
        super(Orders.class);
    }
    
}
