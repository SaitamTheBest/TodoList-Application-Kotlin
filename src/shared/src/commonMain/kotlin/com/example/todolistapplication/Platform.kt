package com.example.todolistapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform