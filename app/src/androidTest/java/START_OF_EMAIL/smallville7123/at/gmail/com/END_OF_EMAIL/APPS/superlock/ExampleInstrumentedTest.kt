package START_OF_EMAIL.smallville7123.at.gmail.com.END_OF_EMAIL.APPS.SuperLock

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("START_OF_EMAIL.smallville7123.at.gmail.com.END_OF_EMAIL.APPS.SuperLock", appContext.packageName)
    }
}
