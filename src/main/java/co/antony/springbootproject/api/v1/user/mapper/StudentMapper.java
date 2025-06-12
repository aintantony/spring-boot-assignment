package co.antony.springbootproject.api.v1.user.mapper;

import co.antony.springbootproject.api.v1.user.model.Student;
import co.antony.springbootproject.api.v1.user.model.dto.CreateStudentDto;
import co.antony.springbootproject.api.v1.user.model.dto.StudentResponseDto;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.UUID;

@Component
public class StudentMapper {
    public StudentResponseDto mapFromStudentToStudentResponseDto(Student student) {
        return StudentResponseDto.builder()
                .uuid(student.getUuid())
                .name(student.getName())
                .email(student.getEmail())
                .profile(student.getProfile())
                .bio(student.getBio())
                .isDeleted(student.getIsDeleted())
                .isVerified(student.getIsVerified())
                .build();
    }

    public Student mapFromCreatestudentTostudent(CreateStudentDto cr) {
        return new Student(new Random().nextInt(999999), UUID.randomUUID().toString(), cr.name(), cr.email(), cr.password(), "", "", false, true);
    }
}
