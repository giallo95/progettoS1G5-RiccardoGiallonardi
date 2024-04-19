package MediaPlayer;

public class AudioRecording extends MultimediaItem{
    public AudioRecording(String title, int duration, int volume) {
        super(title, duration, volume);
    }

    // Metodo per alzare il volume
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    // Metodo per alzare il volume
    public void alzaVolume() {
        volume++;
    }

    @Override
    //Il metodo play è stato sovrascritto dalla classe padre MultimediaItem
    public void play() {
        System.out.println("Riproduzione audio: " + title);
        if (duration > 0) {
            for (int i = 0; i < duration; i++) {
                String volumeString = repeatString("!", volume);
                System.out.println(title + " " + volumeString);
            }
        } else {
            System.out.println("Riproduzione fallita.");
        }
    }

    // Metodo per ripetere una stringa un numero di volte
    private String repeatString(String str, int times) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++) {
            result.append(str);
        }
        return result.toString();
    }

}
