package week4

object ReviewCurrying {

    def fx(a: Int)(f: Int => Int) = f(a)          //> fx: (a: Int)(f: Int => Int)Int
    
    fx(10) _                                      //> res0: (Int => Int) => Int = <function1>

    fx(10) {
        x => x + 1
    }                                             //> res1: Int = 11

    fx { 100 } {
        x => x / 2
    }                                             //> res2: Int = 50
}