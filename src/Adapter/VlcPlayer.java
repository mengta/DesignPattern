package Adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println(fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
