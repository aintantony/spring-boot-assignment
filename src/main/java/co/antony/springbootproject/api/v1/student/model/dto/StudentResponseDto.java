package co.antony.springbootproject.api.v1.student.model.dto;

import lombok.Builder;

@Builder
public record StudentResponseDto(
        String uuid,
        String name,
        String email,
        String profile,
        String bio,
        Boolean isDeleted,
        Boolean isVerified
) {
}
