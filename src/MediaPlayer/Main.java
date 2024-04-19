package MediaPlayer;

public class Main {
    public static void main(String[] args) {
        AudioRecording audioRecording = new AudioRecording("Concerto", 3,  8);
        VideoRecording videoRecording = new VideoRecording("Compleanno",4,2,5);
        Image image = new Image("Copertina", 4);


        audioRecording.alzaVolume();
        audioRecording.play();

        audioRecording.abbassaVolume();
        audioRecording.play();

        videoRecording.play();
        videoRecording.alzaVolume();

        Image.show();
    }
}
