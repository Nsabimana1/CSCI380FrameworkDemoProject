package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public  Result ShowData(){
        return ok(Ind.render());
    }

    public Result Openlogin_page(){
        return ok(login_page.render());
    }
}
