package coffee.after;

public class Main {
    public static void main(String[] args) {
        // 커피는 카페인 음료이다. (O)
        // CaffeinBeverage beverage = new Coffee();

        // 차는 카페인 음료이다. (O)
        // CaffeinBeverage beverage = new Tea();

        // 카페인 음료는 커피이다 (X)
        // Coffee coffee = new CaffeinBeverage();

        // 카페인 음료는 차다 (X)
        // Tea tea = new CaffeinBeverage();

        // 업캐스팅: 하위 클래스를 상위 클래스로 타입을 변환
        // CaffeinBeverage coffee = new Coffee();
        // CaffeinBeverage tea = new Tea();

        // 다운캐스트: 상위 클래스를 하위 클래스의 타입으로 변환
        // CaffeinBeverage beverage = new Coffee();
        // if (beverage instanceof Coffee) {
        // Coffee coffee = (Coffee) beverage;
        // }
    }
}
