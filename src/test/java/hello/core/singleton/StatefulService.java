package hello.core.singleton;

public class StatefulService {

    // 상태를 유지하는 필드가 존재
    private int price;

    public void order(String name, int price) {
        System.out.println("name = " + name + ", price = " + price);
        this.price = price; // 여기가 문제 발생 지점
    }

    public int getPrice() {
        return price;
    }
}
