public class parkingtest {
    public static void main(String[] args) {

        parkinglot parkinglot = new parkinglot();
        System.out.println(parkinglot.toString());

        car infinitiACar = new car("Infiniti A", "Infiniti", true);
        parkinglot.spot[0].parkedcar = infinitiACar;
        System.out.println(parkinglot.toString());

        car cadillacBCar = new car("Cadillac B", "Cadillac", false);
        parkinglot.spot[1].parkedcar = cadillacBCar;
        System.out.println(parkinglot.toString());

        parkinglot.spot[0].parkedcar = null;
        System.out.println(parkinglot.toString());
    }
}
