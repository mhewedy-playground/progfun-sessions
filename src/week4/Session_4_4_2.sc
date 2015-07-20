package week4

object Session_4_4_2 {

    val aList: List[B] = List(new B())            //> aList  : List[week4.B] = List(week4.B@7f690630)
    val bList: List[A] = aList                    //> bList  : List[week4.A] = List(week4.B@7f690630)

    val aArray: Array[B] = Array(new B())         //> aArray  : Array[week4.B] = Array(week4.B@783e6358)
    //val bArray: Array[A] = aArray		// compile Error => class Array is invariant in type

    // ----------

    val x: week3.Cons[B] = new week3.Cons(new B(), week3.Nil)
                                                  //> x  : week3.Cons[week4.B] =  > week4.B@17550481
    x.prepend(new A())                            //> res0: week3.List[week4.A] =  > week4.A@735f7ae5 > week4.B@17550481
    x.prepend(new C())                            //> res1: week3.List[week4.A] =  > week4.C@180bc464 > week4.B@17550481
    x.prepend(new B())                            //> res2: week3.List[week4.B] =  > week4.B@1324409e > week4.B@17550481

}

class A
class B extends A
class C extends A