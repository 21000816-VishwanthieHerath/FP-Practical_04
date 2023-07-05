import scala.io.StdIn
object Question01 extends App {

    print("Enter deposit amount : ")
    val deposit = StdIn.readDouble()

    def interestPerYear(deposit: Double): Double = deposit match {

        case x if (x > 0 && x <= 20000) => x * 2.0 / 100
        case x if (x > 20000 && x <= 200000) => x * 4.0 / 100
        case x if (x > 200000 && x <= 2000000) => x * 3.5 / 100
        case x if (x > 2000000) => x * 6.5 / 100
        case _ => 0

    }

    println("Your interest per year is " + f"${interestPerYear(deposit)}%.2f")

}
