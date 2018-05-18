import java.util.ArrayList;

public class Celebrity {
    private String name;
    private ArrayList<Observer> followers;

    public Celebrity(String name) {
        this.name = name;
        followers = new ArrayList<>();
    }

    public void attach(Observer follower) {
        followers.add(follower);
    }

    public void detach(int index) {
        System.out.println("Um usuário parou de seguir " + name);
        followers.remove(index);
    }

    public void notifyFollowers(String tweet) {
        for (Observer follower : followers) {
            follower.update(name, tweet);
        }
    }

    public void tweet(String tweet) {
        System.out.println(name + " acabou de tweetar: " + tweet);
        notifyFollowers(tweet);
    }
}