//leaf
public class Place extends Area {
    private String placeName;

    public String getPlaceName() {
        return placeName;
    }

    @Override
    public void displayMap() {
        System.out.println("The " + getPlaceName());
    }

    public Place(String newName) {
        placeName = newName;
    }

}
