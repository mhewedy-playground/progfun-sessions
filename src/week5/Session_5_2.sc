package week5

import math.Ordering

object Session_5_2 {

    // this one will be picked by the compiler over Ordering.Int
    implicit object ReveresedIntOrdering extends Ordering[Int] {
        def compare(a: Int, b: Int) = if (a < b) 1 else -1
    }

    def msort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {
        val n = xs.length / 2
        if (n == 0) xs
        else {
            def merge(ys: List[T], zs: List[T]): List[T] = (ys, zs) match {
                case (Nil, ys)            => ys
                case (zs, Nil)            => zs
                case (y :: ys1, z :: zs1) => if (ord.lt(y, z)) y :: merge(ys1, zs) else z :: merge(ys, zs1)
            }
            val (fst, snd) = xs splitAt n
            merge(msort(fst), msort(snd))
        }
    }                                             //> msort: [T](xs: List[T])(implicit ord: scala.math.Ordering[T])List[T]

    msort(List(3, 5, 2, 12, -5, 1, 0, 6)) //(ReveresedIntOrdering)
                                                  //> res0: List[Int] = List(12, 6, 5, 3, 2, 1, 0, -5)

    msort(List("ali", "wael", "abdullah", "zakria"))
                                                  //> res1: List[String] = List(abdullah, ali, wael, zakria)

    // --------------------------- --------------------------- ---------------------------

    class Person(val name: String, val age: Int)

    // implicit object is higher than implicit val
    implicit object Boody extends Person("Boody", 30)
    implicit val boody = new Person("Boooody", 2) //> boody  : week5.Session_5_2.Person = week5.Session_5_2$$anonfun$main$1$Perso
                                                  //| n$1@7ca48474

    def personAge(implicit p: Person) = p.age     //> personAge: (implicit p: week5.Session_5_2.Person)Int
    personAge                                     //> res2: Int = 30

}