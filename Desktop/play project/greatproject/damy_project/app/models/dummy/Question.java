package models;

public class Question {
    private int Q_id;
    private String Q_content;
    private int Requester_id;
    private Question_topics Q_topic;

    public Question(int q_id, String q_content, int requester_id, Question_topics q_topic){
        this.Q_id = q_id;
        this.Q_content = q_content;
        this.Requester_id = requester_id;
        this.Q_topic = q_topic;
    }

    public int getQ_id() {
        return Q_id;
    }

    public String getQ_content() {
        return Q_content;
    }

    public int getRequester_id() {
        return Requester_id;
    }

    public Question_topics getQ_topic() {
        return Q_topic;
    }
}
