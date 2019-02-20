package models.db;

import io.ebean.Finder;
import io.ebean.Model;
import models.moreClasses.NotificationState;
import models.moreClasses.NotificationTypes;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Entity
public class UserNotifications extends Model {
    @Id
    public int notificationId;

    @Enumerated(EnumType.STRING)
    public NotificationTypes notificationType;

    @Enumerated(EnumType.STRING)
    public NotificationState notificationState;

    public Date notificationDate;
    public Timestamp notificationTime;
    public String notificationContent;

    @OneToMany(cascade = CascadeType.ALL)
    public User notifier;

    @OneToMany(cascade = CascadeType.ALL)
    public User notified;

    public static Finder<Integer, UserNotifications> finder = new Finder<>(UserNotifications.class);

    public static List<UserNotifications> getAllNofications(){
        return finder.all();
    }

    public static Queue<UserNotifications> getNotificationsByUser(User passedNotified){
        Queue<UserNotifications> notifications = new LinkedList<>();
        for(UserNotifications notification: getAllNofications()){
            if(notification.notified.equals(passedNotified)){
                notifications.add(notification);
            }
        }
        return notifications;
    }

    public static Queue<UserNotifications> getNewNotificationsByUser(){
        Queue<UserNotifications> notifications = new LinkedList<>();
        for(UserNotifications notification: getAllNofications()){
            if(notification.notificationState.equals(NotificationState.NotViewed)){
                notifications.add(notification);
            }
        }
        return notifications;
    }
}
