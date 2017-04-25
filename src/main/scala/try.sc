trait foo{
  def a = println("hello")
}
class fooFa{
  this: foo =>
  def b = {println("foofa");a}
}

trait foor extends foo{
  override def a = println("its changed to hi")
}


val temp = new fooFa with foo
val temp1 = new fooFa with foor

temp.b
temp1.b