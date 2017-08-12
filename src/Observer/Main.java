package Observer;

public class Main {
    public static void main(String[] args){
        Subject subject=new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObeserver(subject);
        subject.setState(15);
        subject.setState(10);
    }
}
