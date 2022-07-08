package com.greenhandzdl

import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
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
        logger.info { "Plugin loaded" }
    }
}