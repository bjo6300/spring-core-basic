package hello.core.member;

import hello.core.Member.Grade;
import hello.core.Member.Member;
import hello.core.Member.MemberService;
import hello.core.Member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        //given 주어졌을때
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when 이렇게 하면
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then 결과가 나온다
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}