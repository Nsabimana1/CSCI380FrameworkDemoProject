package models.dummy;

import java.util.ArrayList;
import java.util.List;

public enum QuestionTopic {
    Politics, Technology, Arts, Sports, DefaultTopic;


    public static ArrayList<QuestionTopic> allTopics(){
        ArrayList<QuestionTopic> allTopics = new ArrayList<>();
        allTopics.add(QuestionTopic.Politics);
        allTopics.add(QuestionTopic.Technology);
        allTopics.add(QuestionTopic.Arts);
        allTopics.add(QuestionTopic.Sports);
        allTopics.add(QuestionTopic.DefaultTopic);
        return allTopics;
    }

    public static QuestionTopic purseTopic(String topic){
        switch (topic){
            case "Politics":
                return QuestionTopic.Politics;
            case "Technology":
                return QuestionTopic.Technology;
            case "Arts":
                return QuestionTopic.Arts;
            case "Sports":
                return QuestionTopic.Sports;
            case "Default":
                return QuestionTopic.DefaultTopic;
        }
        return QuestionTopic.DefaultTopic;
    }
}
