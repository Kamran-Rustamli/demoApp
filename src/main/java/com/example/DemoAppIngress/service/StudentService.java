package com.example.DemoAppIngress.service;

import com.example.DemoAppIngress.Dto.StudentDto;

public interface StudentService {
    StudentDto getStudentById(Long id);

    StudentDto createStudent(StudentDto dto);

    void deleeStudent(Long id);

    StudentDto updateStudent(StudentDto dto);
    

}
