package typings.std

import typings.std.stdInts.`0x8B8B`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The OES_standard_derivatives extension is part of the WebGL API and adds the GLSL derivative functions dFdx, dFdy, and fwidth.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_standard_derivatives)
  */
trait OESStandardDerivatives extends StObject {
  
  /* standard dom */
  val FRAGMENT_SHADER_DERIVATIVE_HINT_OES: `0x8B8B`
}
object OESStandardDerivatives {
  
  inline def apply(): OESStandardDerivatives = {
    val __obj = js.Dynamic.literal(FRAGMENT_SHADER_DERIVATIVE_HINT_OES = 0x8B8B)
    __obj.asInstanceOf[OESStandardDerivatives]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OESStandardDerivatives] (val x: Self) extends AnyVal {
    
    inline def setFRAGMENT_SHADER_DERIVATIVE_HINT_OES(value: `0x8B8B`): Self = StObject.set(x, "FRAGMENT_SHADER_DERIVATIVE_HINT_OES", value.asInstanceOf[js.Any])
  }
}
