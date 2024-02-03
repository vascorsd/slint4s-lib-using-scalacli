package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry) */
trait ResizeObserverEntry extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry/borderBoxSize) */
  /* standard dom */
  val borderBoxSize: js.Array[ResizeObserverSize]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry/contentBoxSize) */
  /* standard dom */
  val contentBoxSize: js.Array[ResizeObserverSize]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry/contentRect) */
  /* standard dom */
  val contentRect: DOMRectReadOnly
  
  /* standard dom */
  val devicePixelContentBoxSize: js.Array[ResizeObserverSize]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry/target) */
  /* standard dom */
  val target: org.scalajs.dom.Element
}
object ResizeObserverEntry {
  
  inline def apply(
    borderBoxSize: js.Array[ResizeObserverSize],
    contentBoxSize: js.Array[ResizeObserverSize],
    contentRect: DOMRectReadOnly,
    devicePixelContentBoxSize: js.Array[ResizeObserverSize],
    target: org.scalajs.dom.Element
  ): ResizeObserverEntry = {
    val __obj = js.Dynamic.literal(borderBoxSize = borderBoxSize.asInstanceOf[js.Any], contentBoxSize = contentBoxSize.asInstanceOf[js.Any], contentRect = contentRect.asInstanceOf[js.Any], devicePixelContentBoxSize = devicePixelContentBoxSize.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeObserverEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResizeObserverEntry] (val x: Self) extends AnyVal {
    
    inline def setBorderBoxSize(value: js.Array[ResizeObserverSize]): Self = StObject.set(x, "borderBoxSize", value.asInstanceOf[js.Any])
    
    inline def setBorderBoxSizeVarargs(value: ResizeObserverSize*): Self = StObject.set(x, "borderBoxSize", js.Array(value*))
    
    inline def setContentBoxSize(value: js.Array[ResizeObserverSize]): Self = StObject.set(x, "contentBoxSize", value.asInstanceOf[js.Any])
    
    inline def setContentBoxSizeVarargs(value: ResizeObserverSize*): Self = StObject.set(x, "contentBoxSize", js.Array(value*))
    
    inline def setContentRect(value: DOMRectReadOnly): Self = StObject.set(x, "contentRect", value.asInstanceOf[js.Any])
    
    inline def setDevicePixelContentBoxSize(value: js.Array[ResizeObserverSize]): Self = StObject.set(x, "devicePixelContentBoxSize", value.asInstanceOf[js.Any])
    
    inline def setDevicePixelContentBoxSizeVarargs(value: ResizeObserverSize*): Self = StObject.set(x, "devicePixelContentBoxSize", js.Array(value*))
    
    inline def setTarget(value: org.scalajs.dom.Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
