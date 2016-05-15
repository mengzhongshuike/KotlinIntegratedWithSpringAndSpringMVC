package com.kotlin.web.service

import org.springframework.stereotype.Service

/**
 * Created by 徐文辉 on 2016/4/25.
 */
@Service
class KotlinService {
    fun kotlin() = "kotlin"

    fun map() = mapOf("one" to 1, "two" to 2, "three" to 3)
}
