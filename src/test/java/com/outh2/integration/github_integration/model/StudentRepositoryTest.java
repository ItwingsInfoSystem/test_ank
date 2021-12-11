package com.outh2.integration.github_integration.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;


    void student_existsByEmail_test() {

        String email = "ankitsharmatest@gmail.com";

        Student student =Student.builder()
                .age(10)
                .email(email)
                .motherName("reeta")
                .build();

        studentRepository.save(student);

       Boolean expected =  studentRepository.existsByEmail(email);

       Assertions.assertThat(expected).isTrue();

    }
}