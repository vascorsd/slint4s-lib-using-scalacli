package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allowed ArrayBuffer types for the buffer of an ArrayBufferView and related Typed Arrays.
  */
trait ArrayBufferTypes extends StObject {
  
  /* standard es5 */
  var ArrayBuffer: js.typedarray.ArrayBuffer
}
object ArrayBufferTypes {
  
  inline def apply(ArrayBuffer: js.typedarray.ArrayBuffer): ArrayBufferTypes = {
    val __obj = js.Dynamic.literal(ArrayBuffer = ArrayBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayBufferTypes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayBufferTypes] (val x: Self) extends AnyVal {
    
    inline def setArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "ArrayBuffer", value.asInstanceOf[js.Any])
  }
}
