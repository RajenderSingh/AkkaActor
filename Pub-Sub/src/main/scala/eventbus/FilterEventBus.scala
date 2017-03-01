package eventbus

import akka.event.{ActorEventBus, LookupClassification}

case class FilterEvent(id:String, message:String)

class FilterEventBus(message:String) extends ActorEventBus with LookupClassification {

  type Event = FilterEvent
  type Classifier = Boolean
  //type Subscriber = ActorRef //not needed as ActorEventBus is used where the Subscriber type is ActorRef

  /**
    * This is a size hint for the number of Classifiers you expect to have (use powers of 2)
    */
  protected def mapSize(): Int = {
    2
  }

  /**
    * Returns the Classifier associated with the given Event
    */
  protected def classify(event: Event): Classifier = {
    event.message.contains(message)
  }

  /**
    * Publishes the given Event to the given Subscriber
    */
  protected def publish(event: Event, subscriber: Subscriber): Unit = {
    subscriber ! event
  }
}
