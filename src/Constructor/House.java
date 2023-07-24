package Constructor;

public class House {

    String address;
    int numberOfFloor;

    public House(String address, int numberOfFloor){
        this.address = address;
        this.numberOfFloor = numberOfFloor;
        System.out.println("a House object is created");
    }
}
