package LAB_FAT;
interface Play{
    public void play();
}
class MusicPlayer implements Play{
    @Override
    public void play() {
        System.out.println("Playing song form MusicPlayer..!");
        System.out.println();
    }
}
class VideoPlayer implements Play{
    @Override
    public void play() {
        System.out.println("Playing song form VideoPlayer ..!");
    }
}
public class Ex_10 {
    public static void main(String[] args) {
        //Create an interface Playable with play() method. Implement in MusicPlayer and VideoPlayer.
        MusicPlayer mp = new MusicPlayer();
        mp.play();

        VideoPlayer vp = new VideoPlayer();
        vp.play();
    }
}
