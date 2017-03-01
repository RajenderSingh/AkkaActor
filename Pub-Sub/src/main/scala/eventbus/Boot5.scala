package eventbus

import akka.actor.{ActorSystem, Props}


object Boot5 extends App {

  val system = ActorSystem("EventBus-Pub-Sub-System")

  //create an event
  val event1 = FilterEvent("E1001", "message1")
  //create event bus
  val filterEventBus = new FilterEventBus(event1.message)
  //create publisher and pass eventbus to it
  val eventPublisherActorRef = system.actorOf(Props(new EventPublisherActor(filterEventBus)), name = "eventPublisherActor")
  //create subscribers
  val eventSubscriberActorRef1 = system.actorOf(Props[EventSubscriberActor], name = "eventSubscriberActor1")
  val eventSubscriberActorRef2 = system.actorOf(Props[EventSubscriberActor], name = "eventSubscriberActor2")

  //get matching conditions from vent bus classify method as last argument is true
  filterEventBus.subscribe(eventSubscriberActorRef1, true)
  //get non matching conditions from vent bus classify method as last argument is false
  filterEventBus.subscribe(eventSubscriberActorRef2, false)

  eventPublisherActorRef ! event1

  Thread.sleep(2000)

  val event2 = FilterEvent("E1002", "message2")
  eventPublisherActorRef ! event2

}
