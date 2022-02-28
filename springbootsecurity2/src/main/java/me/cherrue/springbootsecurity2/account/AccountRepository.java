package me.cherrue.springbootsecurity2.account;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    public Optional<Account> findByUsername(String username);
}
