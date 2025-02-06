package ysj.hellospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ysj.hellospring.repository.MemberRepository;
import ysj.hellospring.repository.MemoryMemberRepository;
import ysj.hellospring.service.MemberService;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
