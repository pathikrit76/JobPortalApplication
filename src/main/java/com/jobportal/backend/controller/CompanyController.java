package com.jobportal.backend.controller;

import com.jobportal.backend.dto.CompanyDto;
import com.jobportal.backend.service.ICompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
@RequiredArgsConstructor
public class CompanyController {
    private final ICompanyService companyService;

//    public CompanyController(ICompanyService companyService) {
//        this.companyService = companyService;
//    }

    @GetMapping
    public ResponseEntity<List<CompanyDto>> getAllCompanies() {
        // In a real application, you would fetch this data from the database
        return ResponseEntity.ok(companyService.getAllCompanies());
    }
}
