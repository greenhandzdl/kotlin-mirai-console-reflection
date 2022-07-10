package com.greenhandzdl

import com.greenhandzdl.func.init_opt_file
import com.greenhandzdl.func.init_opt_folder
import com.greenhandzdl.func.tools.file_done
import com.greenhandzdl.func.tools.json_done
import com.greenhandzdl.func.tools.json_name_check
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.event.events.GroupMessageEvent
import net.mamoe.mirai.event.globalEventChannel
import net.mamoe.mirai.utils.info

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
        init_opt_folder()
        init_opt_file()
        logger.info { "MCR Plugin loaded" }
        globalEventChannel().subscribeAlways<GroupMessageEvent> {
            }
        }
}