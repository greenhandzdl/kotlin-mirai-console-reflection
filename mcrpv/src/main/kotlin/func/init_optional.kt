package com.greenhandzdl.func

import com.greenhandzdl.MiraiConsoleReflectionPluginVersion.configFolder
import com.greenhandzdl.MiraiConsoleReflectionPluginVersion.dataFolder
import func.tools.error_break_boolean
import func.tools.folder_check
import func.tools.folder_done

fun init_folder(){
    while (error_break_boolean(true, folder_check("$configFolder/RSets"))) {
        folder_done("$configFolder/RSets", folder_check("$configFolder/RSets"))
    }//Mapping possible management options
    while (error_break_boolean(true, folder_check("$dataFolder/cookies"))) {
        folder_done("$dataFolder/cookies", folder_check("$dataFolder/cookies"))
    }//temporary storage state(Including the status of receiving and sending)
}