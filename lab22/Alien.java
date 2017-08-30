/**
 * WRITE A CLASS DESCRIPTION HERE.
 * 
 * @author YOUR NAME
 * @version TODAY'S DATE
 */
public class Alien {
    
    private static int alienCount;
    private static int rogueCount;
    
    private String name;        // original name
    private String homePlanet;  // the home planet
    private Location location;  // where the alien is currently located
    private String alias;       // name that they go by on earth
    private boolean wanted;     // if the MIB agency is looking for them
    
    /**
     * Default constructor - We know we have an alien but don't know much
     * about it. This method simply calls the explicit value constructor.
     */
    public Alien() {
        this("Unknown", "Unknown", Location.ISAT, "Unknown");
    }
    
    /**
     * Explicit value constructor - Sets each of the attributes based on the
     * parameters and sets wanted to false. This method should increment the
     * alien count.
     *
     * @param name this alien's original name
     * @param homePlanet the origination of this alien
     * @param loc the current location for this alien
     * @param alias the name this alien goes by on Earth
     */
    public Alien(String name, String homePlanet, Location loc, String alias) {
        
    }
    
    /**
     * Indicates that an alien that has been captured and placed at
     * the JMU detention facility.
     * If the alien was a wanted criminal, then reset wanted to false and
     * decrement the rogueCount. In either case, this alien should be placed
     * at the JMU location.
     */
    public void capturedJMU() {
        
    }
    
    /**
     * Indicates an alien has been deported. It is possible to deport an
     * alien without a prior capture. If this alien is wanted, reset the
     * the wanted attribute to false and decrement the rogueCount. In either
     * case, set the location to null and decrement the alienCount.
     */
    public void deport() {
        
    }
    
    /**
     * Identifies that an alien has violated the rules of alien immigration.
     * If this is a new identification (wanted is false), set wanted to true
     * and increment the rogue count. If this alien is already wanted, then
     * do neither.
     */
    public void goneRogue() {
        
    }
    
    /**
     * Places this alien into a new location.
     *
     * @param newLoc new current location
     */
    public void move(Location newLoc) {
        
    }
    
    /**
     * Returns the current location of this alien.
     * 
     * @return current location
     */
    public Location getCurrentLocation() {
        
    }
    
    /**
     * Returns the total number of aliens on the planet.
     *
     * @return total number of aliens (including those wanted)
     */
    public static int getNumberAliens() {
        
    }
    
    /**
     * Returns the total number of wanted aliens on the planet.
     *
     * @return number of wanted aliens
     */
    public static int getNumberWanted() {
        
    }
    
    /**
     * Returns basic information about this alien.
     *
     * @return a String of the form: "%s aka %s from %s currently at %s"
     * followed by the term "ROGUE" or the empty String,
     * depending on whether isWanted is true or false.
     * If location is null, output "Off Planet" in place of the location.
     */
    public String toString() {
        String location;
        String rogue;
        
        if (this.location != null) {
            location = this.location.toString();
        }
        else {
            location = "Off Planet";
        }
        
        if (wanted) {
            rogue = "ROGUE";
        }
        else {
            rogue = "";
        }
        
        return String.format("%s aka %s from %s is currently at %s %s",
                             this.name, this.alias, this.homePlanet,
                             location, rogue);
    }
}
