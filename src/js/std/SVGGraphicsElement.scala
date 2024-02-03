package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SVG elements whose primary purpose is to directly render graphics into a group.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement)
  */
@js.native
trait SVGGraphicsElement
  extends StObject
     with SVGElement
     with SVGTests {
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement/getBBox) */
  /* standard dom */
  def getBBox(): org.scalajs.dom.DOMRect = js.native
  def getBBox(options: SVGBoundingBoxOptions): org.scalajs.dom.DOMRect = js.native
  
  /* standard dom */
  def getCTM(): DOMMatrix | Null = js.native
  
  /* standard dom */
  def getScreenCTM(): DOMMatrix | Null = js.native
  
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
  val transform: org.scalajs.dom.SVGAnimatedTransformList = js.native
}
