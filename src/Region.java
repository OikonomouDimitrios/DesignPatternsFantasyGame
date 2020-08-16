import java.util.LinkedList;
import java.util.List;

//composite
public class Region extends Area {
    private String name;
    List subAreas = new LinkedList<Area>();

    @Override
    public void displayMap() {
        System.out.println("Map of " + getRegionName());

        subAreas.forEach(e -> ((Area) e).displayMap());

        System.out.println("End Map of " + getRegionName());

    }

    @Override
    public void addSubArea(Area newArea) {
        subAreas.add(newArea);
    }

    public Region(String newName) {
        name = newName;
    }

    public String getRegionName() {
        return name;
    }
}
