package com.eazybytes.Jobporal.service.impl;

import com.eazybytes.Jobporal.entity.Company;
import com.eazybytes.Jobporal.repository.CompanyRepository;
import com.eazybytes.Jobporal.service.ICompanyService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ICompanyServiceImpl implements ICompanyService {

    private final CompanyRepository companyRepository;

    public ICompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }
}
