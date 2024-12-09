package ru.bortsov.holdmaster

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform