package MediaPlayer;

public class Image {
    private static String title;
    private static int luminosita;

    public Image(String title, int luminosita){
        this.title = title;
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    // Metodo per diminuire la luminosità
    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }

    public static void show() {
        System.out.println(title+ " " + repeatString("*", luminosita));
    }
    private static String repeatString(String str, int times) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++) {
            result.append(str);
        }
        return result.toString();
    }
}