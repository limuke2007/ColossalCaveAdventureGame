package Section12_JavaCollections.nAdventureGame;

import java.util.HashMap;
import java.util.Map;

public class Location {

// fields

   private final int locationID;
   private final String description;
   private final Map<String, Integer> exits;

// constructor

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if (exits != null) {
            this.exits = new HashMap<>(exits);
        } else {
            this.exits = new HashMap<>();
        }
        ;
        this.exits.put("Q", 0);
    }

// methods

//    public void addExit(String direction, int location) {         // exits are provided by the constructor,
//        exits.put(direction, location);                           //   so we don't need this method now
//    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);     // only return a "copy" of the map,
    }                                                   //      not the original map
}
