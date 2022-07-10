package com.greenhandzdl.func.tools

import org.json.JSONObject
import java.io.File

fun json_read_string(pathName :String,jsonName :String,obj :String):String{
    val complex = pathName + "/" + json_name_check(jsonName)
    val json = JSONObject(File("$complex").readText())
    val result = json.getString("$obj")
    return result
}
fun json_write_string(pathName :String,jsonName :String,obj :String,valu :String):Boolean{
    val complex = pathName + "/" + json_name_check(jsonName)
    val json = JSONObject(File("$complex").readText())
    json.put(obj,valu)
    File("$complex").writeText(json.toString())
    return true
}