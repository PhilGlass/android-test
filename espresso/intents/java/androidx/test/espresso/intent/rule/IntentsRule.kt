package androidx.test.espresso.intent.rule

import androidx.test.espresso.intent.Intents
import org.junit.rules.ExternalResource

/**
 * Rule for performing set up and tear down of Espresso intents API. Unlike [IntentsTestRule] this
 * rule does not associate itself with an Activity.
 *
 * Usage: `@Rule public IntentsRule intentsRule = new IntentsRule()`
 *
 * Then in a test method: `Intents.intended(IntentMatchers.hasComponent("com.example.FooActivity"))`
 */
class IntentsRule : ExternalResource() {

  override fun before() = Intents.init()

  override fun after() = Intents.release()
}
