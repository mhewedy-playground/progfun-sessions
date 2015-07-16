package week3

object session_3_3 {

    def singletone[T](e: T): List[T] = new Cons(e, new Nil)
                                                  //> singletone: [T](e: T)week3.List[T]

    val intList = singletone(true)                //> intList  : week3.List[Boolean] =  > true
    intList.head                                  //> res0: Boolean = true
    intList.tail                                  //> res1: week3.List[Boolean] = nil

    val seq = new Cons(10, new Cons(20, new Cons(30, new Cons(40, new Nil))))
                                                  //> seq  : week3.Cons[Int] =  > 10 > 20 > 30 > 40

    def nth[T](n: Int, list: List[T]): T = {
        def loop(list: List[T], count: Int): T = {
            if (list.isEmpty) throw new IndexOutOfBoundsException("index: " + n + ", size : " + count)
            else if (n == count) list.head
            else loop(list.tail, count + 1)
        }
        loop(list, 0)
    }                                             //> nth: [T](n: Int, list: week3.List[T])T

    nth(2, seq)                                   //> res2: Int = 30

}