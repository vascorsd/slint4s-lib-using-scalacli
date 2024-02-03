package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used for attributes of basic type <length> which can be animated.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedLength)
  */
trait SVGAnimatedLength extends StObject {
  
  /* standard dom */
  val animVal: org.scalajs.dom.SVGLength
  
  /* standard dom */
  val baseVal: org.scalajs.dom.SVGLength
}
object SVGAnimatedLength {
  
  inline def apply(animVal: org.scalajs.dom.SVGLength, baseVal: org.scalajs.dom.SVGLength): SVGAnimatedLength = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedLength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGAnimatedLength] (val x: Self) extends AnyVal {
    
    inline def setAnimVal(value: org.scalajs.dom.SVGLength): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: org.scalajs.dom.SVGLength): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
