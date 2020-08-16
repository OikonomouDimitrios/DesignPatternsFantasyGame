public class DesignPatternFantasyGame {
    public static void main(String[] args) {

        Region worldMap = new Region("WorldMap");

        Region westArea = new Region("West Area");
        Region eastArea = new Region("East Area");

        Region cityOfWaterBane = new Region("City of Waterbane");
        Region dungeonOfDespair = new Region("Dungeon Of Despair");
        worldMap.addSubArea(westArea);
        worldMap.addSubArea(eastArea);

        westArea.addSubArea(cityOfWaterBane);
        cityOfWaterBane.addSubArea(new Place("TownHall"));
        cityOfWaterBane.addSubArea(new Place("Tavern"));
        westArea.addSubArea(dungeonOfDespair);
        dungeonOfDespair.addSubArea(new Place("Entrance Hall"));

        eastArea.addSubArea(new Place("Pit of Wyrms"));
        worldMap.displayMap();
    }
}
