package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowEventMap
  extends StObject
     with GlobalEventHandlersEventMap
     with WindowEventHandlersEventMap {
  
  /* standard dom */
  var DOMContentLoaded: org.scalajs.dom.Event
  
  /* standard dom */
  var devicemotion: org.scalajs.dom.DeviceMotionEvent
  
  /* standard dom */
  var deviceorientation: org.scalajs.dom.DeviceOrientationEvent
  
  /* standard dom */
  var orientationchange: org.scalajs.dom.Event
}
object WindowEventMap {
  
  inline def apply(
    DOMContentLoaded: org.scalajs.dom.Event,
    abort: org.scalajs.dom.UIEvent,
    afterprint: org.scalajs.dom.Event,
    animationcancel: org.scalajs.dom.AnimationEvent,
    animationend: org.scalajs.dom.AnimationEvent,
    animationiteration: org.scalajs.dom.AnimationEvent,
    animationstart: org.scalajs.dom.AnimationEvent,
    auxclick: org.scalajs.dom.MouseEvent,
    beforeinput: InputEvent,
    beforeprint: org.scalajs.dom.Event,
    beforeunload: org.scalajs.dom.BeforeUnloadEvent,
    blur: org.scalajs.dom.FocusEvent,
    cancel: org.scalajs.dom.Event,
    canplay: org.scalajs.dom.Event,
    canplaythrough: org.scalajs.dom.Event,
    change: org.scalajs.dom.Event,
    click: org.scalajs.dom.MouseEvent,
    close: org.scalajs.dom.Event,
    compositionend: org.scalajs.dom.CompositionEvent,
    compositionstart: org.scalajs.dom.CompositionEvent,
    compositionupdate: org.scalajs.dom.CompositionEvent,
    contextmenu: org.scalajs.dom.MouseEvent,
    copy: org.scalajs.dom.ClipboardEvent,
    cuechange: org.scalajs.dom.Event,
    cut: org.scalajs.dom.ClipboardEvent,
    dblclick: org.scalajs.dom.MouseEvent,
    devicemotion: org.scalajs.dom.DeviceMotionEvent,
    deviceorientation: org.scalajs.dom.DeviceOrientationEvent,
    drag: org.scalajs.dom.DragEvent,
    dragend: org.scalajs.dom.DragEvent,
    dragenter: org.scalajs.dom.DragEvent,
    dragleave: org.scalajs.dom.DragEvent,
    dragover: org.scalajs.dom.DragEvent,
    dragstart: org.scalajs.dom.DragEvent,
    drop: org.scalajs.dom.DragEvent,
    durationchange: org.scalajs.dom.Event,
    emptied: org.scalajs.dom.Event,
    ended: org.scalajs.dom.Event,
    error: org.scalajs.dom.ErrorEvent,
    focus: org.scalajs.dom.FocusEvent,
    focusin: org.scalajs.dom.FocusEvent,
    focusout: org.scalajs.dom.FocusEvent,
    formdata: FormDataEvent,
    gamepadconnected: org.scalajs.dom.GamepadEvent,
    gamepaddisconnected: org.scalajs.dom.GamepadEvent,
    gotpointercapture: org.scalajs.dom.PointerEvent,
    hashchange: org.scalajs.dom.HashChangeEvent,
    input: org.scalajs.dom.Event,
    invalid: org.scalajs.dom.Event,
    keydown: org.scalajs.dom.KeyboardEvent,
    keypress: org.scalajs.dom.KeyboardEvent,
    keyup: org.scalajs.dom.KeyboardEvent,
    languagechange: org.scalajs.dom.Event,
    load: org.scalajs.dom.Event,
    loadeddata: org.scalajs.dom.Event,
    loadedmetadata: org.scalajs.dom.Event,
    loadstart: org.scalajs.dom.Event,
    lostpointercapture: org.scalajs.dom.PointerEvent,
    message: org.scalajs.dom.MessageEvent,
    messageerror: org.scalajs.dom.MessageEvent,
    mousedown: org.scalajs.dom.MouseEvent,
    mouseenter: org.scalajs.dom.MouseEvent,
    mouseleave: org.scalajs.dom.MouseEvent,
    mousemove: org.scalajs.dom.MouseEvent,
    mouseout: org.scalajs.dom.MouseEvent,
    mouseover: org.scalajs.dom.MouseEvent,
    mouseup: org.scalajs.dom.MouseEvent,
    offline: org.scalajs.dom.Event,
    online: org.scalajs.dom.Event,
    orientationchange: org.scalajs.dom.Event,
    pagehide: PageTransitionEvent,
    pageshow: PageTransitionEvent,
    paste: org.scalajs.dom.ClipboardEvent,
    pause: org.scalajs.dom.Event,
    play: org.scalajs.dom.Event,
    playing: org.scalajs.dom.Event,
    pointercancel: org.scalajs.dom.PointerEvent,
    pointerdown: org.scalajs.dom.PointerEvent,
    pointerenter: org.scalajs.dom.PointerEvent,
    pointerleave: org.scalajs.dom.PointerEvent,
    pointermove: org.scalajs.dom.PointerEvent,
    pointerout: org.scalajs.dom.PointerEvent,
    pointerover: org.scalajs.dom.PointerEvent,
    pointerup: org.scalajs.dom.PointerEvent,
    popstate: org.scalajs.dom.PopStateEvent,
    progress: org.scalajs.dom.ProgressEvent,
    ratechange: org.scalajs.dom.Event,
    rejectionhandled: PromiseRejectionEvent,
    reset: org.scalajs.dom.Event,
    resize: org.scalajs.dom.UIEvent,
    scroll: org.scalajs.dom.Event,
    scrollend: org.scalajs.dom.Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: org.scalajs.dom.Event,
    seeking: org.scalajs.dom.Event,
    select: org.scalajs.dom.Event,
    selectionchange: org.scalajs.dom.Event,
    selectstart: org.scalajs.dom.Event,
    slotchange: org.scalajs.dom.Event,
    stalled: org.scalajs.dom.Event,
    storage: org.scalajs.dom.StorageEvent,
    submit: SubmitEvent,
    suspend: org.scalajs.dom.Event,
    timeupdate: org.scalajs.dom.Event,
    toggle: org.scalajs.dom.Event,
    touchcancel: org.scalajs.dom.TouchEvent,
    touchend: org.scalajs.dom.TouchEvent,
    touchmove: org.scalajs.dom.TouchEvent,
    touchstart: org.scalajs.dom.TouchEvent,
    transitioncancel: org.scalajs.dom.TransitionEvent,
    transitionend: org.scalajs.dom.TransitionEvent,
    transitionrun: org.scalajs.dom.TransitionEvent,
    transitionstart: org.scalajs.dom.TransitionEvent,
    unhandledrejection: PromiseRejectionEvent,
    unload: org.scalajs.dom.Event,
    volumechange: org.scalajs.dom.Event,
    waiting: org.scalajs.dom.Event,
    webkitanimationend: org.scalajs.dom.Event,
    webkitanimationiteration: org.scalajs.dom.Event,
    webkitanimationstart: org.scalajs.dom.Event,
    webkittransitionend: org.scalajs.dom.Event,
    wheel: org.scalajs.dom.WheelEvent
  ): WindowEventMap = {
    val __obj = js.Dynamic.literal(DOMContentLoaded = DOMContentLoaded.asInstanceOf[js.Any], abort = abort.asInstanceOf[js.Any], afterprint = afterprint.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], beforeprint = beforeprint.asInstanceOf[js.Any], beforeunload = beforeunload.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], devicemotion = devicemotion.asInstanceOf[js.Any], deviceorientation = deviceorientation.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], gamepadconnected = gamepadconnected.asInstanceOf[js.Any], gamepaddisconnected = gamepaddisconnected.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], hashchange = hashchange.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], languagechange = languagechange.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], orientationchange = orientationchange.asInstanceOf[js.Any], pagehide = pagehide.asInstanceOf[js.Any], pageshow = pageshow.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], popstate = popstate.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], rejectionhandled = rejectionhandled.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollend = scrollend.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], unhandledrejection = unhandledrejection.asInstanceOf[js.Any], unload = unload.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowEventMap] (val x: Self) extends AnyVal {
    
    inline def setDOMContentLoaded(value: org.scalajs.dom.Event): Self = StObject.set(x, "DOMContentLoaded", value.asInstanceOf[js.Any])
    
    inline def setDevicemotion(value: org.scalajs.dom.DeviceMotionEvent): Self = StObject.set(x, "devicemotion", value.asInstanceOf[js.Any])
    
    inline def setDeviceorientation(value: org.scalajs.dom.DeviceOrientationEvent): Self = StObject.set(x, "deviceorientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationchange(value: org.scalajs.dom.Event): Self = StObject.set(x, "orientationchange", value.asInstanceOf[js.Any])
  }
}
