package com.dao.kotlindemo.ui.activity

import android.preference.PreferenceManager
import android.support.v7.widget.Toolbar
import com.dao.kotlindemo.R
import com.dao.kotlindemo.base.BaseActivity
import com.dao.kotlindemo.util.ToolBarManager
import org.jetbrains.anko.find

/**
 *
 * @author daoz
 * @date :2020/3/19 9:59
 */
class SettingActivity : BaseActivity(), ToolBarManager {
    override val toolbar by lazy { find<Toolbar>(R.id.toolbar) }

    override fun getLayoutId(): Int {
        return R.layout.act_setting
    }

    override fun initData() {
        // 初始化标题
        initSettingToolBar()
        // 获取推送通知有没有选中
        val sp = PreferenceManager.getDefaultSharedPreferences(this)
        val push = sp.getBoolean("push", false)
    }
}