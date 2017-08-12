package Prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();
        Shape cloneShape=ShapeCache.getShape("1");
        System.out.println(cloneShape.getType());
    }
}
