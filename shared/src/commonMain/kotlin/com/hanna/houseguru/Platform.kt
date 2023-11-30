package com.hanna.houseguru

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform