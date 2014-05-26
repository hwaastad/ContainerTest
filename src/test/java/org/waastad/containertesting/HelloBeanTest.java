/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.containertesting;

import javax.ejb.EJB;
import org.apache.openejb.junit.jee.EJBContainerRule;
import org.apache.openejb.junit.jee.InjectRule;
import org.apache.openejb.junit.jee.config.Properties;
import org.apache.openejb.junit.jee.config.Property;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.ClassRule;
import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author helge
 */
@Properties({
    @Property(key = "org.apache.openejb.injection.FallbackPropertyInjector",value = "org.apache.openejb.mockito.MockitoInjector")
})
public class HelloBeanTest {

    @ClassRule
    public static final EJBContainerRule CONTAINER_RULE = new EJBContainerRule();
    @Rule
    public final InjectRule injectRule = new InjectRule(this, CONTAINER_RULE);

    @EJB
    private HelloBeanLocal helloBeanLocal;
    @Mock
    private TestBeanLocal mockTestBean;

    public HelloBeanTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of sayHello method, of class HelloBean.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSayHello() throws Exception {
        System.out.println("sayHello");
        Mockito.when(mockTestBean.doTest()).thenReturn("ompalompa");
        helloBeanLocal.sayHello();
    }
}
