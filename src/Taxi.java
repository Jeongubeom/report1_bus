public class Taxi extends BusAndTaxi {
    //필드값 속성()

    int basicLength; // 기본거리
    int basicCost; //기본비용
    int lengthCost; //거리당 비용

    String dst; //목적지

    int dstl; // 목적지까지 거리

    int costSum;

    int taxiState;

    int taxiSum;

    public Taxi(int tNum) {
        this.number = tNum; //택시번호
        this.maxOn = 4; //최대승객
        basicCost = 3000; //기본요금 : 3000
        lengthCost = 1000; //거리당 요금 : 1000;
        basicLength = 1; // 기본거리 : 1
        this.oil = 100; //주유량 100;
        this.speed = 0; //속도
        this.runOrGarage = 0;// 운행 또는 차고지, 운행중(1), 차고지(2), 일반(0)
        costSum = 0; //비용합산
        dst = ""; // 목적지
        dstl = 0; //목적지 길이 // 1km당 1000원
        taxiState = 0;


    }

    public void taxiOn(int tOn){
        if(this.maxOn<tOn){
            System.out.println("최대 승객 수 초과 (알럿 기능 찾아야됨)");
        }else {
            this.taxiSum = this.maxOn - tOn; //최대 탑승객에서 지금 탑승한 사람 빼기

            System.out.println("탑승자 수 : " + tOn);
            System.out.println("잔여 승객 수 : " + this.taxiSum);
        }
    }
    public void taxiOn(int tOn, String destination, int destination_length){
        this.taxiSum = this.maxOn - tOn; //최대 탑승객에서 지금 탑승한 사람 빼기
        dst = destination; //목적지
        dstl = destination_length; // 목적지까지 거리

        this.costSum = 0;
        if(destination_length <= 1){
            this.costSum = basicCost+(lengthCost * (destination_length-1));
        }else if(destination_length>1){
            this.costSum = basicCost+(lengthCost * (destination_length-1));
        }

        System.out.println("탑승자 수 : " + tOn);
        System.out.println("잔여 승객 수 : " + this.taxiSum);
        System.out.println("기본 요금 확인 : " + basicCost);
        System.out.println("목적지 : " + dst);
        System.out.println("목적지까지 길이 : " + dstl+"km");
        System.out.println("지불할 요금 : " + this.costSum);
    }


    /*public void taxiOn(int tOn, String destination, int destination_length) { //탑승, 목적지, 목적지까지 거리
        int taxiSum = this.maxOn - tOn; //최대 탑승객에서 지금 탑승한 사람 빼기
        dst = destination; //목적지
        dstl = destination_length; // 목적지까지 거리

        this.costSum = 0;
        if(destination_length <= 1){
            this.costSum = basicCost+(lengthCost * (destination_length-1));
        }else if(destination_length>1){
            this.costSum = basicCost+(lengthCost * (destination_length-1));
        }

        if(state==1){
            String st = "운행중";
        }

        System.out.println("탑승자 수 : " + tOn);
        System.out.println("잔여 승객 수 : " + taxiSum);
        System.out.println("기본 요금 확인 : " + basicCost);
        System.out.println("목적지 : " + dst);
        System.out.println("목적지까지 길이 : " + dstl+"km");
        System.out.println("지불할 요금 : " + this.costSum);
        System.out.println("상태 : 보류");
    }
*/
    public void getoil(int oilUse) { //오일계산
        this.oil += oilUse;
        System.out.println("주유량 : " + oil);
    }

    public void pay(int submit){
        int result = submit-this.costSum;
        int add = this.costSum;
        System.out.println("이용하신 요금은 : "+this.costSum+"원 입니다");
        System.out.println(submit+"원 받았습니다");
        System.out.println("누적 요금은 "+add+"입니다");

    }



}
