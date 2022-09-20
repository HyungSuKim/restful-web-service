package com.example.restfulwebservice.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//HTTP Status code
//2XX -> OK
//4XX -> Client 클라이언트로 인한 오류, 리소스 존재하지 않을 시 Not Found 404
//5XX -> Server 서버측 오류
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
