package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo)
  */
trait InputDeviceInfo
  extends StObject
     with MediaDeviceInfo {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo/getCapabilities) */
  /* standard dom */
  def getCapabilities(): MediaTrackCapabilities
}
object InputDeviceInfo {
  
  inline def apply(
    deviceId: java.lang.String,
    getCapabilities: () => MediaTrackCapabilities,
    groupId: java.lang.String,
    kind: org.scalajs.dom.MediaDeviceKind,
    label: java.lang.String,
    toJSON: () => Any
  ): InputDeviceInfo = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], getCapabilities = js.Any.fromFunction0(getCapabilities), groupId = groupId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[InputDeviceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputDeviceInfo] (val x: Self) extends AnyVal {
    
    inline def setGetCapabilities(value: () => MediaTrackCapabilities): Self = StObject.set(x, "getCapabilities", js.Any.fromFunction0(value))
  }
}
