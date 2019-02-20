package models;

import io.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Question_response_table extends Model {

    @Id
    public int id;

    @ManyToOne(cascade = CascadeType.ALL)
    public Question_table question_table;

    @ManyToOne(cascade = CascadeType.ALL)
    public Response_table response_table;
}
