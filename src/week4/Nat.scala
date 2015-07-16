package week4

// Peano Numbers
abstract class Nat {

    def isZero: Boolean
    def predecessor: Nat
    def succ: Nat = new Succ(this)
    def +(that: Nat): Nat
    def -(that: Nat): Nat
}

object Zero extends Nat {

    def isZero: Boolean = true
    def predecessor: Nothing = throw new RuntimeException
    def +(that: Nat): Nat = that
    def -(that: Nat): Nat = if (that.isZero) that else throw new RuntimeException

    override def toString = "0"
}

class Succ(n: Nat) extends Nat {

    def isZero: Boolean = false
    def predecessor: Nat = n

    def +(that: Nat): Nat =
        if (that.isZero) return this
        else new Succ(this + that.predecessor)

    def -(that: Nat): Nat =
        if (that.isZero) return this
        else n - that.predecessor

    // just for demonstration
    override def toString = {
        def loop(cnt: Int, n: Nat): Int =
            if (n == Zero) cnt
            else loop(cnt + 1, n.predecessor)
        loop(0, this) + ""
    }
}

