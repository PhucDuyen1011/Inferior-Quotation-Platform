package com.phucduyen.database.service_implementors;

import com.phucduyen.database.enums.Role;
import com.phucduyen.database.models.entity_models.Account;
import com.phucduyen.database.models.response_models.AccountResponse;
import com.phucduyen.database.repositories.AccountRepo;
import com.phucduyen.database.services.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final AccountRepo accountRepo;
    @Override
    public List<AccountResponse> getAll() {
        List<Account> accountList = accountRepo.findAll();
        List<AccountResponse> accountResponseList = new ArrayList<>();
        accountList.forEach(account -> {
            if(!account.getRole().name().equals(Role.ADMIN.name())){
                accountResponseList.add(AccountResponse.builder()
                                .id(account.getId())
                                .email(account.getEmail())
                                .role(account.getRole().name())
                        .build());
            }
        });
        return accountResponseList;
    }
}
