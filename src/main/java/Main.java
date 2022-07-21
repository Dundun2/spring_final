import java.util.*;
public class Main {
    public static void main(String[] args){
        Vehicles taxi1 = new Taxi(9082,100,4,5,50,"일반","강남",100,7,3000);
        Vehicles bus1 = new Bus(50,40,40,30,"종료",1000,9082,30);
        taxi1.passenger_check(taxi1.max_capacity, taxi1.current_passenger);
        taxi1.speed_up_down(taxi1.oil,taxi1.speed);
        taxi1.total_income(taxi1.current_passenger, taxi1.price);
        //왜 오버'로딩'이 작동안하는걸까요? //오버로딩하고 싶었는데 안되서 오버라이딩 적용했습니다.
        System.out.println("운행이 일반에서 차고지행이되었습니ㄷ");
        ((Taxi) taxi1).speedAdjust(taxi1.speed);
    }

}
