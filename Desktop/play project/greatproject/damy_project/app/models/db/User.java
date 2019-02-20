package models;

import io.ebean.*;
import play.data.Form;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.List;

@Entity
public class User_table extends Model {
    @Id
    public int userId;
    public String userName;
    public String userPassword;
    public String email;
    public privilege userPrivileges;

    public Finder<Integer, User_table> finder = new Finder<>(User_table.class);

    public List<User_table> allUsers() {
        return finder.all();
    }

}
