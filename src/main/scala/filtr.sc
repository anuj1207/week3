import objsets.{Empty, NonEmpty, Tweet}

val E = new Empty

val obj = new NonEmpty(new Tweet("a","",7), E, E)

val t1 = obj incl new Tweet("b","",4)

val t2 = t1.filterAcc((x: Tweet)=> x.retweets>5, E)

t2.foreach(println)