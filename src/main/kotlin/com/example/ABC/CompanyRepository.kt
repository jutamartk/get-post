package com.example.ABC

import org.springframework.data.mongodb.repository.MongoRepository

interface CompanyRepository : MongoRepository <Company,String>