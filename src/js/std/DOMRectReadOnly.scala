package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly) */
trait DOMRectReadOnly extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/bottom) */
  /* standard dom */
  val bottom: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/height) */
  /* standard dom */
  val height: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/left) */
  /* standard dom */
  val left: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/right) */
  /* standard dom */
  val right: Double
  
  /* standard dom */
  def toJSON(): Any
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/top) */
  /* standard dom */
  val top: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/width) */
  /* standard dom */
  val width: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/x) */
  /* standard dom */
  val x: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/y) */
  /* standard dom */
  val y: Double
}
object DOMRectReadOnly {
  
  inline def apply(
    bottom: Double,
    height: Double,
    left: Double,
    right: Double,
    toJSON: () => Any,
    top: Double,
    width: Double,
    x: Double,
    y: Double
  ): DOMRectReadOnly = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMRectReadOnly]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DOMRectReadOnly] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
