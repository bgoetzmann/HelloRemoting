package service

import akka.actor.{ActorSystem, Props}

object Main extends App {
  val system = ActorSystem("ServiceSystem")
  val service = system.actorOf(Props[ServiceActor], name="service")
  service ! messages.Start(Seq.empty)
}
