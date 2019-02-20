package controllers;

import models.db.User;
import models.dummy.Privilege;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

public class Users_controller extends Controller {

    @Inject
    FormFactory formFactory;

    public Result showUsers() {
        return TODO;
    }

    public Result createUser(Integer User_id) {
        return TODO;
    }

    public Result verifyUser(int User_id) {
        return TODO;
    }


    public Result editUser(int User_id) {
        return TODO;
    }

    public Result DeleteUser(int User_id) {
        return TODO;
    }

    public Result updateUser() {
        return TODO;
    }

    public Result saveUser() {
        Form<User> userForm = formFactory.form(User.class).bindFromRequest();
        User UserObject = userForm.get();
        UserObject.userPrivileges = Privilege.Standard_user;
        System.out.print(UserObject.userPrivileges);
        UserObject.save();
        System.out.println("I reached here");
        return redirect(routes.Application.Openlogin_page());
    }

    public Result destroyUser() {
        return TODO;
    }
}
