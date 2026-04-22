package com.jobportal.backend.service;

import com.jobportal.backend.entity.Company;
import com.jobportal.backend.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements ICompanyService{
    private final CompanyRepository companyRepository;
//    public CompanyServiceImpl(CompanyRepository companyRepository) {
//        this.companyRepository = companyRepository;
//    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }
}
