package com.febrian.qrbarcodescanner

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 +254 715 742166 - smile jkuat mentor
 0789891663 - smile 2
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
     //tr +254742138070 randsa Emobilis
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.febrian.qrbarcodescanner", appContext.packageName)
    }
}
