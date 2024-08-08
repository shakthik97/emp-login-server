package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private Long id;
    private String userName;
    private String email;
    private String password;
    private String role;
}
