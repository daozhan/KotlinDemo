package com.dao.kotlindemo.util

import com.dao.kotlindemo.R
import com.dao.kotlindemo.base.BaseFragment
import com.dao.kotlindemo.ui.fragment.HomeFragment
import com.dao.kotlindemo.ui.fragment.MvFragment
import com.dao.kotlindemo.ui.fragment.VBangFragment
import com.dao.kotlindemo.ui.fragment.YueDanFragment

/**
 * Fragment管理类
 * @author daoz
 * @date :2020/3/19 14:43
 */

class FragmentUtil private constructor() {// 私有化构造方法
    val homeFragment by lazy { HomeFragment() }
    val mvFragment by lazy { MvFragment() }
    val vBangFragment by lazy { VBangFragment() }
    val yueDanFragment by lazy { YueDanFragment() }

    companion object {
        val fragmentUtil by lazy { FragmentUtil() }
    }

    /*
    * 根据tabId获取fragment
    * */
    fun getFragment(tabId: Int): BaseFragment? {
        when(tabId){
            R.id.tab_home -> return homeFragment
            R.id.tab_mv -> return mvFragment
            R.id.tab_vbang -> return vBangFragment
            R.id.tab_yuedan -> return yueDanFragment
        }
        return null
    }


}