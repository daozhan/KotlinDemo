package com.dao.kotlindemo.ui.activity

import android.support.v4.view.ViewCompat
import android.support.v4.view.ViewPropertyAnimatorCompat
import android.support.v4.view.ViewPropertyAnimatorListener
import android.view.View
import com.dao.kotlindemo.R
import com.dao.kotlindemo.base.BaseActivity
import kotlinx.android.synthetic.main.act_splash.*
import org.jetbrains.anko.startActivity

/**
 *
 * @author daoz
 * @date :2020/3/18 16:03
 */
class SplashActivity : BaseActivity(), ViewPropertyAnimatorListener {
    override fun onAnimationEnd(p0: View?) {
        // 动画结束 -> 进入主界面
//        startActivity<MainActivity>()
//        finish()
        startActivityAndFinish<MainActivity>()
    }

    override fun onAnimationCancel(p0: View?) {
    }

    override fun onAnimationStart(p0: View?) {
    }

    override fun getLayoutId(): Int {
        return R.layout.act_splash
    }

    override fun initData() {
        // 缩放动画
        ViewCompat
            .animate(act_splash_image)
            .scaleX(1.0f)
            .scaleY(1.0f)
            .setListener(this)
            .duration = 2000
    }
}

