package co.antony.springbootproject.api.v1.user.model.dto;

public record UpdateStudentDto(
        String name,
        String email,
        String profile,
        String bio
) { }
