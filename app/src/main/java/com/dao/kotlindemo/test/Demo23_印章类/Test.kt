package com.dao.kotlindemo.test.Demo23_印章类

/**
 *
 * @author daoz
 * @date :2020/3/17 17:53
 */
fun main(args: Array<String>) {
    var s1:Son = Son.小小驴()
    var s2:Son = Son.小骡子()
    var s3:Son = Son.小小驴()

    var list = listOf<Son>(s1, s2, s3)

    for (v in list){
        if (v is Son.小小驴){
            v.sayHello()
        }
    }
}