package com.dao.kotlindemo.ui.fragment

import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.TextView
import com.dao.kotlindemo.base.BaseFragment
import org.jetbrains.anko.textColor

/**
 * 乐单页面
 * @author daoz
 * @date :2020/3/19 14:22
 */
class YueDanFragment : BaseFragment() {
    override fun initView(): View? {
        val tv = TextView(context)
        tv.gravity = Gravity.CENTER
        tv.textColor = Color.RED
        tv.text = javaClass.simpleName
        return tv
    }
}