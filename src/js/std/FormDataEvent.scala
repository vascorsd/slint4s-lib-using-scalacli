package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormDataEvent) */
@js.native
trait FormDataEvent
  extends StObject
     with Event {
  
  /**
    * Returns a FormData object representing names and values of elements associated to the target form. Operations on the FormData object will affect form data to be submitted.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormDataEvent/formData)
    */
  /* standard dom */
  val formData: org.scalajs.dom.FormData = js.native
}
