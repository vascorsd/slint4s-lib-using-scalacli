package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The position and orientation of the unique person listening to the audio scene, and is used in audio spatialization. All PannerNodes spatialize in relation to the AudioListener stored in the BaseAudioContext.listener attribute.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener)
  */
trait AudioListener extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/forwardX) */
  /* standard dom */
  val forwardX: org.scalajs.dom.AudioParam
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/forwardY) */
  /* standard dom */
  val forwardY: org.scalajs.dom.AudioParam
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/forwardZ) */
  /* standard dom */
  val forwardZ: org.scalajs.dom.AudioParam
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/positionX) */
  /* standard dom */
  val positionX: org.scalajs.dom.AudioParam
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/positionY) */
  /* standard dom */
  val positionY: org.scalajs.dom.AudioParam
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/positionZ) */
  /* standard dom */
  val positionZ: org.scalajs.dom.AudioParam
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/setOrientation)
    */
  /* standard dom */
  def setOrientation(x: Double, y: Double, z: Double, xUp: Double, yUp: Double, zUp: Double): Unit
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/setPosition)
    */
  /* standard dom */
  def setPosition(x: Double, y: Double, z: Double): Unit
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/upX) */
  /* standard dom */
  val upX: org.scalajs.dom.AudioParam
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/upY) */
  /* standard dom */
  val upY: org.scalajs.dom.AudioParam
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/upZ) */
  /* standard dom */
  val upZ: org.scalajs.dom.AudioParam
}
object AudioListener {
  
  inline def apply(
    forwardX: org.scalajs.dom.AudioParam,
    forwardY: org.scalajs.dom.AudioParam,
    forwardZ: org.scalajs.dom.AudioParam,
    positionX: org.scalajs.dom.AudioParam,
    positionY: org.scalajs.dom.AudioParam,
    positionZ: org.scalajs.dom.AudioParam,
    setOrientation: (Double, Double, Double, Double, Double, Double) => Unit,
    setPosition: (Double, Double, Double) => Unit,
    upX: org.scalajs.dom.AudioParam,
    upY: org.scalajs.dom.AudioParam,
    upZ: org.scalajs.dom.AudioParam
  ): AudioListener = {
    val __obj = js.Dynamic.literal(forwardX = forwardX.asInstanceOf[js.Any], forwardY = forwardY.asInstanceOf[js.Any], forwardZ = forwardZ.asInstanceOf[js.Any], positionX = positionX.asInstanceOf[js.Any], positionY = positionY.asInstanceOf[js.Any], positionZ = positionZ.asInstanceOf[js.Any], setOrientation = js.Any.fromFunction6(setOrientation), setPosition = js.Any.fromFunction3(setPosition), upX = upX.asInstanceOf[js.Any], upY = upY.asInstanceOf[js.Any], upZ = upZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioListener] (val x: Self) extends AnyVal {
    
    inline def setForwardX(value: org.scalajs.dom.AudioParam): Self = StObject.set(x, "forwardX", value.asInstanceOf[js.Any])
    
    inline def setForwardY(value: org.scalajs.dom.AudioParam): Self = StObject.set(x, "forwardY", value.asInstanceOf[js.Any])
    
    inline def setForwardZ(value: org.scalajs.dom.AudioParam): Self = StObject.set(x, "forwardZ", value.asInstanceOf[js.Any])
    
    inline def setPositionX(value: org.scalajs.dom.AudioParam): Self = StObject.set(x, "positionX", value.asInstanceOf[js.Any])
    
    inline def setPositionY(value: org.scalajs.dom.AudioParam): Self = StObject.set(x, "positionY", value.asInstanceOf[js.Any])
    
    inline def setPositionZ(value: org.scalajs.dom.AudioParam): Self = StObject.set(x, "positionZ", value.asInstanceOf[js.Any])
    
    inline def setSetOrientation(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setOrientation", js.Any.fromFunction6(value))
    
    inline def setSetPosition(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction3(value))
    
    inline def setUpX(value: org.scalajs.dom.AudioParam): Self = StObject.set(x, "upX", value.asInstanceOf[js.Any])
    
    inline def setUpY(value: org.scalajs.dom.AudioParam): Self = StObject.set(x, "upY", value.asInstanceOf[js.Any])
    
    inline def setUpZ(value: org.scalajs.dom.AudioParam): Self = StObject.set(x, "upZ", value.asInstanceOf[js.Any])
  }
}
