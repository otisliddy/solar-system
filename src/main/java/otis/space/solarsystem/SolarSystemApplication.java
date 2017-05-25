package otis.space.solarsystem;

import otis.space.solarsystem.gui.MainFrame;
import otis.space.solarsystem.entity.Planet;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by eotilid on 26/04/2017.
 */
public class SolarSystemApplication {

    private Set<Planet> planets = new HashSet<Planet>();

    public void initialize(){
        createPlanets();
        MainFrame panel = new MainFrame();
        panel.initialise(planets);
    }

    public void createPlanets(){
        planets.add(new Planet("Mars", SolarSystemContants.MARS_SEMI_MAJOR_AXIS));
        planets.add(new Planet("Venus", SolarSystemContants.VENUS_SEMI_MAJOR_AXIS));
    }
}
