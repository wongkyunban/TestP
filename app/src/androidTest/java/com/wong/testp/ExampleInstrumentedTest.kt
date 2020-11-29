package com.wong.testp

import android.graphics.Color
import android.graphics.Path
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

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
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.wong.testp", appContext.packageName)
    }
    @Test
    fun signatureViewDemo(){
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        val signatureView:SignatureView = SignatureView(appContext)
        val path: Path = Path()
        path.moveTo(10F,10F)
        path.quadTo(10F,10F,20F,20F)
        path.lineTo(30F,30F)
        signatureView.mPathPaint.color = Color.GREEN
        signatureView.invalidate()
    }

}