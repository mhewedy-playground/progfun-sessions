
val xs = List(1, 3, 5, 6, 7, 10)

xs map (x => x * x) filter (_ > 15) foreach (println)


val s = "Hello, World"
s filter ( _.isUpper)


s filter(_.isUpper)
