package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {
    //테스트 돌릴 때 메소드(vip_o, vip_x)가 아닌 클래스 단위로 run할 경우 하단에 있는 메소드 전체 다 실행시킴

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다.")  //Junit5부터 지원하는 기 / 한글가능
    void vip_o() {
        //given
        Member member = new Member(1L,"memberVIP", Grade.VIP);
        //when
        int discount = discountPolicy.discount(member,10000);
        //then
        assertThat(discount).isEqualTo(1000);
        // Assertions.assertThat(discount).isEqualTo(1000); -> static에 import시키면 간결해짐 / java 기본문법임 (단축키 option + enter)
    }

    @Test
    @DisplayName("VIP가 아니 할인이 적용되지 않아야한다.")
    void vip_x() {
        //given
        Member member = new Member(2L,"memberBASIC", Grade.BASIC);
        //when
        int discount = discountPolicy.discount(member,10000);
        //then
        assertThat(discount).isEqualTo(0);
    }
}