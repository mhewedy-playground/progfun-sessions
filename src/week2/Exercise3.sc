package week2

object Exercise3 {

    def product(f: Int => Int)(a: Int, b: Int): Int =
        if (a > b) 1
        else f(a) * product(f)(a + 1, b)          //> product: (f: Int => Int)(a: Int, b: Int)Int

    product(x => x)(1, 3)                         //> res0: Int = 6
    product(x => x)(1, 5)                         //> res1: Int = 120

    def fact(x: Int) = product(x => x)(1, x)      //> fact: (x: Int)Int
    fact(5)                                       //> res2: Int = 120

    def factSqr(x: Int) = product(x => x * x)(1, x)
                                                  //> factSqr: (x: Int)Int

    factSqr(8)                                    //> res3: Int = 1625702400

    def idProduct = product(x => x) _             //> idProduct: => (Int, Int) => Int
    idProduct(3, 4)                               //> res4: Int = 12

    def mapReduct(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
        if (a > b) zero
        else combine(f(a), mapReduct(f, combine, zero)(a + 1, b))
                                                  //> mapReduct: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int

    def product2(f: Int => Int)(a: Int, b: Int): Int = mapReduct(f, (a, b) => a * b, 1)(a, b)
                                                  //> product2: (f: Int => Int)(a: Int, b: Int)Int

    product2(x => x)(1, 3)                        //> res5: Int = 6
    product2(x => x)(1, 5)                        //> res6: Int = 120
}