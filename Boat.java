public class Boat extends Vehicle{

    public Boat(String brand, int kilometers){
        super(brand, kilometers);
    }

    @Override
    public String dostuff(){
        return "et une correction pour Nico qui s'appelle " + getBrand() + " et qui fait split...";  
    }
}