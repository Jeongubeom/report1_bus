public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(2);
        bus.getPresentPassenger(5);
        bus.getOilUse(50);
        bus.isRunOrGarage(true);
        bus.getOilIn(10);
        bus.isRunOrGarage(false);
        bus.overPassenger(45);
        bus.getPresentPassenger(5);
        bus.getOilUse(55);
    }
}