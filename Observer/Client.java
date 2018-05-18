public class Client {
    public static void main(String[] args) {
        Celebrity neymar = new Celebrity("Neymar");
        FollowerObserver clarissa = new FollowerObserver("Clarissa");
        FollowerObserver leticia = new FollowerObserver("Leticia");

        neymar.attach(clarissa);
        neymar.attach(leticia);

        neymar.tweet("Deus é TOP");
        neymar.detach(1);
        neymar.tweet("o ousado chegou !!! kkkk");
    }
}