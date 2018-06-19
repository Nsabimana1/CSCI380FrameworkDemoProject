package models;

public class Users {
    private int User_id;
    private String User_name;
    private String User_password;
    private privilege User_privilages;

    public Users(Integer user_id, String user_name, String user_password, privilege user_plivilages){
        this.User_id = user_id;
        this.User_name = user_name;
        this.User_password = user_password;
        this.User_privilages = user_plivilages;
    }

    public int getUser_id() {
        return User_id;
    }

    public String getUser_name(){
        return this.User_name;
    }

    public  String getUser_passoword(){
        return this.User_password;
    }

    public  privilege getUser_privilages(){
        return this.User_privilages;
    }
}
