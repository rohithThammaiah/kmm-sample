package dev.rohith.kmm_sample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform