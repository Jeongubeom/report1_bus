public class Bus {
    //필드 값
    //고유 테이터
    int busNum; //버스번호
    int cost; //버스요금
    int maxPassenger; //최대승객수

    //상태 데이터
    int presentPassenger; //현재승객수
    int oil; //주유량
    int presentSpeed; //현재 속도
    boolean runOrGarage; // 운행, 차고지 false=운행(0), true=차고지(1)
    //생성자 초기화 생략


    public Bus(int bNum) {
        //busNUM 생성할때
        this.busNum=bNum;
        maxPassenger = 30; //최대승객 30;
        cost = 1000; //버스요금 2000;
        oil = 100; //주유량 초기값0
        runOrGarage = false; //운행 또는 차고지, false=운행(0), true=차고지(1)
    }

    int getPresentPassenger(int presentPassenger) { //현재 승객 n명 타면 남은 승객 반환
        int peple = maxPassenger - presentPassenger;
        int onCost = presentPassenger * 1000;
        System.out.println("현재 탑승승객 수 : "+presentPassenger);
        System.out.println("잔여 승객 수 : "+peple);
        System.out.println("요금 확인 : "+onCost);
        return peple;
    }

    int getOilUse(int useOil){ //기름 사용 량
         oil -= useOil;
        System.out.println("주유량 : "+oil);
         if(oil < 10){
             System.out.println("차고지로 향합니다");
             System.out.println("주유가 필요합니다");
         }
         return oil;
    }

    int getOilIn(int inOil){ //기름 주입량
        oil += inOil;
        System.out.println("주유량 : "+oil);
        return inOil;
    }

    boolean isRunOrGarage(boolean state){ //차량 운행중(0) 또는 차고지행(1)
        if(state == true || oil <10){
            System.out.println("차고지행");
        }else{
            System.out.println("운행중");
        }
        return state;
    }
    int overPassenger(int presentPassenger){ //최대 승객 수
        if(maxPassenger<presentPassenger){
            System.out.println("최대 승객수 초과");
        }
        return presentPassenger;
    }





}
