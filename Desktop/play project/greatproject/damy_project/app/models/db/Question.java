package models;

import io.ebean.*;
import play.data.validation.Constraints;
import javax.persistence.*;

@Entity
public class Question_table extends Model {
    @Id
    public Integer Question_id;
    public String Question_content;
    public int Requester_id;
    public Question_topics Question_topic;

    public Finder<Integer, Question_table> finder = new Finder<>(Question_table.class);

}
