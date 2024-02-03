package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WakeLockSentinelEventMap extends StObject {
  
  /* standard dom */
  var release: org.scalajs.dom.Event
}
object WakeLockSentinelEventMap {
  
  inline def apply(release: org.scalajs.dom.Event): WakeLockSentinelEventMap = {
    val __obj = js.Dynamic.literal(release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[WakeLockSentinelEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WakeLockSentinelEventMap] (val x: Self) extends AnyVal {
    
    inline def setRelease(value: org.scalajs.dom.Event): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
  }
}
