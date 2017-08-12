package Observer;

public class BinaryObeserver extends Observer {
    public BinaryObeserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println(Integer.toBinaryString(subject.getState()));
    }
}
