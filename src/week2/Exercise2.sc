package week2

object Exercise2 {

    def sumTail(f: Int => Int, a: Int, b: Int): Int = {
        def loop(a: Int, t: Int): Int =
            if (a > b) t else loop(a + 1, t + f(a))
        loop(a, 0)
    }                                             //> sumTail: (f: Int => Int, a: Int, b: Int)Int

    sumTail(x => x, 1, 3)                         //> res0: Int = 6
    sumTail(x => x * x * x, 1, 3)                 //> res1: Int = 36

}