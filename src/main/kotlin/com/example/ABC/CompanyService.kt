package com.example.ABC

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class CompanyService(
    var companyRepository: CompanyRepository
) {
    fun getAllCompany(): List<Company> {
        return companyRepository.findAll();
    }

    fun getCompanyById(id: String) =
        companyRepository.findByIdOrNull(id) ?: "$id not found"

    fun creatCompany(name: String): Company {
        return companyRepository.save(Company(null, name))
    }

    fun deleteCompanyById(id: String): String {
        if (companyRepository.existsById(id)) {
            companyRepository.deleteById(id)
            return "$id has been deleted"
        } else {
            return "Fuck"
        }
    }

    fun updateCompany(company: Company): Company {
        return companyRepository.save(company)
    }
}

