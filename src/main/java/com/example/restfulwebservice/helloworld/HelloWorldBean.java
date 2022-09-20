package com.example.restfulwebservice.helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok
@Data // Getter, Setter, ToString
@AllArgsConstructor // 모든 아규먼트를 가진 생성자 생성
@NoArgsConstructor // 아규먼트가 없는 디폴트 생성자 생성
public class HelloWorldBean {
    private String message;
}
