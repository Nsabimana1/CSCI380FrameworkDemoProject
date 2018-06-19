package models;
import io.ebean.*;
import play.data.validation.Constraints;
import javax.persistence.*;

public class Response_table extends Model{
    private int Response_id;
    private String Response_content;
    private int Responder_id;
}
