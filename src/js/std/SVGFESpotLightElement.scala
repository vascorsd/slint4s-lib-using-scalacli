package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Corresponds to the <feSpotLight> element.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFESpotLightElement)
  */
@js.native
trait SVGFESpotLightElement
  extends StObject
     with SVGElement {
  
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
  val limitingConeAngle: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val pointsAtX: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val pointsAtY: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val pointsAtZ: org.scalajs.dom.SVGAnimatedNumber = js.native
  
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
  
  /* standard dom */
  val specularExponent: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val x: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val y: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val z: org.scalajs.dom.SVGAnimatedNumber = js.native
}
