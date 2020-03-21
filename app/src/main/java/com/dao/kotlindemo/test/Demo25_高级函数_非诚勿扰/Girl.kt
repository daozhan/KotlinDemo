package com.dao.kotlindemo.test.Demo25_高级函数_非诚勿扰

/**
 *
 * @author daoz
 * @date :2020/3/18 9:33
 */

data class Girl(var name: String, var age: Int, var height: Int, var address: String)

var 非诚勿扰数据库 = listOf<Girl>(
    Girl("依儿", 18, 168, "山东"),
    Girl("笑笑", 19, 175, "河南"),
    Girl("小百合", 22, 155, "福建"),
    Girl("michel", 28, 167, "广东"),
    Girl("猫咪", 24, 180, "广西"),
    Girl("玲儿", 18, 173, "安徽"),
    Girl("环环", 19, 157, "河北"),
    Girl("胖嘟嘟", 24, 168, "广东"),
    Girl("乔乔", 26, 169, "江西"),
    Girl("小可爱", 21, 163, "山东"),
    Girl("一生有你", 22, 178, "黑龙江"),
    Girl("敏儿", 28, 160, "吉林"),
    Girl("月儿", 18, 159, "山东"),
    Girl("花儿", 21, 168, "新疆"),
    Girl("小糖", 23, 178, "广西"),
    Girl("悦悦", 31, 170, "山东"),
    Girl("小可爱", 49, 168, "新疆"),
    Girl("紫琪", 26, 169, "甘肃"),
    Girl("糖心", 25, 159, "浙江"),
    Girl("安琪", 25, 168, "山东"),
    Girl("欣儿", 27, 160, "河南"),
    Girl("叶子", 49, 170, "河北"),
    Girl("喵喵", 19, 164, "山东")
)

// 扩展函数 infix: 可以使点的调用变成空格
infix fun List<Girl>.查找嫩妹子年龄小于(age:Int){
    filter {
        it.age < age
    }.forEach(::println)
}

infix fun List<Girl>.查找老妹子年龄大于(age:Int){
    filter {
        it.age > age
    }.forEach(::println)
}

infix fun List<Girl>.查找妹子来自(address:String){
    filter {
        it.address == address
    }.forEach(::println)
}

//////////////////////////////////////
// 下面方法不够好，有新的
//////////////////////////////////////


//// 筛选地区
//fun filterGirlsByAddress(address: String) {
//    var 某个地区的妹子 = ArrayList<Girl>()
//    for (girl in 非诚勿扰数据库) {
//        if (girl.address == address) {
//            某个地区的妹子.add(girl)
//        }
//    }
//    for (girl in 某个地区的妹子) {
//        println("${girl.address}${girl.age} 岁的美女 ${girl.name}")
//    }
//}
//
//// 筛选年龄
//fun filterGirlsByAge(age: Int) {
//    var 某个年龄以下的妹子 = ArrayList<Girl>()
//    for (girl in 非诚勿扰数据库) {
//        if (girl.age < age) {
//            某个年龄以下的妹子.add(girl)
//        }
//    }
//    for (girl in 某个年龄以下的妹子) {
//        println("${girl.address}${girl.age} 岁的美女 ${girl.name}")
//    }
//}
//
//// 筛选条件
//fun filterGirlsByAddressHeightAge(address:String, height: Int,age: Int) {
//    var 符合条件的妹子 = ArrayList<Girl>()
//    for (girl in 非诚勿扰数据库) {
//        if ((girl.age < age) and (girl.address == address) and (girl.height > height)) {
//            符合条件的妹子.add(girl)
//        }
//    }
//    for (girl in 符合条件的妹子) {
//        println("${girl.address}${girl.age} 岁的美女 ${girl.name} 身高 ${girl.height} ")
//    }
//}
//
//
//// 筛选条件 flag ture 喜欢年轻的 false 喜欢年龄大的
//fun filterGirlsByAddressHeightAge(address:String, height: Int,age: Int, flag:Boolean) {
//    var 符合条件的妹子 = ArrayList<Girl>()
//    for (girl in 非诚勿扰数据库) {
//        if (flag){
//            if ((girl.age < age) and (girl.address == address) and (girl.height > height)) {
//                符合条件的妹子.add(girl)
//            }
//        }else{
//            if ((girl.age > age) and (girl.address == address) and (girl.height > height)) {
//                符合条件的妹子.add(girl)
//            }
//        }
//    }
//    for (girl in 符合条件的妹子) {
//        println("${girl.address}${girl.age} 岁的美女 ${girl.name} 身高 ${girl.height} ")
//    }
//}