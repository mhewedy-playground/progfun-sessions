package week3

object intset2 {

    val s = new NonEmpty(7).incl(5).incl(12).incl(9).incl(13).incl(3)
                                                  //> s  : week3.IntSet = {{{.3.}5.}7{{.9.}12{.13.}}}

    s.contains(9)                                 //> res0: Boolean = true

    val s2 = new NonEmpty(70).incl(52)            //> s2  : week3.IntSet = {{.52.}70.}

    s.union(s2)                                   //> res1: week3.IntSet = {{{{.3.}5{{.7.}9{{.12.}13.}}}52.}70.}

}