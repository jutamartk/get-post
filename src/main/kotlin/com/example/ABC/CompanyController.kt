package com.example.ABC

import jakarta.websocket.server.PathParam
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController

class CompanyController(
    val companyService : CompanyService
) {

    @GetMapping("/company")
    fun getCompanyList(): List<Company> {
        return companyService.getAllCompany()
    }

    @GetMapping("/company/{id}")
    fun getCompanyById(@PathVariable id: String) =
        companyService.getCompanyById(id)


    @PostMapping("/company/{name}")
    fun creatCompany(@PathVariable name: String): Company {
        return companyService.creatCompany(name)
    }

    @PostMapping("/company")
    fun creatCompany2(@RequestBody name: String): Company {
        return  companyService.creatCompany(name)

    }

    @DeleteMapping("/company/{id}")
    fun deleteCompany(@PathVariable id: String): String {
       return companyService.deleteCompanyById(id)
    }

    @PutMapping("/company")
    fun updateCompany(@RequestBody input: Company): Company {
        return companyService.updateCompany(input)
    }

}