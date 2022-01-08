package com.example.to_docompose.ui.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.to_docompose.ui.theme.splashScreenBackground
import com.example.to_docompose.util.Constants.SPLASH_SCREEN_DELAY
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navigateToListscreen: () -> Unit
) {
    LaunchedEffect(key1 = true) {
        delay(SPLASH_SCREEN_DELAY)
        navigateToListscreen()
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.splashScreenBackground)
    ) {
//        Image(
//            modifier = Modifier.size(100.dp),
//            painter = painterResource(id = getLogo()),
//            contentDescription = ...
//        )
    }
}

// 로고 가져오기
//@Composable
//fun getLogo(): Int {
//    return if (isSystemInDarkTheme()) {
//        R.drawable.
//    } else {
//        R.drawable
//    }
//}

// Splash Screen 하려면 강의 확인하기 (애니메이션 있음)