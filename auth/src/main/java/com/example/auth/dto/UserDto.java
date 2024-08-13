package com.example.auth.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    @NonNull
    private String username;

    @NonNull
    private String password;

    @NonNull
    private String nickname;
}
