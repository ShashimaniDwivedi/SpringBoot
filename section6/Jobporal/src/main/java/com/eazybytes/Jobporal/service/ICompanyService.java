package com.eazybytes.Jobporal.service;

import com.eazybytes.Jobporal.dto.CompanyDto;
import com.eazybytes.Jobporal.entity.Company;

import java.util.List;

public interface ICompanyService {
    List<CompanyDto> getAllCompanies();
}
