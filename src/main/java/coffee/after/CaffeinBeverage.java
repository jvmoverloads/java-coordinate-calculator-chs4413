package coffee.after;

/**
 * 클래스를 abstract로 지정하면 new keyword를 통해 객체를 직접 생성할 수 없다.
 * 메소드에 abstract를 사용할 경우 interface의 메소드와 같이 구현 부분은 없다.
 * abstract로 선언한 메소드를 자식 클래스에서 반드시 구현해야 한다.
 */
public abstract class CaffeinBeverage {
    abstract void brew();

    abstract void addCondiments();

    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected void boilWater() {
        System.out.println("물을 끓인다.");
    }

    protected void pourInCup() {
        System.out.println("컵에 붓는다.");
    }
}
