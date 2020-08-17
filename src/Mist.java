public class Mist extends AreaDecorator {

    @Override
    public void displayMap() {
        System.out.println("The following area is covered by heavy mist today");
        tempArea.displayMap();
    }

    public Mist(Mappable newArea) {
        super(newArea);
    }
}
