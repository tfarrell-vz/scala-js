package tutorial.webapp

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport
import org.scalajs.dom
import dom.document

object TutorialApp extends JSApp {
  def main(): Unit = {
    appendPar(document.body, "Hello world!")
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }

  @JSExport
  def addClickedMessage(): Unit = {
    appendPar(document.body, "You clicked the button!")
  }
}

// vim: set ts=2 sw=2 et sts=2:
