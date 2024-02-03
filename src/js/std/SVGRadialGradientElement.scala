package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Corresponds to the <RadialGradient> element.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGRadialGradientElement)
  */
@js.native
trait SVGRadialGradientElement
  extends StObject
     with SVGGradientElement {
  
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
  
  /* standard dom */
  val cx: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard dom */
  val cy: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard dom */
  val fr: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard dom */
  val fx: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard dom */
  val fy: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard dom */
  val r: org.scalajs.dom.SVGAnimatedLength = js.native
  
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
}
