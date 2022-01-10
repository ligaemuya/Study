package hello.core.autowiredtest;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class AutoWiredTest {

    //@Autowired 복습
    @Test
    void testMemberClass() {
        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
       // memberRepository.save();
    }




    public interface MemberTest {
        void setMember(Member member);

        String findMemberName(Long memberId);
    }

    public interface testMemberService{
        Member findMember(Long memberId);
    }

    @Component
    public class manageMentMember implements testMemberService {

        private final MemberRepository memberRepository;

        @Autowired
        public manageMentMember(MemberRepository memberRepository) {
            this.memberRepository = memberRepository;
        }

        @Override
        public Member findMember(Long memberId) {
            Member member = memberRepository.findById(memberId);

            return member;
        }
    }

}
