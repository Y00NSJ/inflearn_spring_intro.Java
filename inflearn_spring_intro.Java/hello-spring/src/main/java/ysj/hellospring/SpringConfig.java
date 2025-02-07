package ysj.hellospring;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ysj.hellospring.repository.*;
import ysj.hellospring.service.MemberService;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }


}
