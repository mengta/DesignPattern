package Template;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football Initialize");
    }

    @Override
    void startPlay() {
        System.out.println("Football Start");
    }

    @Override
    void endPlay() {
        System.out.println("Football End");
    }
}
