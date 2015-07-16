package week3

object intset2 {

    val s = new NonEmpty(7).incl(5).incl(12).incl(9).incl(13).incl(3)
                                                  //> s  : week3.IntSet = {{{.3.}5.}7{{.9.}12{.13.}}}

    s.contains(9)                                 //> res0: Boolean = true

    val s2 = new NonEmpty(70).incl(52)            //> s2  : week3.IntSet = {{.52.}70.}

    s.union(s2)                                   //> res1: week3.IntSet = {{{{.3.}5{{.7.}9{{.12.}13.}}}52.}70.}
    
    
    
}

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