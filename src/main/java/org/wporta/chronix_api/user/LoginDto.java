package org.wporta.chronix_api.user;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class LoginDto {
    @NotEmpty(message = "Username is mandatory")
    public String username;

    @NotEmpty(message = "Password is mandatory")
    public String password;
}
