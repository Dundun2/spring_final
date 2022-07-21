import java.util.*;
public class Vehicles {
    public int num;
    public int oil;
    public int max_capacity;
    public int current_passenger;
    public int speed;
    public String status;
    public int price;

    public Vehicles(int num, int oil, int max_capacity, int current_passenger, int speed, String status
    ,int price) {
        this.num = num;
        this.oil = oil;
        this.max_capacity = max_capacity;
        this.current_passenger = current_passenger;
        this.speed = speed;
        this.status = status;
        this.price = price;
    }


    public void passenger_check(int max_capacity, int current_passenger) {
        if (max_capacity <= current_passenger) {
            System.out.println("탑승불가");
        } else {
            System.out.println("탑승가능");
        }
    }


    public void speed_up_down(int oil, int speed) {
        if (oil >= 50) {
            speed += 10;
            System.out.println("부스트온" + "speed =" + speed);
        } else {
            speed -= 10;
            System.out.println("부스트다운" + "speed=" + speed);
        }

    }

    public void total_income(int current_passenger ,int price){
        System.out.println("총수입="+ current_passenger * price );
    }
}
//- 요소
//    - 번호
//    - 주유량
//    - 속도
//    - 속도 변경
//    - 최대 승객 수
//    - **있을 경우** {기타 공통 요소들}

// - 운행 시작
//- 속도 변경
//- 상태 변경
//- 승객 탑승
//- **있을 경우** {기타 공통 기능들}