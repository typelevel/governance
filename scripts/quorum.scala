@main def votes(members: Int): Unit = {
  def majority(n: Int) = math.floor(n * 0.5).toInt + 1
  def supermajority(n: Int) = math.ceil(n * 0.75).toInt

  val quorum = majority(members)

  println(s"Quorum is $quorum of $members members")
  println()
  println("Majority: ")
  for (n <- quorum to members) {
    println(s"* ${majority(n)} of $n")
  }
  println()
  println("Three-fourths:")
  for (n <- quorum to members) {
    println(s"* ${supermajority(n)} of $n")
  }
}
