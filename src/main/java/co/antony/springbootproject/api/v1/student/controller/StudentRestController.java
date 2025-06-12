package co.antony.springbootproject.api.v1.student.controller;

import co.antony.springbootproject.api.v1.student.model.dto.CreateStudentDto;
import co.antony.springbootproject.api.v1.student.model.dto.UpdateStudentDto;
import co.antony.springbootproject.api.v1.student.model.dto.StudentResponseDto;
import co.antony.springbootproject.api.v1.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/students")
@RestController
@RequiredArgsConstructor
public class StudentRestController {
    private final StudentService studentService;

    @GetMapping("")
    public List<StudentResponseDto> getAllUsers() {
        return studentService.getAllStudents();
    }

    @PostMapping("")
    public StudentResponseDto createNewUser(@RequestBody CreateStudentDto createStudentDto) {
        return studentService.createNewStudent(createStudentDto);
    }

    @PutMapping("/{uuid}")
    public StudentResponseDto updateUser(@PathVariable String uuid, @RequestBody UpdateStudentDto updateStudentDto) {
        return studentService.updateStudentByUuid(uuid, updateStudentDto);
    }

    @DeleteMapping("/{uuid}")
    public Integer deleteUser(@PathVariable String uuid) {
        return studentService.deleteStudentByUuid(uuid);
    }
}