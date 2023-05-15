package coffee.after;

public class Coffee extends CaffeinBeverage {

    @Override
    protected void brew() {
        System.out.println("필터를 활용해 커피를 내린다.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("설탕과 우유를 추가한다.");
    }

}
