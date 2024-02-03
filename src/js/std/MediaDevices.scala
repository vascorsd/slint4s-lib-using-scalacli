package typings.std

import typings.std.stdStrings.devicechange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to connected media input devices like cameras and microphones, as well as screen sharing. In essence, it lets you obtain access to any hardware source of media data.
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices)
  */
@js.native
trait MediaDevices
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/enumerateDevices) */
  /* standard dom */
  def enumerateDevices(): js.Promise[js.Array[org.scalajs.dom.MediaDeviceInfo]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getDisplayMedia) */
  /* standard dom */
  def getDisplayMedia(): js.Promise[org.scalajs.dom.MediaStream] = js.native
  def getDisplayMedia(options: DisplayMediaStreamOptions): js.Promise[org.scalajs.dom.MediaStream] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getSupportedConstraints) */
  /* standard dom */
  def getSupportedConstraints(): org.scalajs.dom.MediaTrackSupportedConstraints = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getUserMedia) */
  /* standard dom */
  def getUserMedia(): js.Promise[org.scalajs.dom.MediaStream] = js.native
  def getUserMedia(constraints: org.scalajs.dom.MediaStreamConstraints): js.Promise[org.scalajs.dom.MediaStream] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/devicechange_event) */
  /* standard dom */
  var ondevicechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
}
