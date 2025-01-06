package TenthClass;

public class vehicle {
    private int numberOfDoor;
    private String engineBrand;
    private int seatNumber;


    public vehicle() {
    }

    public vehicle(int numberOfDoor, String engineBrand, int seatNumber) {
        this.numberOfDoor = numberOfDoor;
        this.engineBrand = engineBrand;
        this.seatNumber = seatNumber;
    }


    public vehicle(int numberOfDoor, String engineBrand) {
        this.numberOfDoor = numberOfDoor;
        this.engineBrand = engineBrand;
    }


    public int getNumberOfDoor() {
        return numberOfDoor;
    }


    public void setNumberOfDoor(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }


    public String getEngineBrand() {
        return engineBrand;
    }


    public void setEngineBrand(String engineBrand) {
        this.engineBrand = engineBrand;
    }


    public int getSeatNumber() {
        return seatNumber;
    }


    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}