/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.containertesting;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author helge
 */
@Stateless
public class HelloBean implements HelloBeanLocal {

    @EJB
    private TestBeanLocal testBean;

    @Override
    public String sayHello() {
        System.out.println("Saying Hello....");
        System.out.println("From TestBean: " + testBean.doTest());
        return "Hello";
    }

}
