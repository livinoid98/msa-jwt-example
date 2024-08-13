package com.example.auth.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {

    @NonNull
    private String username;

    @NonNull
    private String password;
}
