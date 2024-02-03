package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdStrings.error
import typings.std.stdStrings.message
import typings.std.stdStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource) */
@js.native
trait EventSource
  extends StObject
     with EventTarget {
  
  /* standard dom */
  val CLOSED: `2` = js.native
  
  /* standard dom */
  val CONNECTING: `0` = js.native
  
  /* standard dom */
  val OPEN: `1` = js.native
  
  /* standard dom */
  def addEventListener(
    `type`: java.lang.String,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ org.scalajs.dom.MessageEvent, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ org.scalajs.dom.MessageEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ org.scalajs.dom.MessageEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MessageEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MessageEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MessageEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(
    `type`: open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(
    `type`: open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(
    `type`: open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Aborts any instances of the fetch algorithm started for this EventSource object, and sets the readyState attribute to CLOSED.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/close)
    */
  /* standard dom */
  def close(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/error_event) */
  /* standard dom */
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/message_event) */
  /* standard dom */
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MessageEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/open_event) */
  /* standard dom */
  var onopen: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Returns the state of this EventSource object's connection. It can have the values described below.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/readyState)
    */
  /* standard dom */
  val readyState: Double = js.native
  
  /* standard dom */
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ org.scalajs.dom.MessageEvent, Any]
  ): Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ org.scalajs.dom.MessageEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ org.scalajs.dom.MessageEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MessageEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MessageEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MessageEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(
    `type`: open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(
    `type`: open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(
    `type`: open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /**
    * Returns the URL providing the event stream.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/url)
    */
  /* standard dom */
  val url: java.lang.String = js.native
  
  /**
    * Returns true if the credentials mode for connection requests to the URL providing the event stream is set to "include", and false otherwise.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/withCredentials)
    */
  /* standard dom */
  val withCredentials: scala.Boolean = js.native
}
