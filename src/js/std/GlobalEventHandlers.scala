package typings.std

import typings.std.stdStrings.abort
import typings.std.stdStrings.animationcancel
import typings.std.stdStrings.animationend
import typings.std.stdStrings.animationiteration
import typings.std.stdStrings.animationstart
import typings.std.stdStrings.auxclick
import typings.std.stdStrings.beforeinput
import typings.std.stdStrings.blur
import typings.std.stdStrings.cancel
import typings.std.stdStrings.canplay
import typings.std.stdStrings.canplaythrough
import typings.std.stdStrings.change
import typings.std.stdStrings.click
import typings.std.stdStrings.close
import typings.std.stdStrings.compositionend
import typings.std.stdStrings.compositionstart
import typings.std.stdStrings.compositionupdate
import typings.std.stdStrings.contextmenu
import typings.std.stdStrings.copy
import typings.std.stdStrings.cuechange
import typings.std.stdStrings.cut
import typings.std.stdStrings.dblclick
import typings.std.stdStrings.drag
import typings.std.stdStrings.dragend
import typings.std.stdStrings.dragenter
import typings.std.stdStrings.dragleave
import typings.std.stdStrings.dragover
import typings.std.stdStrings.dragstart
import typings.std.stdStrings.drop
import typings.std.stdStrings.durationchange
import typings.std.stdStrings.emptied
import typings.std.stdStrings.ended
import typings.std.stdStrings.error
import typings.std.stdStrings.focus
import typings.std.stdStrings.focusin
import typings.std.stdStrings.focusout
import typings.std.stdStrings.formdata
import typings.std.stdStrings.gotpointercapture
import typings.std.stdStrings.input
import typings.std.stdStrings.invalid
import typings.std.stdStrings.keydown
import typings.std.stdStrings.keypress
import typings.std.stdStrings.keyup
import typings.std.stdStrings.load
import typings.std.stdStrings.loadeddata
import typings.std.stdStrings.loadedmetadata
import typings.std.stdStrings.loadstart
import typings.std.stdStrings.lostpointercapture
import typings.std.stdStrings.mousedown
import typings.std.stdStrings.mouseenter
import typings.std.stdStrings.mouseleave
import typings.std.stdStrings.mousemove
import typings.std.stdStrings.mouseout
import typings.std.stdStrings.mouseover
import typings.std.stdStrings.mouseup
import typings.std.stdStrings.paste
import typings.std.stdStrings.pause
import typings.std.stdStrings.play
import typings.std.stdStrings.playing
import typings.std.stdStrings.pointercancel
import typings.std.stdStrings.pointerdown
import typings.std.stdStrings.pointerenter
import typings.std.stdStrings.pointerleave
import typings.std.stdStrings.pointermove
import typings.std.stdStrings.pointerout
import typings.std.stdStrings.pointerover
import typings.std.stdStrings.pointerup
import typings.std.stdStrings.progress
import typings.std.stdStrings.ratechange
import typings.std.stdStrings.reset
import typings.std.stdStrings.resize
import typings.std.stdStrings.scroll
import typings.std.stdStrings.scrollend
import typings.std.stdStrings.securitypolicyviolation
import typings.std.stdStrings.seeked
import typings.std.stdStrings.seeking
import typings.std.stdStrings.select
import typings.std.stdStrings.selectionchange
import typings.std.stdStrings.selectstart
import typings.std.stdStrings.slotchange
import typings.std.stdStrings.stalled
import typings.std.stdStrings.submit
import typings.std.stdStrings.suspend
import typings.std.stdStrings.timeupdate
import typings.std.stdStrings.toggle
import typings.std.stdStrings.touchcancel
import typings.std.stdStrings.touchend
import typings.std.stdStrings.touchmove
import typings.std.stdStrings.touchstart
import typings.std.stdStrings.transitioncancel
import typings.std.stdStrings.transitionend
import typings.std.stdStrings.transitionrun
import typings.std.stdStrings.transitionstart
import typings.std.stdStrings.volumechange
import typings.std.stdStrings.waiting
import typings.std.stdStrings.webkitanimationend
import typings.std.stdStrings.webkitanimationiteration
import typings.std.stdStrings.webkitanimationstart
import typings.std.stdStrings.webkittransitionend
import typings.std.stdStrings.wheel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalEventHandlers extends StObject {
  
  /* standard dom */
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeinput(`type`: beforeinput, listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeinput(
    `type`: beforeinput,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeinput(
    `type`: beforeinput,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionend(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionend(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionend(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionstart(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionstart(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionstart(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionupdate(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionupdate(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionupdate(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ErrorEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ErrorEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ErrorEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_formdata(`type`: formdata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_formdata(
    `type`: formdata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_formdata(
    `type`: formdata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ProgressEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ProgressEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ProgressEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollend(
    `type`: scrollend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollend(
    `type`: scrollend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollend(
    `type`: scrollend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationend(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationend(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationend(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationiteration(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationiteration(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationiteration(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationstart(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationstart(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationstart(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkittransitionend(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkittransitionend(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkittransitionend(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.WheelEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.WheelEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.WheelEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Fires when the user aborts the download.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/abort_event)
    */
  /* standard dom */
  var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animationcancel_event) */
  /* standard dom */
  var onanimationcancel: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animationend_event) */
  /* standard dom */
  var onanimationend: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animationiteration_event) */
  /* standard dom */
  var onanimationiteration: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animationstart_event) */
  /* standard dom */
  var onanimationstart: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/auxclick_event) */
  /* standard dom */
  var onauxclick: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/beforeinput_event) */
  /* standard dom */
  var onbeforeinput: (js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any]) | Null = js.native
  
  /**
    * Fires when the object loses the input focus.
    * @param ev The focus event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/blur_event)
    */
  /* standard dom */
  var onblur: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/cancel_event) */
  /* standard dom */
  var oncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Occurs when playback is possible, but would require further buffering.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/canplay_event)
    */
  /* standard dom */
  var oncanplay: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/canplaythrough_event) */
  /* standard dom */
  var oncanplaythrough: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Fires when the contents of the object or selection have changed.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/change_event)
    */
  /* standard dom */
  var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Fires when the user clicks the left mouse button on the object
    * @param ev The mouse event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/click_event)
    */
  /* standard dom */
  var onclick: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/close_event) */
  /* standard dom */
  var onclose: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Fires when the user clicks the right mouse button in the client area, opening the context menu.
    * @param ev The mouse event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/contextmenu_event)
    */
  /* standard dom */
  var oncontextmenu: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/copy_event) */
  /* standard dom */
  var oncopy: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/cuechange_event) */
  /* standard dom */
  var oncuechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/cut_event) */
  /* standard dom */
  var oncut: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any]) | Null = js.native
  
  /**
    * Fires when the user double-clicks the object.
    * @param ev The mouse event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/dblclick_event)
    */
  /* standard dom */
  var ondblclick: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.native
  
  /**
    * Fires on the source object continuously during a drag operation.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/drag_event)
    */
  /* standard dom */
  var ondrag: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null = js.native
  
  /**
    * Fires on the source object when the user releases the mouse at the close of a drag operation.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragend_event)
    */
  /* standard dom */
  var ondragend: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null = js.native
  
  /**
    * Fires on the target element when the user drags the object to a valid drop target.
    * @param ev The drag event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragenter_event)
    */
  /* standard dom */
  var ondragenter: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null = js.native
  
  /**
    * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
    * @param ev The drag event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragleave_event)
    */
  /* standard dom */
  var ondragleave: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null = js.native
  
  /**
    * Fires on the target element continuously while the user drags the object over a valid drop target.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragover_event)
    */
  /* standard dom */
  var ondragover: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null = js.native
  
  /**
    * Fires on the source object when the user starts to drag a text selection or selected object.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragstart_event)
    */
  /* standard dom */
  var ondragstart: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/drop_event) */
  /* standard dom */
  var ondrop: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null = js.native
  
  /**
    * Occurs when the duration attribute is updated.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/durationchange_event)
    */
  /* standard dom */
  var ondurationchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Occurs when the media element is reset to its initial state.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/emptied_event)
    */
  /* standard dom */
  var onemptied: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Occurs when the end of playback is reached.
    * @param ev The event
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/ended_event)
    */
  /* standard dom */
  var onended: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Fires when an error occurs during object loading.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/error_event)
    */
  /* standard dom */
  var onerror: OnErrorEventHandler = js.native
  
  /**
    * Fires when the object receives focus.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/focus_event)
    */
  /* standard dom */
  var onfocus: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/formdata_event) */
  /* standard dom */
  var onformdata: (js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/gotpointercapture_event) */
  /* standard dom */
  var ongotpointercapture: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/input_event) */
  /* standard dom */
  var oninput: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/invalid_event) */
  /* standard dom */
  var oninvalid: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Fires when the user presses a key.
    * @param ev The keyboard event
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keydown_event)
    */
  /* standard dom */
  var onkeydown: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any]) | Null = js.native
  
  /**
    * Fires when the user presses an alphanumeric key.
    * @param ev The event.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keypress_event)
    */
  /* standard dom */
  var onkeypress: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any]) | Null = js.native
  
  /**
    * Fires when the user releases a key.
    * @param ev The keyboard event
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keyup_event)
    */
  /* standard dom */
  var onkeyup: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any]) | Null = js.native
  
  /**
    * Fires immediately after the browser loads the object.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/load_event)
    */
  /* standard dom */
  var onload: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Occurs when media data is loaded at the current playback position.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/loadeddata_event)
    */
  /* standard dom */
  var onloadeddata: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Occurs when the duration and dimensions of the media have been determined.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/loadedmetadata_event)
    */
  /* standard dom */
  var onloadedmetadata: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Occurs when Internet Explorer begins looking for media data.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/loadstart_event)
    */
  /* standard dom */
  var onloadstart: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/lostpointercapture_event) */
  /* standard dom */
  var onlostpointercapture: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.native
  
  /**
    * Fires when the user clicks the object with either mouse button.
    * @param ev The mouse event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mousedown_event)
    */
  /* standard dom */
  var onmousedown: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseenter_event) */
  /* standard dom */
  var onmouseenter: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseleave_event) */
  /* standard dom */
  var onmouseleave: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.native
  
  /**
    * Fires when the user moves the mouse over the object.
    * @param ev The mouse event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mousemove_event)
    */
  /* standard dom */
  var onmousemove: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.native
  
  /**
    * Fires when the user moves the mouse pointer outside the boundaries of the object.
    * @param ev The mouse event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseout_event)
    */
  /* standard dom */
  var onmouseout: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.native
  
  /**
    * Fires when the user moves the mouse pointer into the object.
    * @param ev The mouse event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseover_event)
    */
  /* standard dom */
  var onmouseover: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.native
  
  /**
    * Fires when the user releases a mouse button while the mouse is over the object.
    * @param ev The mouse event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseup_event)
    */
  /* standard dom */
  var onmouseup: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/paste_event) */
  /* standard dom */
  var onpaste: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any]) | Null = js.native
  
  /**
    * Occurs when playback is paused.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/pause_event)
    */
  /* standard dom */
  var onpause: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Occurs when the play method is requested.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/play_event)
    */
  /* standard dom */
  var onplay: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Occurs when the audio or video has started playing.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/playing_event)
    */
  /* standard dom */
  var onplaying: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointercancel_event) */
  /* standard dom */
  var onpointercancel: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerdown_event) */
  /* standard dom */
  var onpointerdown: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerenter_event) */
  /* standard dom */
  var onpointerenter: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerleave_event) */
  /* standard dom */
  var onpointerleave: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointermove_event) */
  /* standard dom */
  var onpointermove: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerout_event) */
  /* standard dom */
  var onpointerout: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerover_event) */
  /* standard dom */
  var onpointerover: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerup_event) */
  /* standard dom */
  var onpointerup: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.native
  
  /**
    * Occurs to indicate progress while downloading media data.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/progress_event)
    */
  /* standard dom */
  var onprogress: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ProgressEvent, Any]) | Null = js.native
  
  /**
    * Occurs when the playback rate is increased or decreased.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/ratechange_event)
    */
  /* standard dom */
  var onratechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Fires when the user resets a form.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/reset_event)
    */
  /* standard dom */
  var onreset: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/resize_event) */
  /* standard dom */
  var onresize: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any]) | Null = js.native
  
  /**
    * Fires when the user repositions the scroll box in the scroll bar on the object.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scroll_event)
    */
  /* standard dom */
  var onscroll: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scrollend_event) */
  /* standard dom */
  var onscrollend: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/securitypolicyviolation_event) */
  /* standard dom */
  var onsecuritypolicyviolation: (js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any]) | Null = js.native
  
  /**
    * Occurs when the seek operation ends.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/seeked_event)
    */
  /* standard dom */
  var onseeked: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Occurs when the current playback position is moved.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/seeking_event)
    */
  /* standard dom */
  var onseeking: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Fires when the current selection changes.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/select_event)
    */
  /* standard dom */
  var onselect: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/selectionchange_event) */
  /* standard dom */
  var onselectionchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/selectstart_event) */
  /* standard dom */
  var onselectstart: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement/slotchange_event) */
  /* standard dom */
  var onslotchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Occurs when the download has stopped.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/stalled_event)
    */
  /* standard dom */
  var onstalled: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/submit_event) */
  /* standard dom */
  var onsubmit: (js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any]) | Null = js.native
  
  /**
    * Occurs if the load operation has been intentionally halted.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/suspend_event)
    */
  /* standard dom */
  var onsuspend: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Occurs to indicate the current playback position.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/timeupdate_event)
    */
  /* standard dom */
  var ontimeupdate: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDetailsElement/toggle_event) */
  /* standard dom */
  var ontoggle: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchcancel_event) */
  /* standard dom */
  var ontouchcancel: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]) | Null
  ] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchend_event) */
  /* standard dom */
  var ontouchend: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]) | Null
  ] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchmove_event) */
  /* standard dom */
  var ontouchmove: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]) | Null
  ] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchstart_event) */
  /* standard dom */
  var ontouchstart: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]) | Null
  ] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/transitioncancel_event) */
  /* standard dom */
  var ontransitioncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/transitionend_event) */
  /* standard dom */
  var ontransitionend: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/transitionrun_event) */
  /* standard dom */
  var ontransitionrun: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/transitionstart_event) */
  /* standard dom */
  var ontransitionstart: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]) | Null = js.native
  
  /**
    * Occurs when the volume is changed, or playback is muted or unmuted.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/volumechange_event)
    */
  /* standard dom */
  var onvolumechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Occurs when playback stops because the next frame of a video resource is not available.
    * @param ev The event.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/waiting_event)
    */
  /* standard dom */
  var onwaiting: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * @deprecated This is a legacy alias of `onanimationend`.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animationend_event)
    */
  /* standard dom */
  var onwebkitanimationend: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * @deprecated This is a legacy alias of `onanimationiteration`.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animationiteration_event)
    */
  /* standard dom */
  var onwebkitanimationiteration: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * @deprecated This is a legacy alias of `onanimationstart`.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animationstart_event)
    */
  /* standard dom */
  var onwebkitanimationstart: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * @deprecated This is a legacy alias of `ontransitionend`.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/transitionend_event)
    */
  /* standard dom */
  var onwebkittransitionend: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/wheel_event) */
  /* standard dom */
  var onwheel: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.WheelEvent, Any]) | Null = js.native
  
  /* standard dom */
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeinput(`type`: beforeinput, listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeinput(
    `type`: beforeinput,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeinput(
    `type`: beforeinput,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionend(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionend(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionend(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionstart(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionstart(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionstart(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionupdate(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionupdate(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionupdate(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ErrorEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ErrorEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ErrorEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_formdata(`type`: formdata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_formdata(
    `type`: formdata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_formdata(
    `type`: formdata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ProgressEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ProgressEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ProgressEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scrollend(
    `type`: scrollend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scrollend(
    `type`: scrollend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scrollend(
    `type`: scrollend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationend(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationend(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationend(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationiteration(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationiteration(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationiteration(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationstart(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationstart(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationstart(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkittransitionend(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkittransitionend(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkittransitionend(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.WheelEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.WheelEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.WheelEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
}
