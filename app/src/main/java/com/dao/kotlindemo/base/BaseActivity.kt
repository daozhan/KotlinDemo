package com.dao.kotlindemo.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.dao.kotlindemo.ui.activity.MainActivity
import org.jetbrains.anko.*

/**
 * 所有Activity的基类
 * @author daoz
 * @date :2020/3/18 15:05
 */
abstract class BaseActivity : AppCompatActivity(), AnkoLogger {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initListener()
        initData()
        debug { "" }
    }

    /*
    * 初始化数据
    * */
    open protected fun initData() {
    }

    /*
    * listener adapter
    * */
    open protected fun initListener() {
    }

    /*
    * 获取布局id
    * */
    abstract fun getLayoutId(): Int

    /*
    * 消息
    * */
    protected fun myToast(msg: String) {
        runOnUiThread { toast(msg) }
    }

    /*
    * 开启activity并且finish当前页面
    * */
    inline fun <reified T:BaseActivity>startActivityAndFinish(){
        startActivity<T>()
        finish()
    }
}