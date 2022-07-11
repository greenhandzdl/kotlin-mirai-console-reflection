package com.greenhandzdl.func.tools


import java.io.File
import java.nio.charset.Charset
import java.nio.file.Files
import java.nio.file.Paths
import java.time.LocalDateTime
import java.time.ZoneOffset


fun file_is_exits(filePath :String) :String{
    val path = Paths.get(filePath)
    val result = when {
        Files.isDirectory(path) -> "File is a Directory"
        Files.exists(path) -> "File exists!!"
        Files.notExists(path) -> "File doesn't exist!!"
        else -> "Program doesn't have access to the file!!"
    }
    return result.toString()
}
fun file_is_folder(filePath :String) :String{
    val path = Paths.get(filePath)
    val exists = Files.isRegularFile(path)
    val result =if (exists) "File exists!!" else "File doesn't exist!!"
    return result.toString()
}
fun file_check(pathName :String,fileName :String) :Boolean{
    val complex = pathName + "/" + fileName
    val result = when(file_is_exits(complex)){
        "File exists!!" -> "true"
        else -> "false"
    }
    return result.toBoolean()
}
fun file_done(pathName :String, fileName :String,isExists :Boolean) :Boolean = if(isExists.equals(true)){logger.info("The $pathName/$fileName exists,so it doesn't work.");false} else {File(pathName+"/"+ fileName).createNewFile();logger.info("The $pathName/$fileName doesn't exist,so it works.");true}
fun file_write_last_line(pathName: String,fileName: String,contents: String) :Boolean{
    val f = File(pathName +"/" + fileName)
    val a = if (!f.exists()){
        f.createNewFile()
        f.appendText("${LocalDateTime.now(ZoneOffset.UTC)}/$contents", Charset.defaultCharset())
        return false
    }else{
        f.appendText("\n", Charset.defaultCharset())
        f.appendText("${LocalDateTime.now(ZoneOffset.UTC)}/$contents", Charset.defaultCharset())
        true
    }

    return a
}


fun json_name_check(jsonName :String):String=if(jsonName.endsWith(".json")) jsonName else "$jsonName.json"
fun json_done(pathName :String,jsonName :String,isExists :Boolean) :Boolean = if(isExists.equals(true)){logger.info("The $pathName/$jsonName(json) exists,so it doesn't work.");false} else {File(pathName+"/"+json_name_check(jsonName)).createNewFile();logger.info("The $pathName/$jsonName(json) doesn't exist,so it works.");true}