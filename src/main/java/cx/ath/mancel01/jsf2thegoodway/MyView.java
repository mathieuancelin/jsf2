package cx.ath.mancel01.jsf2thegoodway;

import cx.ath.mancel01.jsf2thegoodway.annotation.View;

/**
 * Data displayed in the view.
 * 
 * @author Mathieu ANCELIN - SERLI (mathieu.ancelin@serli.com)
 */
@View
public class MyView {

    private String name;

    private String message = "Please enter your name ...";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
