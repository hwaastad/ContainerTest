/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.containertesting;

import javax.ejb.Stateless;

/**
 *
 * @author helge
 */
@Stateless
public class TestBean implements TestBeanLocal {

    @Override
    public String doTest() {
        System.out.println("Doing test");
        return "test";
    }
}
