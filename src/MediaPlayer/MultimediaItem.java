package MediaPlayer;

public abstract class MultimediaItem {
    protected String title;
    protected int duration;
    protected int volume;

    public MultimediaItem(String title, int duration, int volume) {
        this.title = title;
        this.duration = duration;
        this.volume = volume;
    }
    public String getTitle() {
        return title;
    }
    public int getDuration() {
        return duration;
    }

    public int getVolume() {
        return volume;
    }

    public abstract void play();
}
