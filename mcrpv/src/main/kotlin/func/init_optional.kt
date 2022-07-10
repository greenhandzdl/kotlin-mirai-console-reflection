package com.greenhandzdl.func

import com.greenhandzdl.MiraiConsoleReflectionPluginVersion.configFolder
import com.greenhandzdl.MiraiConsoleReflectionPluginVersion.dataFolder
import func.tools.error_break_boolean
import func.tools.folder_check
import func.tools.folder_done

fun init_folder(pathName :String){
    do{folder_done("$pathName", folder_check("$pathName"))}while(error_break_boolean(true, folder_check("$pathName")))}
fun init_file(){

}
fun init_opt_folder(){
    init_folder("$configFolder/RSets")//Mapping possible management options
    init_folder("$dataFolder/cookies")//temporary storage state(Including the status of receiving and sending)
}