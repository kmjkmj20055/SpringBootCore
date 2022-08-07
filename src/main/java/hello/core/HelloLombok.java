package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();

        helloLombok.setName("hehehehe");

//        String name = helloLombok.getName();
//        System.out.println("name = "+ name);
//      위 내용이 lombok의 ToString을 사용하여 대체 가능
        System.out.println(helloLombok);
    }
}
