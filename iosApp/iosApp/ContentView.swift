import SwiftUI
import shared

struct ContentView: View {
	let greet = Greeting().greet()
    let analyticsReporter = ActivityDetailAnalytics(analyticsReporter: IOSAnalyticsReporter())
    let activityId: String = UUID().uuidString
    let userId: String = UUID().uuidString

	var body: some View {
		Text(greet)
            .onTapGesture {
                analyticsReporter.reportViewActivity(activityId: activityId, userId: userId)
            }
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
