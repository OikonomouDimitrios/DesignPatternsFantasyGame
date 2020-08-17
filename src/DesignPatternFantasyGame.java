public class DesignPatternFantasyGame {
    public static void main(String[] args) {

        Region worldMap = new Region("WorldMap");

        Region westArea = new Region("West Area");
        Region eastArea = new Region("East Area");

        Mist eastAreaOnMist = new Mist(new UknownArea(eastArea));

        Region cityOfWaterBane = new Region("City of Waterbane");
        cityOfWaterBane.addSubArea(new Place("TownHall"));
        cityOfWaterBane.addSubArea(new Place("Tavern"));

        Mist cityOfWaterBaneOnMist = new Mist(cityOfWaterBane);

        Region dungeonOfDespair = new Region("Dungeon Of Despair");
        dungeonOfDespair.addSubArea(new Place("Entrance Hall"));

        UknownArea dungeonOfDespairUnknown = new UknownArea(dungeonOfDespair);


        westArea.addSubArea(cityOfWaterBaneOnMist);
        westArea.addSubArea(dungeonOfDespairUnknown);

        eastArea.addSubArea(new Place("Pit of Wyrms"));

        worldMap.addSubArea(westArea);
        worldMap.addSubArea(eastAreaOnMist);
        worldMap.displayMap();
    }
}
