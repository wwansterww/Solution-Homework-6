package part2;//PART2-----------------------------------------------------------------------------------------------------------------

public class MusicPlayerCommand implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.playMusic();
    }

    @Override
    public void undo() {
        musicPlayer.stopMusic();
    }
}