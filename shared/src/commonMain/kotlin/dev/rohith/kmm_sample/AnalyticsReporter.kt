package dev.rohith.kmm_sample

interface AnalyticsReporter {

    fun setLoggedInUser(user: AnalyticsUser, isANewRegistration: Boolean)

    fun resetUser()

    fun createEvent(event: AnalyticsEvent)
}

expect fun getAnalyticsReporter(): AnalyticsReporter