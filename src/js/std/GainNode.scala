package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A change in volume. It is an AudioNode audio-processing module that causes a given gain to be applied to the input data before its propagation to the output. A GainNode always has exactly one input and one output, both with the same number of channels.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GainNode)
  */
@js.native
trait GainNode
  extends StObject
     with AudioNode {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GainNode/gain) */
  /* standard dom */
  val gain: org.scalajs.dom.AudioParam = js.native
}
