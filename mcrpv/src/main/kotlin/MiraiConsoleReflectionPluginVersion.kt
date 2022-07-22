package com.greenhandzdl

import com.greenhandzdl.func.*
import com.greenhandzdl.func.tools.file_check
import com.greenhandzdl.func.tools.file_write_last_line
import com.greenhandzdl.func.tools.json_read_string
import com.greenhandzdl.func.tools.json_write_string
import func.tools.error_break_boolean
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.event.events.GroupMessageEvent
import net.mamoe.mirai.event.globalEventChannel
import net.mamoe.mirai.message.data.At
import net.mamoe.mirai.message.data.AtAll
import net.mamoe.mirai.message.data.PlainText
import net.mamoe.mirai.message.data.messageChainOf
import net.mamoe.mirai.utils.info
import java.io.File
import java.time.LocalDateTime
import java.time.ZoneOffset

object MiraiConsoleReflectionPluginVersion : KotlinPlugin(
    JvmPluginDescription(
        id = "com.greenhandzdl.mcrpv",
        name = "Mirai Console Reflection Plugin Version",
        version = "0.0.1",
    ) {
        author("greenhandzdl")
    }
) {
    override fun onEnable() {
        init_opt()
        logger.info { "MCR Plugin loaded" }
        globalEventChannel().subscribeAlways<GroupMessageEvent> {

            launch {

            }
        }
    }
}