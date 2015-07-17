package week3

// Persistent data structure
abstract class IntSet {
    def contains(x: Int): Boolean
    def incl(x: Int): IntSet
    def union(that: IntSet): IntSet
}

class NonEmpty(e: Int, left: IntSet, right: IntSet) extends IntSet {

    def this(e: Int) = this(e, Empty, Empty)

    def contains(x: Int): Boolean = {
        //println("e: " + e + ", x: " + x)
        if (x < e) left contains x
        else if (x > e) right contains x
        else true
    }

    def incl(x: Int): IntSet = {
        //println("e: " + e + ", x: " + x)
        if (x < e) new NonEmpty(e, left incl x, right)
        else if (x > e) new NonEmpty(e, left, right incl x)
        else this
    }

    def union(that: IntSet) = {
        //println("e: (" + e + ") >> that: (" + that + ") >> left: (" + left + ") >> right: (" + right + ")")
        ((left union right) union that) incl e
    }

    override def toString = "{" + left + e + right + "}"
}

object Empty extends IntSet {
    def contains(x: Int): Boolean = false
    def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)
    def union(that: IntSet) = that
    override def toString = "."
}