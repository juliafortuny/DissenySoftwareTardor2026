package projecteInicial;

public class HomeCinemaFacade {

    private String nom;
    private Amplifier amp;
    private Tuner tuner;
    private DvdPlayer dvd;
    private CdPlayer cd;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;

    HomeCinemaFacade(String nom){
        this.nom = nom;
        this.amp = new Amplifier("Top-O-Line Amplifier");
        this.tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        this.dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        this.cd = new CdPlayer("Top-O-Line CD Player", amp);
        this.projector = new Projector("Top-O-Line Projector", dvd);
        this.lights = new TheaterLights("Theater Ceiling Lights");
        this.screen = new Screen("Theater Screen");
        this.popper = new PopcornPopper("Popcorn Popper");
    }

    public void veurePelicula(){
        popper.on();
        popper.pop();

        lights.dim(10);

        screen.down();

        projector.on();
        projector.wideScreenMode();

        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);

        dvd.on();
        dvd.play(nom);
    }

}
