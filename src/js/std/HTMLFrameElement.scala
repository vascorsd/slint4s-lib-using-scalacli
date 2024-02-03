package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFrameElement)
  */
@js.native
trait HTMLFrameElement
  extends StObject
     with HTMLElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Retrieves the document object of the page or frame.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFrameElement/contentDocument)
    */
  /* standard dom */
  val contentDocument: org.scalajs.dom.Document | Null = js.native
  
  /**
    * Retrieves the object of the specified.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFrameElement/contentWindow)
    */
  /* standard dom */
  val contentWindow: org.scalajs.dom.Window | Null = js.native
  
  /**
    * Sets or retrieves whether to display a border for the frame.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFrameElement/frameBorder)
    */
  /* standard dom */
  var frameBorder: java.lang.String = js.native
  
  /**
    * Sets or retrieves a URI to a long description of the object.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFrameElement/longDesc)
    */
  /* standard dom */
  var longDesc: java.lang.String = js.native
  
  /**
    * Sets or retrieves the top and bottom margin heights before displaying the text in a frame.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFrameElement/marginHeight)
    */
  /* standard dom */
  var marginHeight: java.lang.String = js.native
  
  /**
    * Sets or retrieves the left and right margin widths before displaying the text in a frame.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFrameElement/marginWidth)
    */
  /* standard dom */
  var marginWidth: java.lang.String = js.native
  
  /**
    * Sets or retrieves the frame name.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFrameElement/name)
    */
  /* standard dom */
  var name: java.lang.String = js.native
  
  /**
    * Sets or retrieves whether the user can resize the frame.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFrameElement/noResize)
    */
  /* standard dom */
  var noResize: scala.Boolean = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  
  /**
    * Sets or retrieves whether the frame can be scrolled.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFrameElement/scrolling)
    */
  /* standard dom */
  var scrolling: java.lang.String = js.native
  
  /**
    * Sets or retrieves a URL to be loaded by the object.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFrameElement/src)
    */
  /* standard dom */
  var src: java.lang.String = js.native
}
