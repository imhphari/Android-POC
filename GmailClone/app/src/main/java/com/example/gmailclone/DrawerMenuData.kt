package com.example.gmailclone

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerMenuData(
    val icon: ImageVector? = null,
    val title: String? = null,
    val isDivider: Boolean = false,
    val isHeader: Boolean = false
){
    object AllInboxes: DrawerMenuData(
        icon = Icons.Outlined.AllInbox,
        title = "All Inboxes"
    )
    object Primary: DrawerMenuData(
        icon = Icons.Outlined.Inbox,
        title = "Primary"
    )
    object Social: DrawerMenuData(
        icon = Icons.Outlined.Person,
        title = "Social"
    )
    object AllMail: DrawerMenuData(
        icon = Icons.Outlined.Mail,
        title = "All Mail"
    )
    object Calendar: DrawerMenuData(
        icon = Icons.Outlined.CalendarToday,
        title = "Calendar"
    )
    object Contacts: DrawerMenuData(
        icon = Icons.Outlined.Contacts,
        title = "Contacts"
    )
    object Settings: DrawerMenuData(
        icon = Icons.Outlined.Settings,
        title = "Settings"
    )
    object Sent: DrawerMenuData(
        icon = Icons.Outlined.Send,
        title = "Sent"
    )
    object Schedule: DrawerMenuData(
        icon = Icons.Outlined.Schedule,
        title = "Schedule"
    )
    object Outbox: DrawerMenuData(
        icon = Icons.Outlined.Outbox,
        title = "Outbox"
    )
    object Draft: DrawerMenuData(
        icon = Icons.Outlined.Drafts,
        title = "Drafts"
    )
    object Divider: DrawerMenuData(
        isDivider = true
    )

    object HeaderOne: DrawerMenuData(
        isHeader = true,
        title = "ALL LABELS"
    )
    object HeaderTwo: DrawerMenuData(
        isHeader = true,
        title = "GOOGLE APPS"
    )


}