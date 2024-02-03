package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used for attributes of type SVGLengthList which can be animated.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedLengthList)
  */
trait SVGAnimatedLengthList extends StObject {
  
  /* standard dom */
  val animVal: org.scalajs.dom.SVGLengthList
  
  /* standard dom */
  val baseVal: org.scalajs.dom.SVGLengthList
}
object SVGAnimatedLengthList {
  
  inline def apply(animVal: org.scalajs.dom.SVGLengthList, baseVal: org.scalajs.dom.SVGLengthList): SVGAnimatedLengthList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedLengthList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGAnimatedLengthList] (val x: Self) extends AnyVal {
    
    inline def setAnimVal(value: org.scalajs.dom.SVGLengthList): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: org.scalajs.dom.SVGLengthList): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
