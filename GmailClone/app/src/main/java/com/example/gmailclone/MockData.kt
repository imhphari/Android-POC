package com.example.gmailclone

import com.example.gmailclone.model.Account
import com.example.gmailclone.model.MailData

val mailList = listOf(
    MailData(
        mailId = 1,
        userName = "Sri",
        subject = "Email regarding your job",
        body = "This is regarding an important opportunity",
        timeStamp = "22:23"
    ),
    MailData(
        mailId = 2,
        userName = "Hari",
        subject = "Email regarding your job",
        body = "This is regarding an important opportunity",
        timeStamp = "22:22"
    ),
    MailData(
        mailId = 3,
        userName = "Hari",
        subject = "Email regarding your job",
        body = "This is regarding an important opportunity",
        timeStamp = "22:22"
    ),
    MailData(
        mailId = 4,
        userName = "Hari",
        subject = "Email regarding your job",
        body = "This is regarding an important opportunity",
        timeStamp = "22:22"
    ),
)

val accountsList = listOf<Account>(
    Account(
        icon = R.drawable.ic_launcher_foreground,
        userName = "Hari Prasath",
        email = "imhphari@gmail.com",
        unReadMails = 99
    ),
    Account(
        icon = R.drawable.ic_launcher_foreground,
        userName = "Hari Prasath",
        email = "imhpharihp@gmail.com",
        unReadMails = 99
    ),

    Account(
        icon = R.drawable.ic_launcher_foreground,
        userName = "Hari Prasath",
        email = "imhpharihp@gmail.com",
        unReadMails = 99
    )
)