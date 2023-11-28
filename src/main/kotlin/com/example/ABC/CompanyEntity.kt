package com.example.ABC

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("company")
data class Company(
    @Id
    val id: String?,
    val name: String
)


