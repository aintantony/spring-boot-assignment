package co.antony.springbootproject.api.v1.student.model.dto;

import lombok.Builder;

@Builder
public record CreateStudentDto(
        String name,
        String email,
        String password
) {
}
