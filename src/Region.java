import java.util.LinkedList;
import java.util.List;

//composite
public class Region extends Area {
    private String name;
    List<Mappable> subAreas = new LinkedList<>();

    @Override
    public void displayMap() {
        System.out.println("Map of " + getRegionName());
        for (Mappable area : subAreas) {
            area.displayMap();
        }

        System.out.println("End Map of " + getRegionName());

    }

    @Override
    public void addSubArea(Mappable newArea) {
        subAreas.add(newArea);
    }

    public Region(String newName) {
        name = newName;
    }

    public String getRegionName() {
        return name;
    }
}
