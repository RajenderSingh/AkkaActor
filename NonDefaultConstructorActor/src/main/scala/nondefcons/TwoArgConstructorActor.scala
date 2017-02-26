package nondefcons

import akka.actor.Actor

class TwoArgConstructorActor(arg1:Int, arg2:String) extends Actor {
  def receive: Receive = {

    case "intvalue" => println("Passed Argument1 = " + arg1)

    case "strvalue" => println("Passed Argument2 = " + arg2)

    case _ =>
  }
}
