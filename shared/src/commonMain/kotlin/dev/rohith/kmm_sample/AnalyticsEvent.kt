package dev.rohith.kmm_sample

data class AnalyticsEvent(
    val name: String,
    val params: Map<String, Any?>,
)