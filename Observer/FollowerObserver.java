public class FollowerObserver implements Observer {
    private String followerName;

    public FollowerObserver(String name) {
        followerName = name;
    }

    @Override
    public void update(String name, String tweet) {
        System.out.println(followerName + " acabou de receber um tweet de " +
        name + "! \"" + tweet + "\"");
    }
}