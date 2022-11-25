public class BusAndTaxi {
    int number; //차량넘버
    int oil; //주유량
    int speed; //속도
    int speedTrans; //속도변경
    int maxOn; //최대승객

    int runOrGarage; // 운행 또는 차고지, 운행중(1), 차고지(2), 일반(0)

    public BusAndTaxi(){
        oil = 100;
        speed = 0;
    }
}
