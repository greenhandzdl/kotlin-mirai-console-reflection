package func.tools

import com.greenhandzdl.func.tools.logger
import java.io.File

fun folder_check(pathName :String):Boolean = if(!File(pathName).exists()) false else true
fun folder_done(pathName: String,isExists :Boolean):Boolean = if(isExists.equals(true)){ logger.info("The $pathName exists,so it doesn't work.");false}else{File(pathName).mkdir();logger.info("The $pathName doesn't exist,so it has been created.");true}
