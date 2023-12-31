package com.harbourspace.HW1Mohammad

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.harbourspace.HW1Mohammad.utils.EXTRA_IMAGE

class ImageViewerActivity: AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_imageviewer)

    val image = intent?.extras?.getInt(EXTRA_IMAGE) ?: return
    findViewById<ImageView>(R.id.iv_preview).setImageResource(image)
  }
}