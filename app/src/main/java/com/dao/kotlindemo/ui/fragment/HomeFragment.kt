package com.dao.kotlindemo.ui.fragment

import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.dao.kotlindemo.R
import com.dao.kotlindemo.adapter.HomeAdapter
import com.dao.kotlindemo.base.BaseFragment
import com.dao.kotlindemo.util.URLProviderUtils
import kotlinx.android.synthetic.main.frg_home.*
import okhttp3.*
import java.io.IOException

/**
 * 主页面
 * @author daoz
 * @date :2020/3/19 14:22
 */
class HomeFragment : BaseFragment() {
    override fun initView(): View? {
        return View.inflate(context, R.layout.frg_home, null)
    }

    override fun initListener() {
        // 初始化rv
        frg_home_rv.layoutManager = LinearLayoutManager(context)
        // 适配
        val adapter = HomeAdapter()
        frg_home_rv.adapter = adapter
    }

    override fun initData() {
        // 初始化数据
        loadData()
    }

    private fun loadData() {
        val path = URLProviderUtils.getHomeUrl(0, 20)
        val client =  OkHttpClient()
        val request = Request.Builder()
            .url(path)
            .get()
            .build()
        client.newCall(request).enqueue(object : Callback{
            /*
            * 子线程调用
            * */
            override fun onFailure(call: Call, e: IOException) {
                myToast("获取数据失败")
            }

            /*
            * 子线程调用
            * */
            override fun onResponse(call: Call, response: Response) {
                myToast("获取数据成功")
                val result = response.body?.string()
                println("获取数据成功: $result")
            }

        })
    }

}