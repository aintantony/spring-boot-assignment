package co.antony.springbootproject.api.v1.student.service;

import co.antony.springbootproject.api.v1.student.mapper.StudentMapper;
import co.antony.springbootproject.api.v1.student.model.Student;
import co.antony.springbootproject.api.v1.student.model.dto.CreateStudentDto;
import co.antony.springbootproject.api.v1.student.model.dto.UpdateStudentDto;
import co.antony.springbootproject.api.v1.student.model.dto.StudentResponseDto;
import co.antony.springbootproject.api.v1.student.repository.InMemoryDatabase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final InMemoryDatabase inMemoryDatabase;
    private final StudentMapper studentMapper;

    @Override
    public List<StudentResponseDto> getAllStudents() {
        List<StudentResponseDto> studentResponseDto = new ArrayList<>();
        inMemoryDatabase.students.forEach(e -> {
            studentResponseDto.add(studentMapper.mapFromStudentToStudentResponseDto(e));
        });
        return studentResponseDto;
    }

    @Override
    public StudentResponseDto createNewStudent(CreateStudentDto createStudentDto) {
        Student newStudent = studentMapper.mapFromCreatestudentTostudent(createStudentDto);
        inMemoryDatabase.students.add(newStudent);
        return studentMapper.mapFromStudentToStudentResponseDto(newStudent);
    }

    @Override
    public StudentResponseDto updateStudentByUuid(String uuid, UpdateStudentDto updateStudentDto) {
        Student student = inMemoryDatabase.students.stream()
                .filter(e -> e.getUuid().equals(uuid))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Student not found"));

        if (updateStudentDto.name() != null && !updateStudentDto.name().isEmpty()) {
            student.setName(updateStudentDto.name());
        }
        if (updateStudentDto.email() != null && !updateStudentDto.email().isEmpty()) {
            student.setEmail(updateStudentDto.email());
        }
        if (updateStudentDto.profile() != null && !updateStudentDto.profile().isEmpty()) {
            student.setProfile(updateStudentDto.profile());
        }
        if (updateStudentDto.bio() != null && !updateStudentDto.bio().isEmpty()) {
            student.setBio(updateStudentDto.bio());
        }

        return studentMapper.mapFromStudentToStudentResponseDto(student);
    }

    @Override
    public Integer deleteStudentByUuid(String uuid) {
        Student student = inMemoryDatabase.students.stream()
                .filter(e -> e.getUuid().equals(uuid))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Student not found"));
        if (student != null) {
            inMemoryDatabase.students.remove(student);
            return 1;
        }
        return 0;
    }
}