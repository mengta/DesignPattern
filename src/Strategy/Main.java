package Strategy;

public class Main {
    public static void main(String[] args){
        Context context=new Context(new OperationAdd());
        System.out.println(context.executeStrategy(10,5));
    }
}
