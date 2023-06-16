package dev.rohith.kmm_sample

import android.util.Log

class AndroidAnalyticsReporter: AnalyticsReporter {

    override fun setLoggedInUser(user: AnalyticsUser, isANewRegistration: Boolean) {
        TODO("Not yet implemented")
    }

    override fun resetUser() {
        TODO("Not yet implemented")
    }

    override fun createEvent(event: AnalyticsEvent) {
        Log.v("AndroidAnalyticsReporter", "Reporting ${event.name} with ${event.params} on ${getPlatform().name}")
    }

}

actual fun getAnalyticsReporter(): AnalyticsReporter = AndroidAnalyticsReporter()