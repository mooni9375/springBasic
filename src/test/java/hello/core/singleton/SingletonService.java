package hello.core.singleton;

public class SingletonService {

    // 자기 자신만 생성 가능
    private static final SingletonService instance = new SingletonService();

    // 외부에서 유일하게 싱글턴 객체에 접근 가능
    public static SingletonService getInstance() {
        return instance;
    }

    // 외부에서 생성하지 못 하도록 생성자의 접근제어자를 private 설정
    private SingletonService() {
    }



    // 테스트를 위한 임시 필드 & public 생성자 설정
    private String data;

    public SingletonService(String data) {
        this.data = data;
    }




    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
