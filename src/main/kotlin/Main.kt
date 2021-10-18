fun main(args: Array<String>) {


// Part I
var list0ne= mutableListOf("Mdenh","jeddah","Riyadh")
     list0ne.add("Dilam")
     list0ne.add("ALkharj")
     println(list0ne)
    for (index in 0 until list0ne.size){
        println("$index - ${list0ne[index]} ")  }
    // Part II
     println(" ============ Part II =================")
    var Number = mutableListOf(1,2,3,4,5)

    Number [3]= 12
    println(Number) // To check 12 Number
    Number.removeAt(3)
    println(Number)
}






