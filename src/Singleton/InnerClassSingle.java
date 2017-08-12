package Singleton;

public class InnerClassSingle {
    private static class Holder{
        private static final InnerClassSingle instance=new InnerClassSingle();
    }
    private InnerClassSingle(){}
    public static final InnerClassSingle getInstance(){
        return Holder.instance;
    }
}
