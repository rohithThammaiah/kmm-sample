package dev.rohith.kmm_sample

class IOSAnalyticsReporter : AnalyticsReporter {

    override fun setLoggedInUser(user: AnalyticsUser, isANewRegistration: Boolean) {
        TODO("Not yet implemented")
    }

    override fun resetUser() {
        TODO("Not yet implemented")
    }

    override fun createEvent(event: AnalyticsEvent) {
        print("Reporting ${event.name} with ${event.params} on ${getPlatform().name}")
    }

}

actual fun getAnalyticsReporter(): AnalyticsReporter = IOSAnalyticsReporter()