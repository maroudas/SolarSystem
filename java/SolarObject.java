/**
* This abstract class contains the definitions of what makes a Solar object.
 * Extends the Point class.
 * @author Nectarios Maroudas
 */

public abstract class SolarObject extends Point {
    private double diameter;
    private String colour;

    /**
     * Constructor.
     * @param dis The Distance of the Solar Object from the centre of the Universe.
     * @param a The orbital of the SolarObject.
     * @param diam The diameter of the SolarObject
     * @param col The colour of this SolarObject, as a string. Case sensitive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY,
     * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW. Alternatively, a 24 bit hexadecimal string representation of an RGB colour is also accepted, e.g. "#FF0000"</p>
     */
    public SolarObject(double dis, double a, double diam, String col) {
        super(a, dis);
        diameter = diam;
        colour = col;
    }
    /**
     * Returns the distance of the Solar object from the centre of the Universe.
     * @return The distance of the Solar object from the centre of the Universe.
     */

    public double getDistance()
    {
        return distance;
    }

    /**
     * Returns the angle of the Solar object in its current orbit.
     * @return the angle of orbit of the Solar object.
     */

    public double getAngle()
    {
        return angle;
    }

    /**
     * Returns the diameter of the Solar object.
     * @return The diameter of the Solar object.
     */

    public double getDiameter()
    {
        return diameter;
    }

    /**
     * Returns the color of the Solar object.
     * @return The color of the Solar object.
     */

    public String getColour()
    {
        return colour;
    }

    /**
     * Sets the distance of the Solar object from the center of the Universe.
     * @param d The distance of the Solar object from the centre of the Universe.
     */

    public void setDistance(double d)
    {
        distance = d;
    }

    /**
     * Sets the angle of the Solar object in its orbit.
     * @param a The angle of the Solar object in its current orbit.
     */

    public void setAngle(double a)
    {
        angle = a;
    }

    /**
     * Sets the diameter of the Solar object.
     * @param d The diameter of the Solar object..
     */

    public void setDiameter(double d)
    {
        diameter = d;
    }

    /**
     * Sets the colour of the object.
     * @param c The colour of this object, as a string. Case sensitive.
     * <p> One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY,
     * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW. Alternatively, a 24 bit hexadecimal string representation of an RGB colour is also accepted, e.g. "#FF0000"</p>
     */

    public void setColour(String c)
    {
        colour = c;
    }
}
