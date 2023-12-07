package com.harbourspace.unsplash

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
//import androidx.compose.material3.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class AppScreenActivity : ComponentActivity() {

    private val pickMedia =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == RESULT_OK) {
                val uri = result.data?.data
                if (uri != null) {

                }
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            UnsplashAppContent()
        }
    }
    @Preview
    @Composable
    fun UnsplashAppContent() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            InputContent()

            Spacer(modifier = Modifier.height(16.dp))

            AddImageInformation(title = "Title", subtitle = "Subtitle")

            Spacer(modifier = Modifier.height(16.dp))

            // Button to launch the photo picker
            Button(
                onClick = { launchPhotoPicker() },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text("Select Photo")
            }
        }
    }

    @Preview
    @Composable
    fun AddImageInformation(
        title: String = "text",
        subtitle: String = "subtext"
    ) {
        Text(
            text = title,
            fontSize = 17.sp,
            color = Color.White
        )

        Text(
            text = subtitle,
            fontSize = 15.sp
        )
    }
    private fun launchPhotoPicker() {

        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*" // Set the desired MIME type

        pickMedia.launch(intent)
    }




}
