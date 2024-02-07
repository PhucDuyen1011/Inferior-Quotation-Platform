package com.phucduyen.database.services;


import com.phucduyen.database.models.response_models.AccountResponse;

import java.util.List;

public interface AdminService {
    List<AccountResponse> getAll();
}
