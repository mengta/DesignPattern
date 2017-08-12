package Command;

public class Stock {
    private String name="ABC";
    private int quantity=10;
    public void buy(){
        System.out.println(name+" "+quantity);
    }
    public void sell(){
        System.out.println(name+" "+quantity);
    }
}
