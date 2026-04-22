package com.jobportal.backend.service;

import com.jobportal.backend.dto.CompanyDto;
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
    public List<CompanyDto> getAllCompanies() {
        List<Company> companyList =  companyRepository.findAll();
        return companyList.stream().map(this::mapToDto).toList();
    }
    private  CompanyDto mapToDto(Company company) {
        return new CompanyDto(
            company.getId(),
            company.getName(),
            company.getLogo(),
            company.getIndustry(),
            company.getSize(),
            company.getRating(),
            company.getLocations(),
            company.getFounded(),
            company.getDescription(),
            company.getEmployees(),
            company.getWebsite(),
            company.getCreated_at()
        );
    }
}
