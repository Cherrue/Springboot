package me.cherrue.springbootsecurity2;

import me.cherrue.springbootsecurity2.account.Account;
import me.cherrue.springbootsecurity2.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {
    @Autowired
    AccountService accountService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account cherrue = accountService.createAccount("cherrue", "pass");
        System.out.println(cherrue.getUsername() + " password : " + cherrue.getPassword());
    }
}
