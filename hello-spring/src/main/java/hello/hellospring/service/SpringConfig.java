package hello.hellospring.service;

import hello.hellospring.aop.TimeTraceApp;
import hello.hellospring.repository.JdbcMemberRepository;
import hello.hellospring.repository.JpaMemberRepository;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

/**
 * 자바코드로 직접 스프링빈 등록
 */
@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

  //  @Bean
   // public MemberRepository memberRepository(){
       // return new MemoryMemberRepository();
        //return new JdbcMemberRepository(dataSource);

        //return new JdbcMemberRepository(dataSource);
      // return new JpaMemberRepository(em);
 //   }

  //  @Bean
  //  public TimeTraceApp timeTraceApp(){
   //     return new TimeTraceApp();
  //  }


}
