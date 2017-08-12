package Singleton;

public class SynLazySingle {
    private static SynLazySingle instance;
    private SynLazySingle(){
    }
    public static synchronized SynLazySingle getInstance(){
        if(instance==null){
            instance=new SynLazySingle();
        }
        return instance;
    }
}
