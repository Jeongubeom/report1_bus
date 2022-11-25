public class Bus extends BusAndTaxi{
    //필드 값
    //고유 테이터
    int cost; //버스요금
    //상태 데이터
    int presentPassenger; //현재승객수

    //생성자 초기화
    public Bus(int bNum) {
        //busNUM 생성할때
        this.number=bNum;
        this.speed = 0;
        this.maxOn = 30; //최대승객 30;
        cost = 1000; //버스요금 2000;
        this.oil = 100; //주유량 초기값0
        this.runOrGarage = 0; //운행 또는 차고지, 운행중(1), 차고지(2), 일반(0)
    }

    int getPresentPassenger(int presentPassenger) { //현재 승객 n명 타면 남은 승객 반환
        int peple = this.maxOn - presentPassenger;
        int onCost = presentPassenger * 1000; //1당 요금 1000씩 부과
        System.out.println("현재 탑승승객 수 : "+presentPassenger);
        System.out.println("잔여 승객 수 : "+peple);
        System.out.println("요금 확인 : "+onCost);
        return peple;
    }

    int getOilUse(int useOil){ //기름 사용 량
         this.oil -= useOil;
        System.out.println("주유량 : "+this.oil);
         if(this.oil < 10){ //10미만일시 얼랏
             System.out.println("차고지로 향합니다");
             System.out.println("주유가 필요합니다");
         }
         return this.oil;
    }

    int getOilIn(int inOil){ //기름 주입량
        oil += inOil;
        System.out.println("주유량 : "+this.oil);
        return inOil;
    }

    int getrunOrGarage(int state){ //운행중(1), 차고지(2), 일반(0)
        if(state == 0 || this.oil <10){
            System.out.println("일반");
        }else if(state == 1){
            System.out.println("운행중");
        } else if (state ==2) {
            System.out.println("차고지");
        }
        return state;
    }
    int overPassenger(int presentPassenger){ //최대 승객 수
        if(this.maxOn<presentPassenger){
            System.out.println("최대 승객수 초과");
        }
        return presentPassenger;
    }

    int upSpeed(int upSpeed){ //속도 증가
        this.speed += upSpeed;
        return this.speed;
    }
    int downSpeed(int downSpeed){ //속도 감소
        this.speed -=downSpeed;
        return this.speed;
    }
    



}
