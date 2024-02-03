package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the serializeToString() method to construct an XML string representing a DOM tree.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLSerializer)
  */
trait XMLSerializer extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLSerializer/serializeToString) */
  /* standard dom */
  def serializeToString(root: org.scalajs.dom.Node): java.lang.String
}
object XMLSerializer {
  
  inline def apply(serializeToString: org.scalajs.dom.Node => java.lang.String): XMLSerializer = {
    val __obj = js.Dynamic.literal(serializeToString = js.Any.fromFunction1(serializeToString))
    __obj.asInstanceOf[XMLSerializer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XMLSerializer] (val x: Self) extends AnyVal {
    
    inline def setSerializeToString(value: org.scalajs.dom.Node => java.lang.String): Self = StObject.set(x, "serializeToString", js.Any.fromFunction1(value))
  }
}
