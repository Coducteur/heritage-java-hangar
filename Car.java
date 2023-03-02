public class Car extends Vehicle {

    public Car(String brand, int kilometers){
        super(brand, kilometers);
    }

    @Override
    public String dostuff(){
        return "encore une correction pour la team correctors. " + getBrand() + " est tip top !";  
    }
}