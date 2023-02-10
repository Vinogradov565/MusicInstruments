public  class Trumpet implements Instrument {
    int diameter;
    Trumpet( int diameter ) {
        this.diameter = diameter;
    }
    public void play() {
        System.out.println("Играет труба с диаметром "+ diameter);
    }
}
