package com.yunzai.helloworld

/**
 * Created by wangweidong on 2017/10/20.
 */
var  a:Int =1
var b =1

val c =1

fun main(args: Array<String>) {
     /*println(sum(111,2222))
     println(sum2(2222,2222))
     println(sum3(2222,2222))
     printSum(1111,222222)
     printSum2(1111,222222)
     vars(1,2,3,4,5,5,6)
     val sumLambda:(Int,Int) -> Int = {x,y -> x+y}
     print(sumLambda(1,2))*/
     /*b +=1;
     val d: Int
     d =2
     println(a)
     println(b)
     println(c)
     println(d)*/

     var a =100000
     val s1 = "a is $a"
     print(s1)

     val s2 = "${s1.replace("is","was")}"
     println(s2)

}
fun sum(a:Int,b:Int): Int{
     return (a+b)
}
fun sum2(a:Int,b: Int) = a+b
public fun sum3(a:Int,b: Int) :Int =a+b

fun printSum(a: Int,b: Int) :Unit{
     println(a+b)
}
public fun printSum2(a: Int,b: Int){
     println(a+b)
}
fun  vars(vararg var2:Int){
     for (v in var2){
          print(v)
     }
}


