package co.antony.springbootproject.api.v1.user.model.dto;

import lombok.Builder;

@Builder
public record CreateStudentDto(
        String name,
        String email,
        String password
) {
}
