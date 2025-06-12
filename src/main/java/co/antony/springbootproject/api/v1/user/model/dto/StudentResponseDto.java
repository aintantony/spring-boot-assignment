package co.antony.springbootproject.api.v1.user.model.dto;

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
