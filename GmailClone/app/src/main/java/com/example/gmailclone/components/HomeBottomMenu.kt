package com.example.gmailclone.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.gmailclone.model.BottomMenuData

@Composable
fun HomeBottomMenu() {
    val items = listOf(
        BottomMenuData.Mail,
        BottomMenuData.Meet
    )

    BottomNavigation(backgroundColor = Color.White, contentColor = Color.Black) {
        items.forEach { item ->
            BottomNavigationItem(
                label = { Text(text = item.title) },
                alwaysShowLabel = true,
                selected = false,
                onClick = { /*TODO*/ },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title
                    )
                })
        }
    }
}