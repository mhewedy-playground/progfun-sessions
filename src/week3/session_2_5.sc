package week3

object session_2_5 {

    val x = new Rational(1, 3)                    //> x  : week3.Rational = 1 / 3
    val y = new Rational(5, 7)                    //> y  : week3.Rational = 5 / 7
    val z = new Rational(3, 2)                    //> z  : week3.Rational = 3 / 2

    -x                                            //> res0: week3.Rational = 1 / -3
    -y                                            //> res1: week3.Rational = 5 / -7
    -z                                            //> res2: week3.Rational = 3 / -2

    x - y - z                                     //> res3: week3.Rational = -79 / 42

    x < y                                         //> res4: Boolean = true
    x max y                                       //> res5: week3.Rational = 5 / 7
    z max x                                       //> res6: week3.Rational = 3 / 2

    (x + y) * (z + y)                             //> res7: week3.Rational = 682 / 441
}

class Rational(x: Int, y: Int) {
    require(y != 0, "denominator should be positive")

    def this(x: Int) = this(x, x)

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    val numer = x / gcd(x, y)
    val denom = y / gcd(x, y)

    def +(that: Rational) =
        new Rational(this.numer * that.denom + that.numer * this.denom,
            this.denom * that.denom)

    def -(that: Rational) = this + -that

    def unary_- : Rational = new Rational(-numer, denom)

    def <(that: Rational) = this.numer * that.denom < this.denom * that.numer

    def max(that: Rational) = if (this < that) that else this

    def *(that: Rational) = new Rational((this.numer * that.numer), (this.denom * this.denom))

    override def toString = s"$numer / $denom"

}