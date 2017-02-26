package nondefcons

import akka.actor.{ActorSystem, Props}

object Boot2 extends App {

  val system = ActorSystem()

  val twoArgConsActor = system.actorOf(Props(new TwoArgConstructorActor(8, "am coffee time")), name = "TwoArgConstructorActor")

  twoArgConsActor ! "intvalue"

  twoArgConsActor ! "strvalue"

}
