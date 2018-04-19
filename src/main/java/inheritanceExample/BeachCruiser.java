package inheritanceExample;

//Third type of Bicycle.

public class BeachCruiser extends Bicycle {

	public int seatHeight;

    // the BeachCruiser subclass has one constructor
    public BeachCruiser(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   
        
    // the BeachCruiser subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   
}
