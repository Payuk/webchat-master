package ua.training.dto;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



public class UserDTO {
    private Long id;
    @NotNull(message = "Field name cannot be null")
    @Pattern(regexp = "[\\w]+", message = "Field name cannot satisfy the pattern")
    String name;
    @NotNull(message = "Field name cannot be null")
    @Email(message = "login isn't e-mail")
    String login;
    @NotNull(message = "Field password cannot be null")
    @Size(min = 2, max = 12, message = "size should be from 2 to 12")
    String password;

    private boolean isBanned;

    public boolean isBanned() {
        return isBanned;
    }

    public void setBanned(boolean banned) {
        isBanned = banned;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
