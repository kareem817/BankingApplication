package com.BankingAPPSpringBoot.BankingApplication.service;

import com.BankingAPPSpringBoot.BankingApplication.dto.AccountDto;

import java.math.BigDecimal;
import java.util.List;


public interface AccountService {

    AccountDto createAccount (AccountDto account);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);
}
