package nondefcons

import akka.actor.{ActorSystem, Props}

object Boot1 extends App {

  val system = ActorSystem()

  val nonDefConsActor = system.actorOf(Props(new NonDefaultConstructorActor("SingleArgActor")), name = "NonDefaultConstructorActor")

  nonDefConsActor ! "argvalue"

}
