package models;
import io.ebean.*;
import play.data.validation.Constraints;
import javax.persistence.*;

@Entity
public class Response_table extends Model{
    @Id
    private int Response_id;
    private String Response_content;
    private int Responder_id;
}
