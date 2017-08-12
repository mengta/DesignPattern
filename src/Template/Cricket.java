package Template;

public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Start");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket End");
    }
}
