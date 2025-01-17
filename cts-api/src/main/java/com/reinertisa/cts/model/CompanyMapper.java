package com.reinertisa.cts.model;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CompanyMapper implements Function<Company, CompanyDto> {

    @Override
    public CompanyDto apply(Company company) {
        return CompanyDto.builder()
                .name(company.getName())
                .companyId(company.getCompanyId())
                .address(company.getAddress())
                .numOfEmployees(company.getNumOfEmployees())
                .industry(company.getIndustry())
                .type(company.getType())
                .build();
    }
}
