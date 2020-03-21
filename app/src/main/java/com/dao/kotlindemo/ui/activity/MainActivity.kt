package com.dao.kotlindemo.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import com.dao.kotlindemo.R
import com.dao.kotlindemo.base.BaseActivity
import com.dao.kotlindemo.util.FragmentUtil
import com.dao.kotlindemo.util.ToolBarManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.find


class MainActivity : BaseActivity(), ToolBarManager {
    // 惰性加载 初始化toolbar
    override val toolbar by lazy { find<Toolbar>(R.id.toolbar) }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initData() {
        // 初始化标题
        initMainToolBar()
    }

    override fun initListener() {
        // 设置tab切换监听
        bottomBar.setOnTabSelectListener {
            // it 代表参数tabId
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.act_main_fl,
                FragmentUtil.fragmentUtil.getFragment(it)!!,it.toString())
            transaction.commit()
        }
    }
}
