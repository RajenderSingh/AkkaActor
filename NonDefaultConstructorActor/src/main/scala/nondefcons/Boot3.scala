package nondefcons

import akka.actor.{ActorSystem, Props}

object Boot3 extends App {

  val system = ActorSystem()
  val nonDefConsActor = system.actorOf(Props(new NonDefaultConstructorActor("SingleArgActor")), name = "NonDefaultConstructorActor")
  nonDefConsActor ! "argvalue"

  val twoArgConsActor = system.actorOf(Props(new TwoArgConstructorActor(8, " am coffee time")), name = "TwoArgConstructorActor")
  twoArgConsActor ! "intvalue"
  twoArgConsActor ! "strvalue"

}
