package com.greenhandzdl.func

import jdk.jpackage.internal.Log

//A cute cat.
fun error_cat_int(int1:Int,int2:Int):Boolean = if (int1 != int2){Log.error("Fatal Error!!!");false}else true
fun error_cat_boolean(boolean1:Boolean,boolean2:Boolean):Boolean = if (boolean1 != boolean2){Log.error("Fatal Error!!!");false}else true

//Have a break.
fun error_break_int(int1:Int,int2:Int,times:Int=0):Boolean = if (int1 != int2){Log.info("The work is not done, keep working.Times:$times");var times = times + 1;true} else false
fun error_break_boolean(boolean1:Boolean,boolean2:Boolean,times:Int=0):Boolean = if (boolean1 != boolean2){Log.info("The work is not done, keep working.Times:$times");var times = times + 1;true}else false