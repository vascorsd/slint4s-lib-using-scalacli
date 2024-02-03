package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A screen, usually the one on which the current window is being rendered, and is obtained using window.screen.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen)
  */
trait Screen extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/availHeight) */
  /* standard dom */
  val availHeight: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/availWidth) */
  /* standard dom */
  val availWidth: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/colorDepth) */
  /* standard dom */
  val colorDepth: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/height) */
  /* standard dom */
  val height: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/orientation) */
  /* standard dom */
  val orientation: ScreenOrientation
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/pixelDepth) */
  /* standard dom */
  val pixelDepth: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/width) */
  /* standard dom */
  val width: Double
}
object Screen {
  
  inline def apply(
    availHeight: Double,
    availWidth: Double,
    colorDepth: Double,
    height: Double,
    orientation: ScreenOrientation,
    pixelDepth: Double,
    width: Double
  ): Screen = {
    val __obj = js.Dynamic.literal(availHeight = availHeight.asInstanceOf[js.Any], availWidth = availWidth.asInstanceOf[js.Any], colorDepth = colorDepth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], pixelDepth = pixelDepth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Screen] (val x: Self) extends AnyVal {
    
    inline def setAvailHeight(value: Double): Self = StObject.set(x, "availHeight", value.asInstanceOf[js.Any])
    
    inline def setAvailWidth(value: Double): Self = StObject.set(x, "availWidth", value.asInstanceOf[js.Any])
    
    inline def setColorDepth(value: Double): Self = StObject.set(x, "colorDepth", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: ScreenOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setPixelDepth(value: Double): Self = StObject.set(x, "pixelDepth", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
