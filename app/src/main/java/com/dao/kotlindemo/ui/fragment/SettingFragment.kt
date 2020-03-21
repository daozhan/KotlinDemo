package com.dao.kotlindemo.ui.fragment

import android.os.Bundle
import android.preference.Preference
import android.preference.PreferenceFragment
import android.preference.PreferenceScreen
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dao.kotlindemo.R
import com.dao.kotlindemo.ui.activity.AboutActivity
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

/**
 *
 * @author daoz
 * @date :2020/3/19 11:28
 */
class SettingFragment : PreferenceFragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        addPreferencesFromResource(R.xml.setting)
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onPreferenceTreeClick(preferenceScreen: PreferenceScreen?, preference: Preference?): Boolean {
        val key = preference?.key
        when(key){
            "about" -> {// 点击了关于
                activity.startActivity<AboutActivity>()
            }
        }

        return super.onPreferenceTreeClick(preferenceScreen, preference)
    }
}