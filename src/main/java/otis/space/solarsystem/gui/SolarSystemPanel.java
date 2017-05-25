package otis.space.solarsystem.gui;

import otis.space.solarsystem.entity.Planet;

import javax.swing.*;
import java.awt.*;
import java.util.Set;

/**
 * Created by eotilid on 27/04/2017.
 */
public class SolarSystemPanel extends JPanel{

    private Set<Planet> planets;

    public SolarSystemPanel(Set<Planet> planets){
        super(new BorderLayout());
        this.setBackground(Color.BLACK);
        this.planets=planets;
    }

    public void drawPlanets(){

    }
}
