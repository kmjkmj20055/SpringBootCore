package hello.core.singleton;

public class SingletonService {

    // static으로 선언하면 class레벨에 존재하기때문에 딱 하나만 생성됨
    // 이 상태로 다른 파일에서 new SingletonService() 만들면 컴파일 오류남
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 호출");
    }

}
