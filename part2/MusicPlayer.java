package part2;
//PART2-----------------------------------------------------------------------------------------------------------------

public class MusicPlayer {
    private boolean isPlaying = false;

    public void playMusic() {
        if (!isPlaying) {
            isPlaying = true;
            System.out.println("[MusicPlayer] Playing music");
        }
    }

    public void stopMusic() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("[MusicPlayer] Stopping music");
        }
    }
}