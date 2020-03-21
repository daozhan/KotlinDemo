package com.dao.kotlindemo.test.Demo19_继承和多态

/**
 *
 * @author daoz
 * @date :2020/3/17 15:20
 */

fun main(args: Array<String>) {
    var person1 = Man("金三胖")
    var person2 = Woman("慈禧太后")
    var person3 = Man("小华华")
    var person4 = Woman("蒙娜丽莎")
    var person5 = Woman("贝克汉姆")

    // 请这些人到一个集合里(房间)
    var houseList = listOf<Human>(person1, person2, person3, person4, person5)

    for (h in houseList){
        h.pee()
    }

}