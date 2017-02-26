package nondefcons

import akka.actor.Actor

class NonDefaultConstructorActor(arg1:String) extends Actor {
  def receive: Receive = {
    case "argvalue" => println("Passed Argument = " + arg1)

    case _ =>
  }
}
