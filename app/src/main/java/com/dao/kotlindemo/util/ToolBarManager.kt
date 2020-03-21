package com.dao.kotlindemo.util

import android.content.Intent
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.widget.Toast
import com.dao.kotlindemo.R
import com.dao.kotlindemo.ui.activity.SettingActivity
import org.jetbrains.anko.startActivity


/**
 * 所有界面的toolbar的管理类
 * @author daoz
 * @date :2020/3/19 9:11
 */

interface ToolBarManager {
    val toolbar: Toolbar

    /*
    * 初始化主界面的toolbar
    * */
    fun initMainToolBar(){
        toolbar.title = "知道影音"
        toolbar.inflateMenu(R.menu.main)
        toolbar.setOnMenuItemClickListener{
            toolbar.context.startActivity<SettingActivity>()
            true
        }
//        toolbar.setOnMenuItemClickListener(object : Toolbar.OnMenuItemClickListener{
//            override fun onMenuItemClick(p0: MenuItem?): Boolean {
//                when(p0?.itemId){
//                    R.id.setting ->{
//                        // 跳转到设置页面
////                      toolbar.context.startActivity(Intent(toolbar.context, SettingActivity::class.java))
//                        toolbar.context.startActivity<SettingActivity>()
//                    }
//                }
//
//                return true
//            }
//        })
    }

    fun initSettingToolBar(){
        toolbar.title = "设置"
    }

    fun initAboutToolBar(){
        toolbar.title = "关于"
    }


}