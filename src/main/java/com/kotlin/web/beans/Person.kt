package com.kotlin.web.beans

import org.springframework.stereotype.Component

/**
 * Created by 徐文辉 on 2016/4/26.
 */
@Component
data class Person(var name: String? = "xuwenhui", var id: Int? = 1)
