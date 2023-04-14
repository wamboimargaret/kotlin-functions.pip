fun main(){
    printName("Megan")
    printName("Victoria")
    printName("Henry")

    println( remainder(56,24))
    println( remainder(200,11))
    println( remainder(21,5))

    println( sum(34,68,70,22) )
    println(sum(100,66,55,200))
    println(sum(125,11,5,8))

    fact("loves making websites from scratch")
    fact("is a wonderful speaker")


}
//Create and invoke a function that takes in a name and prints out “Hello ${name}” e.g
//given “Ada” it will print out “Hello Ada”
fun printName(name:String){
    println("Hello $name")
}

//Create and invoke a function that given 2 numbers returns the remainder of their
//division
fun remainder(num1:Int,num2:Int):Int{
    return num1 % num2
}
//Create and invoke function that returns the sum of any given 4 numbers
fun sum(nums1:Int,nums2: Int,nums3: Int,nums4: Int):Int{
    return nums1 + nums2 +nums3 + nums4
}
//Create and invoke a function that prints out an interesting fact about yourself
fun fact(fact:String){
    println("Megan $fact")
}