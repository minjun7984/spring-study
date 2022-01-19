package com.example.test.service;

import com.example.test.repository.JpaMemberRepository;
import com.example.test.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private EntityManager em;
    private DataSource dataSource;

    @Autowired
    public SpringConfig(EntityManager em){
        this.em = em;
    }

    @Bean
    public MemberService memberService(){
         return new MemberService(memberRepository());
     }

     @Bean
    public MemberRepository memberRepository() {
//         return new MemoryMemberRepository();
//         return new JdbcTemplateMemberRepository(dataSource);
         return new JpaMemberRepository(em);
     }
}
