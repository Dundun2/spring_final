import java.util.*;
public class Bus extends Vehicles {

    int distance;

    public Bus(int oil, int max_capacity, int current_passenger, int speed, String status,
               int price, int num, int distance) {
        super(num, oil, max_capacity, current_passenger, speed, status, price);
        this.num = num;
        this.distance = distance;

    }

    public void prepare(int oil, String status) {
        if (oil < 20 || status.equals("종료")) {
            status = "차고지행";
            System.out.println("운행이 일반에서 차고지행이되었습니다");
            if (oil < 10) {
                System.out.println("주유가 필요합니다.");
            }
        }else{
            System.out.println("운행이 계속됩니다");
        }

    }

    public void passenger_add(int current_passenger,int max_capacity,String status){
        if(status.equals("운행중") && max_capacity > current_passenger ){
            current_passenger += 1;
            System.out.println("승객이 추가되었습니다");
        }else{
            System.out.println("다음 버스를 이용해주십시오.");
        }
    }

}
