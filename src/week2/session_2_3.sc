package week2

import math.abs

object session_2_3 {

    def f(x: Int) = x                             //> f: (x: Int)Int

    // ---------
    val tolerance = 1e-4                          //> tolerance  : Double = 1.0E-4

    def isCloseEnough(x: Double, y: Double) =
        math.abs((x - y) / x) / x < tolerance     //> isCloseEnough: (x: Double, y: Double)Boolean

    def fixedPoint(f: Double => Double)(guess: Double) = {

        def iterate(x: Double): Double = {
            val fx = f(x)
            if (isCloseEnough(x, fx)) x
            else iterate(fx)
        }
        iterate(guess)
    }                                             //> fixedPoint: (f: Double => Double)(guess: Double)Double

    fixedPoint(x => 1 + x / 2)(1)                 //> res0: Double = 1.99951171875

    fixedPoint(x => 1 + x)(1)                     //> res1: Double = 101.0

    fixedPoint(x => 1 + x * 2)(1)                 //> res2: Double = 16383.0

    // n = x * x		->>		x = n/x 		->> x => n/x
    def sqrt(n: Double) = fixedPoint(x => (x + n / x) / 2)(1)
                                                  //> sqrt: (n: Double)Double
    sqrt(2)                                       //> res3: Double = 1.4142156862745097
    sqrt(4)                                       //> res4: Double = 2.0000000929222947
    sqrt(16)                                      //> res5: Double = 4.000000636692939
    sqrt(25)                                      //> res6: Double = 5.000023178253949

    def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2
                                                  //> averageDamp: (f: Double => Double)(x: Double)Double

    def sqrt2(n: Double) = fixedPoint(averageDamp(x => n / x))(1)
                                                  //> sqrt2: (n: Double)Double

    sqrt2(2)                                      //> res7: Double = 1.4142156862745097
    

}