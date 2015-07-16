package week3.pkgs

class MyRational(x: Int, y: Int) {
    require(y != 0, "denominator should be positive")

    def this(x: Int) = this(x, x)

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    val numer = x / gcd(x, y)
    val denom = y / gcd(x, y)

    def +(that: MyRational) =
        new MyRational(this.numer * that.denom + that.numer * this.denom, this.denom * that.denom)

    def -(that: MyRational) = this + -that

    def unary_- : MyRational = new MyRational(-numer, denom)

    def <(that: MyRational) = this.numer * that.denom < this.denom * that.numer

    def max(that: MyRational) = if (this < that) that else this

    def *(that: MyRational) = new MyRational(this.numer * that.numer, this.denom * this.denom)

    override def toString = s"$numer / $denom"
}