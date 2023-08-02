package Structural.Facade;

public class MoviePlayerFascade {
    Dvd dvd;
    Amplifier amp;
    Tuner tuner;
    Projector projector;

    public MoviePlayerFascade() {
        this.amp = new Amplifier();
        this.dvd = new Dvd();
        this.tuner = new Tuner();
        this.projector = new Projector();
    }

    public void playMovie() {
        System.out.println("Get ready to watch a movie...");
        projector.on();
        amp.on();
        dvd.on();
        dvd.play("Movie");
    }
}
