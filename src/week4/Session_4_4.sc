package week4

import week3.NonEmpty
import week3.NonEmpty
import week3.NonEmpty
import week3.NonEmpty

object Session_4_4 {
    // scala Arrays are invariant
    // scala Lists are vaiant

    def fList(x: List[A]) = x                     //> fList: (x: List[week4.Session_4_4.A])List[week4.Session_4_4.A]
    //fList(List[B]()) // Lists are Variant

    def fArray(x: Array[A]) = x                   //> fArray: (x: Array[week4.Session_4_4.A])Array[week4.Session_4_4.A]
    fArray(Array[A]())                            //> res0: Array[week4.Session_4_4.A] = Array()
    //fArray(Array[B]()) //Arrays are invariant

    def toStr[R](r: R) = r.toString()             //> toStr: [R](r: R)String

    toStr(20)                                     //> res1: String = 20
    toStr(List(1, 3, 5, 7))                       //> res2: String = List(1, 3, 5, 7)
    toStr((x: Int) => x + x)                      //> res3: String = <function1>
    toStr((a: Int, b: Int, c: Int) => a + b + c)  //> res4: String = <function3>

    // --------------------------------
    class X
    class Y extends X

    type A = X => Y
    type B = Y => X

    val fa: A = (a: X) => new Y                   //> fa  : week4.Session_4_4.A = <function1>
    val fb: B = (a: Y) => new X                   //> fb  : week4.Session_4_4.B = <function1>

    val v2: A = fa                                //> v2  : week4.Session_4_4.A = <function1>
    val v1: B = fb                                //> v1  : week4.Session_4_4.B = <function1>
    val v4: B = fa                                //> v4  : week4.Session_4_4.B = <function1>
    //val v3: A = fb

    // --------------------------------
		
}


//