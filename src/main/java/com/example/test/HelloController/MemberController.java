package com.example.test.HelloController;

import com.example.test.MemberService.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller //스프링 컨테이너가 관리 객체가 생성되어 보관 new없이 생성가능
public class MemberController {

    private final MemberService memberService;

    @Autowired //스프링 컨테이너의 객체와 연결
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }
}
