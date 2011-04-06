package cx.ath.mancel01.jsf2thegoodway.service;

import javax.ejb.Singleton;

@Singleton
public class HelloBean {

    public String sayHello(String name) {
        return "Fuck you " + name + "!";
    }
}
