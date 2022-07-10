package com.greenhandzdl.func.tools

import java.io.File
import java.io.FileOutputStream
import java.net.URL
import java.net.URLConnection

//图片下载
fun IMGdownload(downLoadUrl: String , filename : String) :Boolean{
    val url = URL(downLoadUrl)
    val con: URLConnection = url.openConnection()
    val `is`: java.io.InputStream = con.getInputStream()
    val bs = ByteArray(1024)
    var len: Int
    val file = File(filename)
    val os = FileOutputStream(file, true)
    while (`is`.read(bs).also { len = it } != -1) {
        os.write(bs, 0, len)
    }
    os.close()
    `is`.close()
    return true
}
