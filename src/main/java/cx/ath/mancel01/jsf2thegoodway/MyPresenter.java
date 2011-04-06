package cx.ath.mancel01.jsf2thegoodway;

import cx.ath.mancel01.jsf2thegoodway.annotation.Presenter;
import cx.ath.mancel01.jsf2thegoodway.service.HelloBean;
import javax.ejb.EJB;
import javax.inject.Inject;

/**
 * The presenter bean responsible for UI logique. It manipulate the
 * current view bean and interact with business boundary.
 *
 * @author Mathieu ANCELIN - SERLI (mathieu.ancelin@serli.com)
 */
@Presenter
public class MyPresenter {

    @Inject MyView myView;

    @EJB HelloBean helloBean;

    public void sayHello() {
        myView.setMessage(helloBean.sayHello(myView.getName()));
    }
}
