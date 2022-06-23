package mx.com.geelkyworld.kotlinbasics

fun main(){
 //var myName  = "Dan the man"
 //myName = "Heidi"
 // Variable inmutable
 // Todo: Funcionalidad
 /*Comentario multilinea */
 // type String
 //val myName  = "Dan the man"
 // type int 32 int
 //var myAge = 45

 // Integeres Types: 8, 16,32,74
 //val myByte: Byte = 13
 //val myShort: Short = 125
 //val myInt: Int = 1212312312
 //val myLong: Long = 39_812_309_487_120_300

 // Float
 //val myFloat = 13.16f
 //val myDouble = 3.14154554545455

 // Boolean
 //var myBoolean  = true

 // Characters
 //var myChar = 'Q'

 //val myStr = "Hello World"
 //var firstCharinStr = myStr[0]
 //var lastCharinStr = myStr[myStr.length-1]
 //print("First Character "+ firstCharinStr+"\n")
 //print("Last Character "+ lastCharinStr)
 //print("Hola: "+  myName+" Tu edad es de: "+toStr(myAge))

 //var result =  5+3
 //val a = 5.0
 //val b = 3.0
 //var resultDouble : Double
// resultDouble =  a / b
 //print(resultDouble)

 // Comparison operator (==, !=, <, >, <=, >=)
 //val isEqual  = 5==3
 //println("isEqual is $isEqual")

 //val isNotEqual = 5!=5
 //println("isNotEqual is $isNotEqual")
//String Interpolation
 //println("is5greater3 ${-5>3}")
 //println("is5LowerEqual3 ${5 <= 3}")
 //println("is5GreaterEqual3 ${5 >= 3}")

 //var myNum = 3
 //myNum += 3
 //println("myNum is $myNum")

 var heightPerson1 = 179
 //var heightPerson2 = 179

 if (heightPerson1 > 21){
   println("you could drink")
 }else if (heightPerson1 == 18) {
  println("you could Vote")
 }else if(heightPerson1 < 18){
  println("you don't have the age")
 }

 when {
  heightPerson1 > 21 -> {
   println("you could drink")
  }
  heightPerson1 == 18 -> {
   println("you could Vote")
  }
  heightPerson1 < 18 -> {
   println("you don't have the age")
  }
 }
  var month =  3

  when (month){
     1 -> println("spring")
     2 -> println("fall")
     3 -> {
      println("winter")
     }
   else -> println("Invalid season")
  }

   when (month){
   in 3.. 5 -> println("spring")
   in 6.. 8 -> println("fall")
   in 9..11 -> println("winter")
   in 12..2 -> println("winter")
   else -> println("Invalid season")
  }

 var x : Any = 13.37f

 when (x){
    is Int -> println("integer")
    is Double -> println("Double")
    is String -> println("String")
    else -> println("$x is none of the above")
 }

 }


fun hello(){

}