package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gives access to properties specific to <label> elements. It inherits methods and properties from the base HTMLElement interface.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLabelElement)
  */
@js.native
trait HTMLLabelElement
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
    * Returns the form control that is associated with this element.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLabelElement/control)
    */
  /* standard dom */
  val control: org.scalajs.dom.HTMLElement | Null = js.native
  
  /**
    * Retrieves a reference to the form that the object is embedded in.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLabelElement/form)
    */
  /* standard dom */
  val form: org.scalajs.dom.HTMLFormElement | Null = js.native
  
  /**
    * Sets or retrieves the object to which the given label object is assigned.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLabelElement/htmlFor)
    */
  /* standard dom */
  var htmlFor: java.lang.String = js.native
  
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
