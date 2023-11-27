package com.harbourspace.HW1Mohammad

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.harbourspace.HW1Mohammad.utils.EXTRA_IMAGE

class DetailsActivity: AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_details)

    findViewById<ImageView>(R.id.iv_preview).setOnClickListener {
      val intent = Intent(this, ImageViewerActivity::class.java)
      intent.putExtra(EXTRA_IMAGE, R.drawable.iran)
      startActivity(intent)
    }
  }
}