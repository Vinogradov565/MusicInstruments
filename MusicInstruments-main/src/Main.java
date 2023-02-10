public class Main {
    public static void main(String[] args) {

        Instrument[] musicTools = new Instrument[3];

        musicTools[0] = new Guitar(12);
        musicTools[1] = new Trumpet(40);
        musicTools[2] = new Drum(86);
        
        for (Instrument instruments : musicTools) {
            instruments.play();
        }

    }
}