package me.cherrue.springbootmongo.account;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AccountRepository extends MongoRepository<Account, String> {
    public Optional<Account> findByEmail(String email);
}
