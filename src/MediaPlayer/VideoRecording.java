package MediaPlayer;

public class VideoRecording extends MultimediaItem {
    private int luminosita;
    public VideoRecording(String title, int duration, int volume, int luminosita) {
        super(title, duration, volume);
        this.volume = volume;
        this.luminosita = luminosita;

    }
    public void aumentaLuminosita() {
            luminosita++;
    }


    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
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
    public void play() {
        for (int i = 0; i < getDuration(); i++) {
            String volumeString = repeatString("!", volume);
            String luminositaString = repeatString("*", luminosita);
            System.out.println(getTitle() + " " + volumeString + luminositaString);
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
