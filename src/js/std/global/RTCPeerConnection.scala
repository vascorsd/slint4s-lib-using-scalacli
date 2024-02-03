package typings.std.global

import org.scalajs.dom.RTCConfiguration
import typings.std.AlgorithmIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCPeerConnection")
@js.native
/* standard dom */
open class RTCPeerConnection ()
  extends StObject
     with typings.std.RTCPeerConnection {
  def this(configuration: RTCConfiguration) = this()
}
object RTCPeerConnection {
  
  @JSGlobal("RTCPeerConnection")
  @js.native
  val ^ : js.Any = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/generateCertificate_static) */
  /* standard dom */
  inline def generateCertificate(keygenAlgorithm: AlgorithmIdentifier): js.Promise[typings.std.RTCCertificate] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateCertificate")(keygenAlgorithm.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.std.RTCCertificate]]
}
