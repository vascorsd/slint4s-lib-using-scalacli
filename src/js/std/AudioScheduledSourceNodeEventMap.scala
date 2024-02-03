package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioScheduledSourceNodeEventMap extends StObject {
  
  /* standard dom */
  var ended: org.scalajs.dom.Event
}
object AudioScheduledSourceNodeEventMap {
  
  inline def apply(ended: org.scalajs.dom.Event): AudioScheduledSourceNodeEventMap = {
    val __obj = js.Dynamic.literal(ended = ended.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioScheduledSourceNodeEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioScheduledSourceNodeEventMap] (val x: Self) extends AnyVal {
    
    inline def setEnded(value: org.scalajs.dom.Event): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
  }
}
