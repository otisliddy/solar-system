package otis.space.solarsystem.entity;

import otis.space.solarsystem.SolarSystemContants;

import java.awt.*;

/**
 * Representents a entity of the solar system.
 */
public class Planet {

    private String name;
    private double semiMajorAxis;
    private double orbitalPeriod;
    private double orbitalSpeed;

    private double position;

    public Planet(String name, double semiMajorAxis) {
        this.name = name;
        this.semiMajorAxis = semiMajorAxis;
        this.orbitalPeriod = 2 * Math.PI * Math.sqrt(Math.pow(semiMajorAxis, 3) / SolarSystemContants.STANDARD_GRAVITATION_PARAMETER);
        this.orbitalSpeed = Math.sqrt(SolarSystemContants.STANDARD_GRAVITATION_PARAMETER / semiMajorAxis);
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public double getOrbitalSpeed() {
        return orbitalSpeed;
    }

    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public Point getPosition(){

    }

}
