package com.harbourspace.unsplash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun DetailsContent(){
    LazyColumn {
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
            ) {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp),
                    painter = painterResource(id = R.drawable.iran),
                    contentScale = ContentScale.Crop,
                    contentDescription = "Image"
                )

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Row(
                        verticalAlignment = Alignment.Bottom
                    ) {

                        val locationOnIcon = painterResource(id = R.drawable.ic_location_on)
                        Icon(
                            painter = locationOnIcon,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier
                                .size(24.dp)
                                .padding(1.2.dp)
                                .offset(0.dp, 0.dp)
                        )
                        Text(
                            text = "Iran",
                            fontSize = 20.sp,
                            color = Color.White,
                            modifier = Modifier
                                .padding(2.dp)
                                .offset(0.dp, 0.dp)
                        )
                    }
                }
            }
        }

        item {
            Row(
                modifier = Modifier.padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Image column
                Column(
                    modifier = Modifier
                        .weight(0.5f)
                        .height(50.dp)
                ) {
                    Image(
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(50.dp),
                        painter = painterResource(id = R.drawable.jimphoto),
                        contentScale = ContentScale.Crop,
                        contentDescription = "Image"
                    )
                }

                // Information columns
                Column(
                    modifier = Modifier.weight(1.0f)
                ) {
                    Text(
                        text = "Mohammad",
                        fontSize = 20.sp,
                        color = Color.White
                    )
                }

                Column(
                    modifier = Modifier.weight(1.0f)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Favorite icon
                        val favoriteIcon = painterResource(id = R.drawable.ic_favorite)
                        Icon(
                            painter = favoriteIcon,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier
                                .size(24.dp)
                                .padding(1.2.dp)
                                .offset(0.dp, 0.dp)
                        )
                        Spacer(modifier = Modifier.width(10.dp))


                        // Comment icon
                        val commentIcon = painterResource(id = R.drawable.ic_comment)
                        Icon(
                            painter = commentIcon,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier
                                .size(24.dp)
                                .padding(1.2.dp)
                                .offset(0.dp, 0.dp)
                        )
                        Spacer(modifier = Modifier.width(10.dp))


                        // Comment icon
                        val shareIcon = painterResource(id = R.drawable.ic_share)
                        Icon(
                            painter = shareIcon,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier
                                .size(24.dp)
                                .padding(1.2.dp)
                                .offset(0.dp, 0.dp)
                        )
                    }
                }
            }
        }

        item {
            Row(
                modifier = Modifier.padding(16.dp)
            ) {
                Column(
                    modifier = Modifier.weight(1.0f)
                ) {
                    AddImageInformation(
                        title = stringResource(id = R.string.details_camera_title),
                        subtitle = stringResource(id = R.string.details_camera_default)
                    )
                }

                Column(
                    modifier = Modifier.weight(1.0f)
                ) {
                    AddImageInformation(
                        title = stringResource(id = R.string.details_aperture_title),
                        subtitle = stringResource(id = R.string.details_aperture_default)
                    )
                }
            }
        }

        item {
            Row(
                modifier = Modifier.padding(start = 16.dp, end = 16.dp)
            ) {
                Column(
                    modifier = Modifier.weight(1.0f)
                ) {
                    AddImageInformation(
                        title = stringResource(id = R.string.details_focal_title),
                        subtitle = stringResource(id = R.string.details_focal_default)
                    )
                }

                Column(
                    modifier = Modifier.weight(1.0f)
                ) {
                    AddImageInformation(
                        title = stringResource(id = R.string.details_shutter_title),
                        subtitle = stringResource(id = R.string.details_shutter_default)
                    )
                }
            }
        }

        item {
            Row(
                modifier = Modifier.padding(16.dp)
            ) {
                Column(
                    modifier = Modifier.weight(1.0f)
                ) {
                    AddImageInformation(
                        title = stringResource(id = R.string.details_iso_title),
                        subtitle = stringResource(id = R.string.details_iso_default)
                    )
                }

                Column(
                    modifier = Modifier.weight(1.0f)
                ) {
                    AddImageInformation(
                        title = stringResource(id = R.string.details_dimensions_title),
                        subtitle = stringResource(id = R.string.details_dimensions_default)
                    )
                }
            }
        }

        item {
            Divider(
                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                thickness = 1.dp,
                color = Color.LightGray
            )
        }

        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    AddImageInformation(
                        title = stringResource(id = R.string.details_views_title),
                        subtitle = stringResource(id = R.string.details_views_default)
                    )
                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    AddImageInformation(
                        title = stringResource(id = R.string.details_downloads_title),
                        subtitle = stringResource(id = R.string.details_downloads_default)
                    )
                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    AddImageInformation(
                        title = stringResource(id = R.string.details_likes_title),
                        subtitle = stringResource(id = R.string.details_likes_default)
                    )
                }
            }
        }
        item {
            Divider(
                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                thickness = 1.dp,
                color = Color.LightGray
            )
        }

        item {
            Row(
                modifier = Modifier
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Iran button
                Box(
                    modifier = Modifier
                        .width(80.dp)
                        .height(40.dp)
                        .padding(8.dp)
                        .background(color = Color.Gray, shape = MaterialTheme.shapes.medium),
                    contentAlignment = Alignment.Center

                ) {
                    Text("Iran", color = Color.White, textAlign = TextAlign.Center)
                }

                // Shiraz button
                Box(
                    modifier = Modifier
                        .width(80.dp)
                        .height(40.dp)
                        .padding(8.dp)
                        .background(color = Color.Gray, shape = MaterialTheme.shapes.medium) ,
                    contentAlignment = Alignment.Center

                ) {
                    Text("Shiraz", color = Color.White, textAlign = TextAlign.Center)
                }
            }
        }




    }
}


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

