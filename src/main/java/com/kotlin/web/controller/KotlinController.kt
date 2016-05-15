package com.kotlin.web.controller

import com.kotlin.web.beans.Person
import com.kotlin.web.service.KotlinService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by 徐文辉 on 2016/4/25.
 */
@RestController
class KotlinController {
    @Autowired
    private var kotlinService: KotlinService? = null

    @Autowired
    private var person: Person? = null

    @RequestMapping("/kotlin")
    fun home() = mapOf("kotlin" to kotlinService?.kotlin(), "map" to kotlinService?.map(), "person" to person)
}