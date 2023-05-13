package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String firstName;
    private String secondName;
    private String login;
    private String email;
    private String password;
    private Address address;
    private List<Role> roles;


}
