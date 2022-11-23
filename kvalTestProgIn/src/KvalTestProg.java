import garage.*;

public class KvalTestProg {
    public static void main(String[] args) {
        AhlgrensCars ahlgrensCars = new AhlgrensCars();
        Aircraft aircraft = new Aircraft();
        Boat boat = new Boat();
        Buss buss = new Buss();
        Motorcycle motorcycle = new Motorcycle();

        Vehicle[] color = new Vehicle[]{aircraft, boat, buss, motorcycle, ahlgrensCars};
        Vehicle[] regNo = new Vehicle[]{aircraft, boat, buss, motorcycle, ahlgrensCars};
        Vehicle[] yearOfManufacturing = new Vehicle[]{aircraft, boat, buss, motorcycle, ahlgrensCars};
        Vehicle[] parkVehicle = new Vehicle[]{aircraft, boat, buss, motorcycle, ahlgrensCars};

        /* Registreringsnummer (regNo)
           Färg (color)
           Tillverkningsår (yearOfManufacturing)
         */


    }
}
