import scala.io.StdIn
object Question02 extends App {

    print("Enter an integer : ")
    val integer = StdIn.readInt()

    def patternMatch(integer: Int): String = integer match
        case x if x < 0 => "Negative number"
        case x if x == 0 => "Zero"
        case x if x % 2 == 0 => "Even number"
        case x if x % 2 != 0 => "Odd number"
    
    println(patternMatch(integer) + " is given.")

}
