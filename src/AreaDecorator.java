public abstract class AreaDecorator implements Mappable {
    protected Mappable tempArea;

    public AreaDecorator(Mappable newArea) {
        tempArea = newArea;
    }

    @Override
    public void displayMap() {
        tempArea.displayMap();
    }

}
