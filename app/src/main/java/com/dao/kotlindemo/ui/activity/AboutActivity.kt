package com.dao.kotlindemo.ui.activity

import android.support.v7.widget.Toolbar
import com.dao.kotlindemo.R
import com.dao.kotlindemo.base.BaseActivity
import com.dao.kotlindemo.util.ToolBarManager
import org.jetbrains.anko.find

/**
 * 关于页面
 * @author daoz
 * @date :2020/3/19 14:01
 */
class AboutActivity : BaseActivity(), ToolBarManager{
    override val toolbar by lazy { find<Toolbar>(R.id.toolbar) }

    override fun getLayoutId(): Int {
        return R.layout.act_about
    }

    override fun initData() {
        // 初始化标题栏
        initAboutToolBar();
    }
}