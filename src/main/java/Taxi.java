import java.util.*;
public class Taxi extends Vehicles {

    String goal;
    int distance;
    int price_per_distance;

    public Taxi(int num, int oil, int max_capacity, int current_passenger, int speed, String status, String goal,
                int distance, int price_per_distance, int price) {
        super(num, oil, max_capacity, current_passenger, speed, status, price);
        this.goal = goal;
        this.distance = distance;
        this.price_per_distance = price_per_distance;
        this.price=price;

    }

    public void total_income(int current_passenger ,int price){
        System.out.println("총 수입금액은="+ price + distance * price_per_distance);
    }

    public void paid(int current_passenger, String status){
        if(status.equals("운행중") && current_passenger>=0){
            status = "운행중";
            current_passenger = 0 ;
        }else{
            System.out.println("결제 대상이 없습니다.");
        }
    }

    public void speedAdjust(int speed){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        speed += a;
        System.out.println("현재의 속도는"+speed+"입니다");
    }

}



