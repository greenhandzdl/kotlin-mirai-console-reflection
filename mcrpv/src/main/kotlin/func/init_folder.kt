package com.greenhandzdl.func

import com.greenhandzdl.MiraiConsoleReflectionPluginVersion.dataFolder

fun init_folder(){
    while (error_break_boolean(true, folder_check("$dataFolder/cookies"))) {
        folder_done("$dataFolder/cookies", folder_check("$dataFolder/cookies"))
    }
}