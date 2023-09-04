package com.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //created_at, upated_at 자동 업데이트
@SpringBootApplication // 스프링부트 사용에 필요한 기본 설정해주는 어노테이션
public class SpringBootDeveloperApplication {
    public static void main(String[] args) {
        //어플리케이션 실행(메인클래스로 사용할 클래스, 커맨드 라인의 인수들)
        SpringApplication.run(SpringBootDeveloperApplication.class, args);
    }
}

