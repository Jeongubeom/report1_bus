public class Main {
    public static void main(String[] args) {
       /* Bus bus = new Bus(2);
        bus.getPresentPassenger(5);
        bus.getOilUse(50);
        bus.getrunOrGarage(2);//운행중(1), 차고지(2), 일반(0)
        bus.getOilIn(10);
        bus.getrunOrGarage(1);//운행중(1), 차고지(2), 일반(0)
        bus.overPassenger(45);
        bus.getPresentPassenger(5);
        bus.getOilUse(55);*/

        Taxi taxi = new Taxi(2);
        taxi.taxiOn(2,"서울역",2);
        taxi.getoil(-80);
        taxi.pay(4000);
        taxi.taxiOn(5);
        taxi.taxiOn(3,"구로디지털단지역", 12);
        taxi.getoil(-20);
        taxi.pay(14000);
    }
}