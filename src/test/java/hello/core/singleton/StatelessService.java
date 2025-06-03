package hello.core.singleton;

public class StatelessService {

    public int order(String name, int price) {
        System.out.println("name = " + name + ", price = " + price);
//        this.price = price; // 여기가 문제 발생 지점

        return price;
    }

}
