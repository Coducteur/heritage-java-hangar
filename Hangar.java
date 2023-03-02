public class Hangar {
    public static void main(String[] args){
        Car grid = new Car("the griiid car",10);
        Boat banana = new Boat("the banana-boat", 1000);

        System.out.println(grid.dostuff());
        System.out.println(banana.dostuff());

    }
}