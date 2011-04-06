package cx.ath.mancel01.jsf2thegoodway;

import cx.ath.mancel01.jsf2thegoodway.annotation.Presenter;
import cx.ath.mancel01.jsf2thegoodway.service.HelloBean;
import javax.ejb.EJB;
import javax.inject.Inject;

@Presenter
public class MyPresenter {

    @Inject MyView view;

    @EJB HelloBean hello;

    public void sayHello() {
        view.setMessage(hello.sayHello(view.getName()));
    }

}
