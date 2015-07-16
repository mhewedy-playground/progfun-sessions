package week1

object Session {
    1 + 2                                         //> res0: Int(3) = 3

    def abs(x: Double) = if (x < 0) -x else x     //> abs: (x: Double)Double

    abs(-30)                                      //> res1: Double = 30.0
    abs(30)                                       //> res2: Double = 30.0
    abs(1e50)                                     //> res3: Double = 1.0E50
    abs(1e-50)                                    //> res4: Double = 1.0E-50
    abs(-1e50)                                    //> res5: Double = 1.0E50
    abs(-1e-50)                                   //> res6: Double = 1.0E-50

    printf("%.50f", abs(1e-40))                   //> 0.00000000000000000000000000000000000000010000000000
    printf("%f", abs(1e10))                       //> 10000000000.000000

    def sqrt(x: Double) = {

        def sqrtIter(guess: Double): Double =
            if (isGoodEnough(guess)) guess
            else sqrtIter(improve(guess))

        def isGoodEnough(guess: Double) =
            abs(guess * guess - x) / x < 1e-2

        def improve(guess: Double) =
            ((x / guess) + guess) / 2

        sqrtIter(1)
    }                                             //> sqrt: (x: Double)Double

    sqrt(2)                                       //> res7: Double = 1.4166666666666665
    sqrt(4)                                       //> res8: Double = 2.000609756097561
    sqrt(16)                                      //> res9: Double = 4.002257524798522
    sqrt(9)                                       //> res10: Double = 3.00009155413138
    printf("%.0e", sqrt(1e-6))                    //> 1e-03
    printf("%.0e", sqrt(1e60))                    //> 1e+30
    
    
    


    print()
}