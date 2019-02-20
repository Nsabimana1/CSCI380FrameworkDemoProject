package models.db;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class UserFollowers extends Model {
    @Id
    @Column(unique = true)
    public int followersId;

    @ManyToOne(cascade = CascadeType.ALL)
    public User followedUser;

    @ManyToOne(cascade = CascadeType.ALL)
    public User followingUser;

    public static Finder<Integer, UserFollowers> finder = new Finder<Integer, UserFollowers>(UserFollowers.class);

    public static List<UserFollowers> getAll(){
        return finder.all();
    }

    public static ArrayList<User> findFollowersByUser(User passedUser) {
        ArrayList<User> followers = new ArrayList<>();
        if(UserFollowers.getAll().isEmpty()) {
            return followers;
        }else{
            for (UserFollowers userFollowersObject : UserFollowers.getAll()) {
                if (userFollowersObject.followedUser != null && userFollowersObject.followedUser.equals(passedUser)) {
                    followers.add(userFollowersObject.followingUser);
                }
            }
            return followers;
        }
    }

    public static boolean isFollowedBy(User mainUser, User passedFollower){
        if(UserFollowers.findFollowersByUser(mainUser).isEmpty()){
            return false;
        }else {
            for (User follower : UserFollowers.findFollowersByUser(mainUser)) {
                if (follower.equals(passedFollower)) {
                    return true;
                }
            }
        }
        return false;
    }
}
