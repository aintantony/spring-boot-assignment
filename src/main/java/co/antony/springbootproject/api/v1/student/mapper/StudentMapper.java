package co.antony.springbootproject.api.v1.student.mapper;

import co.antony.springbootproject.api.v1.student.model.Student;
import co.antony.springbootproject.api.v1.student.model.dto.CreateStudentDto;
import co.antony.springbootproject.api.v1.student.model.dto.StudentResponseDto;
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
                .gender(student.getGender())
                .score(student.getScore())
                .profile(student.getProfile())
                .bio(student.getBio())
                .isDeleted(student.getIsDeleted())
                .isVerified(student.getIsVerified())
                .build();
    }

    public Student mapFromCreatestudentTostudent(CreateStudentDto cr) {
        return new Student(new Random().nextInt(999999), UUID.randomUUID().toString(), cr.name(), cr.email(), cr.gender(), cr.score(), cr.password(), "", "", false, true);
    }
}
