package com.greenhandzdl.func

import jdk.jpackage.internal.Log
import java.io.File

fun folder_check(pathName :String) :Boolean = if(!File(pathName).exists()) false else true
fun folder_done(pathName: String,isExists :Boolean) :Int = if(isExists.equals(true)) {
    Log.verbose("The $pathName exists,so it doesn't work.")
    0 //The fun do not opera it.
}else{
    File(pathName).mkdir()
    Log.verbose("The $pathName doesn't exist,so it has been created.")
    1//The fun create it.
}
