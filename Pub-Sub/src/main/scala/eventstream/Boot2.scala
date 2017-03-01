package eventstream

import akka.actor.{ActorSystem, Props}


object Boot2 extends App {

  val system = ActorSystem("Pub-Sub-System")

  val publisherActorRef = system.actorOf(Props[PublisherActor], name = "publisherActor")

  val subscribersActorRef1 = system.actorOf(Props(new SubscribersActor("subscribersActor1")), name = "subscribersActor1")
  val subscribersActorRef2 = system.actorOf(Props(new SubscribersActor("subscribersActor2")), name = "subscribersActor2")
  val subscribersActorRef3 = system.actorOf(Props(new SubscribersActor("subscribersActor3")), name = "subscribersActor3")

  publisherActorRef ! Event("second")

}
