package otis.space.solarsystem.gui;

import otis.space.solarsystem.entity.Planet;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Set;

/**
 * Created by eotilid on 26/04/2017.
 */
public class MainFrame extends JFrame {

    public MainFrame() {
        this.getContentPane().add(new JLabel(), BorderLayout.CENTER);
        this.setVisible(true);
        this.setSize(800,600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
    }

    public void initialise(Set<Planet> planets){
        this.setContentPane(new SolarSystemPanel(planets));
    }
}
