package eventbus

import akka.actor.Actor


class EventPublisherActor(filterEventBus:FilterEventBus) extends Actor {

  def receive:Receive = {

    case filterEvent:FilterEvent =>  println("Published an event " + filterEvent)
      //publishes filterEvent on FilterEventBus
      filterEventBus.publish(filterEvent)

    case _ =>

  }

}
