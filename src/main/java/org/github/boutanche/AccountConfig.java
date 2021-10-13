package org.github.boutanche;



//@Configuration
public class AccountConfig {

    //@Bean
    public AccountService accountService(){
        return new AccountService(accountRepository());
    }

    //@Bean
    public AccountRepository accountRepository(){
        return new AccountRepository();
    }
}
