package com.nihona.nycschools

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform