package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used for attributes which take a list of numbers and which can be animated.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedTransformList)
  */
trait SVGAnimatedTransformList extends StObject {
  
  /* standard dom */
  val animVal: org.scalajs.dom.SVGTransformList
  
  /* standard dom */
  val baseVal: org.scalajs.dom.SVGTransformList
}
object SVGAnimatedTransformList {
  
  inline def apply(animVal: org.scalajs.dom.SVGTransformList, baseVal: org.scalajs.dom.SVGTransformList): SVGAnimatedTransformList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedTransformList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGAnimatedTransformList] (val x: Self) extends AnyVal {
    
    inline def setAnimVal(value: org.scalajs.dom.SVGTransformList): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: org.scalajs.dom.SVGTransformList): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
