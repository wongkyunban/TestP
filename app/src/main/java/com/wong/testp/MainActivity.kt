package com.wong.testp

import android.content.res.Configuration
import android.graphics.Bitmap
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class MainActivity : AppCompatActivity() {
    private var base64: String? = null

    private val signatureView: SignatureView by lazy { findViewById(R.id.sv) }
    private val mIvShow: ImageView by lazy { findViewById(R.id.mIvShow) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        // 旋转后恢复
        val base64 = savedInstanceState.getString("base64")
        val bitmap: Bitmap? = base64?.let { SignatureView.base64ToBitmap(base64) }
        bitmap?.let { mIvShow.setImageBitmap(bitmap) }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        // 旋转前
        outState.putString("base64", base64)

    }


    fun confirm(view: View) {
        base64 = signatureView.mBitmap?.let { SignatureView.saveBitmapToBase64(it) }
        mIvShow.setImageBitmap(signatureView.mBitmap)
    }

    fun reset(view: View) {
        mIvShow.setImageBitmap(null)
        signatureView.reset()
    }
}
