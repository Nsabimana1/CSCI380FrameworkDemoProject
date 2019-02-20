package models.moreClasses;

public enum NotificationTypes {
    following, postingQuestion, uploadingPicture;

    public static String getNotificationContent(NotificationTypes type){
        switch (type){
            case following:
                return "started following you";
            case postingQuestion:
                return "posted a question";
            case uploadingPicture:
                return "uploaded a new picture";
            default:
                return null;
        }
    }
}
