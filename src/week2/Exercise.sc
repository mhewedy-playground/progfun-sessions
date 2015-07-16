package week2

object Exercise {

    def fact(x: Double) = loop(x, 1)              //> fact: (x: Double)Double
    def loop(x: Double, y: Double): Double = {
        if (x == 0) y else loop(x - 1, x * y)
    }                                             //> loop: (x: Double, y: Double)Double
    fact(5)                                       //> res0: Double = 120.0

    def fact2(x: Double): Double =
        if (x == 0) 1 else x * fact2(x - 1)       //> fact2: (x: Double)Double
    fact2(170)                                    //> res1: Double = 7.257415615307994E306


}