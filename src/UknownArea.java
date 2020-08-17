public class UknownArea extends AreaDecorator {

    public void displayMap() {
        System.out.println("You have never been there");
    }

    public UknownArea(Area newArea) {
        super(newArea);
    }

}
