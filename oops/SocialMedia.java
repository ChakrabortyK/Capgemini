
import java.util.ArrayList;

public class SocialMedia {
    
}
class User{

    String name;
    ArrayList<String> posts = new ArrayList<>();
    ArrayList<User> followers = new ArrayList<>();
    int id;

    User(String name){
        this.name = name;

    }

    void update(String message,User followee){
        // notify started following you
        // print Username
        // posted message


        

    }

    void addFollowers(User user){
        followers.add(user);
    }

    void notifyFollowers(String message){
        System.out.println(this.name + " notified: " + message);
    }

    void post(String content){
        // {username} posted : {content}
    }

    void follow(User user){

    }

    void unfollow(User user){

    }

}

class Platform{
    void addUser(int id,String name){
        // username added successfully
    }

        void post(int userId,String content){
        // {username} posted : {ontent}
    }

    void follow(int followerId,int followeeId){
        // print user 1 followed user 2
    }

    void unfollow(int followerId,int followeeId){
        //print has unfollowed


    }

}

