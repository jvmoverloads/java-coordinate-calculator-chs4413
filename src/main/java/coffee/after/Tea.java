package coffee.after;

public class Tea extends CaffeinBeverage {

    @Override
    protected void brew() {
        System.out.println("티백을 담근다.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("레몬을 추가한다.");
    }

}
