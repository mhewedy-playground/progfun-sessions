package week5

object Session_5_1 {
    val list = List(1, 3, 5, 7)                   //> list  : List[Int] = List(1, 3, 5, 7)

    list.head                                     //> res0: Int = 1
    list.headOption                               //> res1: Option[Int] = Some(1)

    list.tail                                     //> res2: List[Int] = List(3, 5, 7)

    list(0)                                       //> res3: Int = 1

    list.init                                     //> res4: List[Int] = List(1, 3, 5)
    list.last                                     //> res5: Int = 7

    list take 2                                   //> res6: List[Int] = List(1, 3)
    list drop 2                                   //> res7: List[Int] = List(5, 7)

    (list take 2) ::: (list drop 3)               //> res8: List[Int] = List(1, 3, 7)
    (list drop 3).:::(list take 2)                //> res9: List[Int] = List(1, 3, 7)
    (list take 2) ++ (list drop 3)                //> res10: List[Int] = List(1, 3, 7)

    list.reverse                                  //> res11: List[Int] = List(7, 5, 3, 1)

    list.updated(0, 10)                           //> res12: List[Int] = List(10, 3, 5, 7)

    list.indexOf(3)                               //> res13: Int = 1
    list.indexOf(9)                               //> res14: Int = -1

    (list contains 1) == ((list indexOf 1) >= 0)  //> res15: Boolean = true

    //// --------------------

    def last[T](xs: List[T]): T = xs match {
        case List()  => throw new RuntimeException("empty")
        case List(x) => x
        case y :: ys => last(ys)
    }                                             //> last: [T](xs: List[T])T

    last(list)                                    //> res16: Int = 7

    def init[T](xs: List[T]): List[T] = xs match {
        case List()  => throw new RuntimeException("empty")
        case List(x) => List()
        case y :: ys => y :: init(ys)
    }                                             //> init: [T](xs: List[T])List[T]

    init(list)                                    //> res17: List[Int] = List(1, 3, 5)

    def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
        case List()  => ys
        case z :: zs => z :: concat(zs, ys)
    }                                             //> concat: [T](xs: List[T], ys: List[T])List[T]

    concat(list, List(2, 4, 6))                   //> res18: List[Int] = List(1, 3, 5, 7, 2, 4, 6)
    // propotional

    def reverse[T](xs: List[T]): List[T] = xs match {
        case Nil     => Nil
        case y :: ys => reverse(ys) ++ List(y)
    }                                             //> reverse: [T](xs: List[T])List[T]
    reverse(list)                                 //> res19: List[Int] = List(7, 5, 3, 1)

    def flatten(xs: List[Any]): List[Any] = xs match {
        case List()           => List()
        case (x1 :: x2) :: xs => x1 :: flatten(x2) ::: flatten(xs)
        case x :: xs          => x :: flatten(xs)
    }                                             //> flatten: (xs: List[Any])List[Any]

    flatten(List(List(1, 1), 2, List(3, List(5, 8))))
                                                  //> res20: List[Any] = List(1, 1, 2, 3, 5, 8)
    
}