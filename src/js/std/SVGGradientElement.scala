package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The SVGGradient interface is a base interface used by SVGLinearGradientElement and SVGRadialGradientElement.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGradientElement)
  */
@js.native
trait SVGGradientElement
  extends StObject
     with SVGElement
     with SVGURIReference {
  
  /* standard dom */
  val SVG_SPREADMETHOD_PAD: `1` = js.native
  
  /* standard dom */
  val SVG_SPREADMETHOD_REFLECT: `2` = js.native
  
  /* standard dom */
  val SVG_SPREADMETHOD_REPEAT: `3` = js.native
  
  /* standard dom */
  val SVG_SPREADMETHOD_UNKNOWN: `0` = js.native
  
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
  val gradientTransform: org.scalajs.dom.SVGAnimatedTransformList = js.native
  
  /* standard dom */
  val gradientUnits: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
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
  val spreadMethod: org.scalajs.dom.SVGAnimatedEnumeration = js.native
}
