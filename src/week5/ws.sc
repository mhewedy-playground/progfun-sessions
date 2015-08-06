//package week5
//object ws {

List(1, 3, 5).indexOf(1)

def f(x: Int): Int => Int = {
  y: Int => x * y
}

def f1 = f(10)

f1(5)
def g(x: Int)(y: Int) = {
  x * y
}

def g1 = g(10) _
def g2: Int => Int = g(10)
g1(5)

//}
