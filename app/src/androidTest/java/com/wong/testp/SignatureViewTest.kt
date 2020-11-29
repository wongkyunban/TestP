package com.wong.testp

import androidx.test.platform.app.InstrumentationRegistry
import junit.framework.TestCase
import kotlin.properties.Delegates

class SignatureViewTest : TestCase() {

    private var signatureView:SignatureView by Delegates.notNull<SignatureView>()
    public override fun setUp() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        signatureView = SignatureView(appContext)
    }

    public override fun tearDown() {}

    fun testGetMPathPaint() {}

    fun testSetMPathPaint() {}

    fun testGetCanvas() {}

    fun testSetCanvas() {}

    fun testOnMeasure() {}

    fun testOnTouchEvent() {}

    fun testOnDraw() {}
}