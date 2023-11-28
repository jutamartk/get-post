package com.example.ABC

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController

class CompanyController(
    val company:CompanyRepository
) {

    @GetMapping("/company-list")
    fun findAll(): Company{
       return Company(
           null,
           "nune"
       )
    }
    @PostMapping("/creat-company")
    fun creatCompany(): Unit{
        company.save(Company(
            "String?",
            "String")
        )
    }
}