package co.antony.springbootproject.api.v1.student.service;

import co.antony.springbootproject.api.v1.student.model.dto.CreateStudentDto;
import co.antony.springbootproject.api.v1.student.model.dto.UpdateStudentDto;
import co.antony.springbootproject.api.v1.student.model.dto.StudentResponseDto;

import java.util.List;

public interface StudentService {
    List<StudentResponseDto> getAllStudents();
    StudentResponseDto createNewStudent(CreateStudentDto createStudentDto);
    StudentResponseDto updateStudentByUuid(String uuid, UpdateStudentDto updateStudentDto);
    Integer deleteStudentByUuid(String uuid);
}