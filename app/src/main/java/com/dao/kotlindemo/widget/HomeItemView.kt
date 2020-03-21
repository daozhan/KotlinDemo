package com.dao.kotlindemo.widget

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout
import com.dao.kotlindemo.R

/**
 *
 * @author daoz
 * @date :2020/3/19 15:13
 */
class HomeItemView : RelativeLayout {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    /*
    * 初始化的方法
    * */
    init {
        View.inflate(context, R.layout.item_home, this)
    }
}