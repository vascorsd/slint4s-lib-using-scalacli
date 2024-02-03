package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayBufferView extends StObject {
  
  /**
    * The ArrayBuffer instance referenced by the array.
    */
  /* standard es5 */
  var buffer: js.typedarray.ArrayBuffer
  
  /**
    * The length in bytes of the array.
    */
  /* standard es5 */
  var byteLength: Double
  
  /**
    * The offset in bytes of the array.
    */
  /* standard es5 */
  var byteOffset: Double
}
object ArrayBufferView {
  
  inline def apply(buffer: js.typedarray.ArrayBuffer, byteLength: Double, byteOffset: Double): ArrayBufferView = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], byteLength = byteLength.asInstanceOf[js.Any], byteOffset = byteOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayBufferView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayBufferView] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
    
    inline def setByteOffset(value: Double): Self = StObject.set(x, "byteOffset", value.asInstanceOf[js.Any])
  }
}
