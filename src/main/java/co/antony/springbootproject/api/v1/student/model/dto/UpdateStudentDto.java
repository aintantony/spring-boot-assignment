package co.antony.springbootproject.api.v1.student.model.dto;

public record UpdateStudentDto(
        String name,
        String email,
        String profile,
        String bio
) { }
