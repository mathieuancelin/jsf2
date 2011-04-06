package cx.ath.mancel01.jsf2thegoodway.service;

import javax.ejb.Stateless;

/**
 * Boundary for business logic. Here you can inject your persitence
 * context (to be transactionnal and secure), your other services, etc ...
 * It's the starting point of your business logic
 * 
 * @author Mathieu ANCELIN - SERLI (mathieu.ancelin@serli.com)
 */
@Stateless
public class HelloBean {

    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
