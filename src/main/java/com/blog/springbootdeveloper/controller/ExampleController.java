package com.blog.springbootdeveloper.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Controller //컨드롤러라는 것을 명시적으로 표시
public class ExampleController {

    @GetMapping("/thymeleaf/example")
    public String thymeleafExample(Model model){ // 뷰로 데이터를 넘겨주는 모델 객체
        Person examplePersion = new Person();
        examplePersion.setId(1L);
        examplePersion.setName("홍길동");
        examplePersion.setAge(11);
        examplePersion.setHobbies(List.of("운동", "독서"));

        model.addAttribute("person", examplePersion); //Person 객체 저장
        model.addAttribute("today", LocalDate.now());

        return "example"; //example.html라는 뷰 조회
    }

    @Setter
    @Getter
    class Person{
        private Long id;
        private String name;
        private int age;
        private List<String> hobbies;
    }
}
