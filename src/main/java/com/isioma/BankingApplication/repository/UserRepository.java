package com.isioma.BankingApplication.repository;

import com.isioma.BankingApplication.domain.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Boolean existsByEmail(String email);

    Boolean existsByAccountNumber(String accountNumber);

    UserEntity findByAccountNumber (String AccountNumber);

    Optional<UserEntity> findByEmail(String email);
}
