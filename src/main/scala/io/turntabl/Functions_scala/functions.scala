package io.turntabl.Functions_scala

class functions extends App {
  val double = (i:Int)=> i*2
  print(double(20))

  val tripple = (i:Int) => i *3
  print(tripple(30))
  val quad=(i:Int) =>i *4
  print(quad(40))
  val fxn = (i:Int,f:(Int =>Int)) =>f(i)
  fxn(4,double)



  ////1 a
  val myString =(i:String )=>i.length
  myString("hello")
  //
  //// 1 b
  val numOfSpaces =(i:String) => i.split(" ").length-1
  //numOfSpaces("hello bill how are you")

  //2

  val ApplyToString =(i:String, f:(String =>Int))=>f(i)
  ApplyToString("bill ali",myString)
  ApplyToString("bill ali",numOfSpaces)

  //3
  val calculator =(i:String) =>((x:Int, y:Int) => i match{
    case i if (i=="add")     => x +y
    case i if(i=="sub")      => x-y
    case i if(i=="multiply") => x*y
    case i if(i=="divide")   => x/y



  })


}
