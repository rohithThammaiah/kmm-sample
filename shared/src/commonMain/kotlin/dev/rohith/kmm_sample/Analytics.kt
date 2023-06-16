package dev.rohith.kmm_sample

class ActivityDetailAnalytics(
    private val analyticsReporter: AnalyticsReporter,
) {

    fun reportViewActivity(activityId: String, userId: String) {
        analyticsReporter.createEvent(
            AnalyticsEvent(
                "view_activity",
                mapOf(
                    "activityId" to activityId,
                    "userId" to userId,
                )
            )
        )
    }
}