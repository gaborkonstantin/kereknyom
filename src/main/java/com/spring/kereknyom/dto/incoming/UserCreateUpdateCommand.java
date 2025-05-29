package com.spring.kereknyom.dto.incoming;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateUpdateCommand {

    private String username;

    private String email;

    private String password;

    private String confirmPassword;

    private Long blogId;


}
