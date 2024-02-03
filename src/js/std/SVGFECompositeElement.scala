package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import typings.std.stdInts.`4`
import typings.std.stdInts.`5`
import typings.std.stdInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Corresponds to the <feComposite> element.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement)
  */
@js.native
trait SVGFECompositeElement
  extends StObject
     with SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  
  /* standard dom */
  val SVG_FECOMPOSITE_OPERATOR_ARITHMETIC: `6` = js.native
  
  /* standard dom */
  val SVG_FECOMPOSITE_OPERATOR_ATOP: `4` = js.native
  
  /* standard dom */
  val SVG_FECOMPOSITE_OPERATOR_IN: `2` = js.native
  
  /* standard dom */
  val SVG_FECOMPOSITE_OPERATOR_OUT: `3` = js.native
  
  /* standard dom */
  val SVG_FECOMPOSITE_OPERATOR_OVER: `1` = js.native
  
  /* standard dom */
  val SVG_FECOMPOSITE_OPERATOR_UNKNOWN: `0` = js.native
  
  /* standard dom */
  val SVG_FECOMPOSITE_OPERATOR_XOR: `5` = js.native
  
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
  val in1: org.scalajs.dom.SVGAnimatedString = js.native
  
  /* standard dom */
  val in2: org.scalajs.dom.SVGAnimatedString = js.native
  
  /* standard dom */
  val k1: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val k2: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val k3: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val k4: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val operator: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
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
