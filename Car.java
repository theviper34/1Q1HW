public class Car {
    public int speed;
    
    public void speedUp() {
    	speed = (speed + 1) % 11;

    }
    
    public void slowDown() {
    	speed = (speed - 1) % 11;

    }
    
    public void stop() {
        speed = 0;
        speed = (speed + 10) / 11 * speed;
    }
    
    public void show() {
        System.out.println("The car's speed is: "+ speed + " km/h");
    }
}