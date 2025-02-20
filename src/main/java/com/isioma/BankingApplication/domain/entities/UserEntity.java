package com.isioma.BankingApplication.domain.entities;

import com.isioma.BankingApplication.domain.enums.Roles;
import com.isioma.BankingApplication.validations.ValidEmail;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users_tbl")
@Builder
public class UserEntity extends BaseClass implements UserDetails {

    private String firstName;

    private String lastName;

    private String middleName;

    private String phoneNumber;

    private String alternativePhoneNumber;

    @ValidEmail
    @Email(message = "Invalid email")
    private String email;

    private String password;

    private String stateOfOrigin;

    private String accountNumber;

    private BigDecimal accountBalance;

    private String address;

    private String profilePicture;

    private String gender;

    private String status;

    @Enumerated(EnumType.STRING)
    private Roles roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(roles.name()));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
