package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MessageChannel")
@js.native
/* standard dom */
open class MessageChannel ()
  extends StObject
     with typings.std.MessageChannel {
  
  /**
    * Returns the first MessagePort object.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageChannel/port1)
    */
  /* standard dom */
  /* CompleteClass */
  override val port1: org.scalajs.dom.MessagePort = js.native
  
  /**
    * Returns the second MessagePort object.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageChannel/port2)
    */
  /* standard dom */
  /* CompleteClass */
  override val port2: org.scalajs.dom.MessagePort = js.native
}
