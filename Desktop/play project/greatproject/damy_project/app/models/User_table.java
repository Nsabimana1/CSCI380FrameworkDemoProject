package models;

import io.ebean.*;
import play.data.validation.Constraints;
import javax.persistence.*;

@Entity
public class User_table extends Model {
    @Id
    public int User_id;
    public String User_name;
    public String User_password;
    public privilege User_privilages;
}
