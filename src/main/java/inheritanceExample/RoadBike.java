package inheritanceExample;

//First Type of Bicycle
public class RoadBike extends Bicycle {

	public int seatHeight;

    // the RoiadBike subclass has one constructor
    public RoadBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   
        
    // the RoadBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   

}
