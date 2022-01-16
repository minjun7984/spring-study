package com.example.test.service;

import com.example.test.repository.MemberRepository;
import com.example.test.repository.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
         return new MemberService(memberRepository());
     }

     @Bean
    public MemberRepository memberRepository() {
         return new MemoryMemberRepository();
     }
}
