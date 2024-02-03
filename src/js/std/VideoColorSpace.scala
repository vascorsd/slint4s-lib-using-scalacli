package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace) */
trait VideoColorSpace extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/fullRange) */
  /* standard dom */
  val fullRange: scala.Boolean | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/matrix) */
  /* standard dom */
  val matrix: VideoMatrixCoefficients | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/primaries) */
  /* standard dom */
  val primaries: VideoColorPrimaries | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/toJSON) */
  /* standard dom */
  def toJSON(): VideoColorSpaceInit
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/transfer) */
  /* standard dom */
  val transfer: VideoTransferCharacteristics | Null
}
object VideoColorSpace {
  
  inline def apply(toJSON: () => VideoColorSpaceInit): VideoColorSpace = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON), fullRange = null, matrix = null, primaries = null, transfer = null)
    __obj.asInstanceOf[VideoColorSpace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoColorSpace] (val x: Self) extends AnyVal {
    
    inline def setFullRange(value: scala.Boolean): Self = StObject.set(x, "fullRange", value.asInstanceOf[js.Any])
    
    inline def setFullRangeNull: Self = StObject.set(x, "fullRange", null)
    
    inline def setMatrix(value: VideoMatrixCoefficients): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixNull: Self = StObject.set(x, "matrix", null)
    
    inline def setPrimaries(value: VideoColorPrimaries): Self = StObject.set(x, "primaries", value.asInstanceOf[js.Any])
    
    inline def setPrimariesNull: Self = StObject.set(x, "primaries", null)
    
    inline def setToJSON(value: () => VideoColorSpaceInit): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setTransfer(value: VideoTransferCharacteristics): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    inline def setTransferNull: Self = StObject.set(x, "transfer", null)
  }
}
