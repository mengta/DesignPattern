package Singleton;

public class DCLSingle {
    private volatile static DCLSingle instance;
    private DCLSingle(){}
    public static DCLSingle getInstance(){
        if (instance==null){
            synchronized (DCLSingle.class){
                if(instance==null){
                    instance=new DCLSingle();
                }
            }
        }
        return instance;
    }
}
