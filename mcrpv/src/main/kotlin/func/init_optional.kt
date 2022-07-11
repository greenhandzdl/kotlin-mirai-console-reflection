package com.greenhandzdl.func

import com.greenhandzdl.MiraiConsoleReflectionPluginVersion.configFolder
import com.greenhandzdl.MiraiConsoleReflectionPluginVersion.dataFolder
import com.greenhandzdl.func.tools.file_check
import com.greenhandzdl.func.tools.file_done
import com.greenhandzdl.func.tools.json_done
import com.greenhandzdl.func.tools.json_name_check
import func.tools.error_break_boolean
import func.tools.folder_check
import func.tools.folder_done

fun init_folder(pathName :String){
    do{folder_done("$pathName", folder_check("$pathName"))}while(error_break_boolean(true, folder_check("$pathName")))
}
fun init_file(pathName :String, fileName :String){
    do{file_done("$pathName", "$fileName", file_check("$pathName", "$fileName"))}while(error_break_boolean(true, file_check("$pathName", "$fileName")))
}
fun init_json(pathName :String, jsonName :String){
    do{json_done("$pathName", "$jsonName", file_check("$pathName", json_name_check("$jsonName")))}while(error_break_boolean(true, file_check("$pathName", json_name_check("$jsonName"))))
}
fun init_opt_folder(){
    init_folder("$configFolder/RSets")//Mapping possible management options
    init_folder("$dataFolder/cache")//temporary storage state(Including the status of receiving and sending)
    init_folder("$dataFolder/groupMessage")
}
fun init_opt_file(){
    //init_file("$dataFolder","cache")
}
fun init_opt_json(){
    //init_json("$dataFolder","cache")
}
fun init_opt(){
    init_opt_folder()
    init_opt_file()
    init_opt_json()
}