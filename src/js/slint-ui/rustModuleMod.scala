//> using target.platform js

package typings.slintUi

import org.scalajs.dom.ImageData
import typings.slintUi.anon.DictK
import typings.slintUi.slintUiInts.`0`
import typings.slintUi.slintUiInts.`1`
import typings.slintUi.slintUiInts.`2`
import typings.slintUi.slintUiInts.`3`
import typings.slintUi.slintUiInts.`4`
import typings.slintUi.slintUiInts.`5`
import typings.slintUi.slintUiInts.`6`
import typings.slintUi.slintUiInts.`7`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rustModuleMod {
  
  @JSImport("slint-ui/rust-module", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("slint-ui/rust-module", "ComponentCompiler")
  @js.native
  /** Returns a new ComponentCompiler. */
  open class ComponentCompiler () extends StObject {
    
    /**
      * Compile a .slint file into a ComponentDefinition
      *
      * Returns the compiled `ComponentDefinition` if there were no errors.
      */
    def buildFromPath(path: String): JsComponentDefinition | Null = js.native
    
    /** Compile some .slint code into a ComponentDefinition */
    def buildFromSource(sourceCode: String, path: String): JsComponentDefinition | Null = js.native
    
    def diagnostics: js.Array[Diagnostic] = js.native
    
    def includePaths: js.Array[String] = js.native
    def includePaths_=(includePaths: js.Array[String]): Unit = js.native
    
    def libraryPaths: Record[String, String] = js.native
    def libraryPaths_=(paths: Record[String, String]): Unit = js.native
    
    def style: String | Null = js.native
    def style_=(style: String): Unit = js.native
  }
  
  @JSImport("slint-ui/rust-module", "ComponentDefinition")
  @js.native
  open class ComponentDefinition () extends StObject {
    
    def callbacks: js.Array[String] = js.native
    
    def create(): JsComponentInstance | Null = js.native
    
    def globalCallbacks(globalName: String): js.Array[String] | Null = js.native
    
    def globalProperties(globalName: String): js.Array[JsProperty] | Null = js.native
    
    def globals: js.Array[String] = js.native
    
    def name: String = js.native
    
    def properties: js.Array[JsProperty] = js.native
  }
  
  @JSImport("slint-ui/rust-module", "ComponentInstance")
  @js.native
  open class ComponentInstance () extends StObject {
    
    def definition(): ComponentDefinition = js.native
    
    def getGlobalProperty(globalName: String, name: String): Any = js.native
    
    def getProperty(name: String): Any = js.native
    
    def invoke(callbackName: String, arguments: js.Array[Any]): Any = js.native
    
    def invokeGlobal(globalName: String, callbackName: String, arguments: js.Array[Any]): Any = js.native
    
    def sendKeyboardStringSequence(sequence: String): Unit = js.native
    
    def sendMouseClick(x: Double, y: Double): Unit = js.native
    
    def setCallback(callbackName: String, callback: js.Function1[/* repeated */ Any, Any]): Unit = js.native
    
    def setGlobalCallback(globalName: String, callbackName: String, callback: js.Function1[/* repeated */ Any, Any]): Unit = js.native
    
    def setGlobalProperty(globalName: String, propName: String, jsValue: Any): Unit = js.native
    
    def setProperty(propName: String, jsValue: Any): Unit = js.native
    
    def window(): JsWindow = js.native
  }
  
  @JSImport("slint-ui/rust-module", "ExternalObject")
  @js.native
  open class ExternalObject[T] () extends StObject {
    
    @JSName("")
    val _empty: DictK[T] = js.native
  }
  
  @JSImport("slint-ui/rust-module", "Property")
  @js.native
  open class Property () extends StObject {
    
    var name: String = js.native
    
    var valueType: ValueType = js.native
  }
  
  @JSImport("slint-ui/rust-module", "SlintBrush")
  @js.native
  open class SlintBrush protected () extends StObject {
    def this(color: RgbaColor) = this()
    
    /**
      * Returns a new version of this brush that has the brightness increased
      * by the specified factor. This is done by calling [`Color::brighter`] on
      * all the colors of this brush.
      */
    def brighter(factor: Double): SlintBrush = js.native
    
    /** @hidden */
    def brush: ExternalObject[Brush] = js.native
    
    def color: RgbaColor = js.native
    
    /**
      * Returns a new version of this brush that has the brightness decreased
      * by the specified factor. This is done by calling [`Color::darker`] on
      * all the color of this brush.
      */
    def darker(factor: Double): SlintBrush = js.native
    
    /** Returns true if this brush is fully opaque. */
    def isOpaque: Boolean = js.native
    
    /** Returns true if this brush contains a fully transparent color (alpha value is zero) */
    def isTransparent: Boolean = js.native
    
    /** @hidden */
    def slintColor: SlintRgbaColor = js.native
    
    /**
      * Returns a new version of this brush with the opacity decreased by `factor`.
      *
      * The transparency is obtained by multiplying the alpha channel by `(1 - factor)`.
      */
    def transparentize(amount: Double): SlintBrush = js.native
    
    /**
      * Returns a new version of this brush with the related color's opacities
      * set to `alpha`.
      */
    def withAlpha(alpha: Double): SlintBrush = js.native
  }
  /* static members */
  object SlintBrush {
    
    @JSImport("slint-ui/rust-module", "SlintBrush")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromBrush(brush: Brush): SlintBrush = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBrush")(brush.asInstanceOf[js.Any]).asInstanceOf[SlintBrush]
  }
  
  @JSImport("slint-ui/rust-module", "SlintImageData")
  @js.native
  open class SlintImageData protected () extends StObject {
    /**
      * Constructs a new image with the given width and height.
      * Each pixel will set to red = 0, green = 0, blue = 0 and alpha = 0.
      */
    def this(width: Double, height: Double) = this()
    
    /**
      * Returns the image as buffer.
      * A Buffer is a subclass of Uint8Array.
      */
    def data: Any = js.native
    
    /** Returns the height of the image in pixels. */
    def height: Double = js.native
    
    /** @hidden */
    def image: ExternalObject[ImageData] = js.native
    
    def path: Any = js.native
    
    /** Returns the width of the image in pixels. */
    def width: Double = js.native
  }
  
  @JSImport("slint-ui/rust-module", "SlintModelNotify")
  @js.native
  open class SlintModelNotify () extends StObject {
    
    def reset(): Unit = js.native
    
    def rowAdded(row: Double, count: Double): Unit = js.native
    
    def rowDataChanged(row: Double): Unit = js.native
    
    def rowRemoved(row: Double, count: Double): Unit = js.native
  }
  
  @JSImport("slint-ui/rust-module", "SlintPoint")
  @js.native
  open class SlintPoint protected () extends StObject {
    /** Constructs new point from x and y. */
    def this(x: Double, y: Double) = this()
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  
  @JSImport("slint-ui/rust-module", "SlintRgbaColor")
  @js.native
  /** Creates a new transparent color. */
  open class SlintRgbaColor () extends StObject {
    
    /** Returns the alpha channel of the color as number in the range 0..255. */
    def alpha: Double = js.native
    
    /** Returns the blue channel of the color as number in the range 0..255. */
    def blue: Double = js.native
    
    /**
      * by the specified factor. This is done by converting the color to the HSV
      * color space and multiplying the brightness (value) with (1 + factor).
      * The result is converted back to RGB and the alpha channel is unchanged.
      * So for example `brighter(0.2)` will increase the brightness by 20%, and
      * calling `brighter(-0.5)` will return a color that's 50% darker.
      */
    def brighter(factor: Double): SlintRgbaColor = js.native
    
    /**
      * Returns a new version of this color that has the brightness decreased
      * by the specified factor. This is done by converting the color to the HSV
      * color space and dividing the brightness (value) by (1 + factor). The
      * result is converted back to RGB and the alpha channel is unchanged.
      * So for example `darker(0.3)` will decrease the brightness by 30%.
      */
    def darker(factor: Double): SlintRgbaColor = js.native
    
    /** Returns the green channel of the color as number in the range 0..255. */
    def green: Double = js.native
    
    /**
      * Returns a new color that is a mix of `self` and `other`, with a proportion
      * factor given by `factor` (which will be clamped to be between `0.0` and `1.0`).
      */
    def mix(other: SlintRgbaColor, factor: Double): SlintRgbaColor = js.native
    
    /** Returns the red channel of the color as number in the range 0..255. */
    def red: Double = js.native
    
    /**
      * Returns a new version of this color with the opacity decreased by `factor`.
      *
      * The transparency is obtained by multiplying the alpha channel by `(1 - factor)`.
      */
    def transparentize(amount: Double): SlintRgbaColor = js.native
    
    /** Returns a new version of this color with the opacity set to `alpha`. */
    def withAlpha(alpha: Double): SlintRgbaColor = js.native
  }
  /* static members */
  object SlintRgbaColor {
    
    @JSImport("slint-ui/rust-module", "SlintRgbaColor")
    @js.native
    val ^ : js.Any = js.native
    
    /** Construct a color from the alpha, red, green and blue color channel parameters. */
    inline def fromArgb(alpha: Double, red: Double, green: Double, blue: Double): SlintRgbaColor = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArgb")(alpha.asInstanceOf[js.Any], red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[SlintRgbaColor]
    
    /**
      * Construct a color from the red, green and blue color channel parameters. The alpha
      * channel will have the value 255.
      */
    inline def fromRgb(red: Double, green: Double, blue: Double): SlintRgbaColor = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRgb")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[SlintRgbaColor]
  }
  
  @JSImport("slint-ui/rust-module", "SlintSize")
  @js.native
  open class SlintSize protected () extends StObject {
    /** Constructs a size from the given width and height. */
    def this(width: Double, height: Double) = this()
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  
  @JSImport("slint-ui/rust-module", "Window")
  @js.native
  /** @hidden */
  open class Window () extends StObject {
    
    /** Set or unset the window to display fullscreen. */
    def fullscreen_=(enable: Boolean): Unit = js.native
    
    /** Hides the window, so that it is not visible anymore. */
    def hide(): Unit = js.native
    
    /** Returns the logical position of the window on the screen. */
    def logicalPosition: SlintPoint = js.native
    /** Sets the logical position of the window on the screen. */
    def logicalPosition_=(position: SlintPoint): Unit = js.native
    
    /** Returns the logical size of the window on the screen, */
    def logicalSize: SlintSize = js.native
    /** Sets the logical size of the window on the screen, */
    def logicalSize_=(size: SlintSize): Unit = js.native
    
    /** Returns the physical position of the window on the screen. */
    def physicalPosition: SlintPoint = js.native
    /** Sets the physical position of the window on the screen. */
    def physicalPosition_=(position: SlintPoint): Unit = js.native
    
    /** Returns the physical size of the window on the screen, */
    def physicalSize: SlintSize = js.native
    /** Sets the logical size of the window on the screen, */
    def physicalSize_=(size: SlintSize): Unit = js.native
    
    /** Issues a request to the windowing system to re-render the contents of the window. */
    def requestRedraw(): Unit = js.native
    
    /**
      * Shows the window on the screen. An additional strong reference on the
      * associated component is maintained while the window is visible.
      */
    def show(): Unit = js.native
    
    /**
      * Returns the visibility state of the window. This function can return false even if you previously called show()
      * on it, for example if the user minimized the window.
      */
    def visible: Boolean = js.native
  }
  
  inline def getMockedTime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMockedTime")().asInstanceOf[Double]
  
  inline def invokeFromEventLoop(callback: js.Function1[/* repeated */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invokeFromEventLoop")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def mockElapsedTime(ms: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mockElapsedTime")(ms.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def processEvents(): ProcessEventsResult = ^.asInstanceOf[js.Dynamic].applyDynamic("processEvents")().asInstanceOf[ProcessEventsResult]
  
  inline def setQuitOnLastWindowClosed(quitOnLastWindowClosed: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setQuitOnLastWindowClosed")(quitOnLastWindowClosed.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Brush extends StObject {
    
    /**
      * Defines a solid color brush from rgba.
      *
      * If no color is set it defaults to transparent.
      */
    var color: js.UndefOr[RgbaColor] = js.undefined
  }
  object Brush {
    
    inline def apply(): Brush = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Brush]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Brush] (val x: Self) extends AnyVal {
      
      inline def setColor(value: RgbaColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  trait Diagnostic extends StObject {
    
    var columnNumber: Double
    
    /** The path of the source file where this diagnostic occurred. */
    var fileName: js.UndefOr[String] = js.undefined
    
    /** The level for this diagnostic. */
    var level: DiagnosticLevel
    
    /** The line number in the .slint source file. The line number starts with 1. */
    var lineNumber: Double
    
    /** Message for this diagnostic. */
    var message: String
  }
  object Diagnostic {
    
    inline def apply(columnNumber: Double, level: DiagnosticLevel, lineNumber: Double, message: String): Diagnostic = {
      val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Diagnostic]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Diagnostic] (val x: Self) extends AnyVal {
      
      inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setLevel(value: DiagnosticLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.slintUi.slintUiInts.`0`
    - typings.slintUi.slintUiInts.`1`
  */
  trait DiagnosticLevel extends StObject
  object DiagnosticLevel {
    
    /** The diagnostic found is an error that prevents successful compilation. */
    inline def Error: `0` = 0.asInstanceOf[`0`]
    
    /** The diagnostic found is a warning. */
    inline def Warning: `1` = 1.asInstanceOf[`1`]
  }
  
  type JsComponentCompiler = ComponentCompiler
  
  type JsComponentDefinition = ComponentDefinition
  
  type JsComponentInstance = ComponentInstance
  
  type JsProperty = Property
  
  type JsSlintModelNotify = SlintModelNotify
  
  type JsWindow = Window
  
  /* Rewritten from type alias, can be one of: 
    - typings.slintUi.slintUiInts.`0`
    - typings.slintUi.slintUiInts.`1`
  */
  trait ProcessEventsResult extends StObject
  object ProcessEventsResult {
    
    inline def Continue: `0` = 0.asInstanceOf[`0`]
    
    inline def Exited: `1` = 1.asInstanceOf[`1`]
  }
  
  trait RgbaColor extends StObject {
    
    /** Represents the alpha channel of the color as u8 in the range 0..255. */
    var alpha: js.UndefOr[Double] = js.undefined
    
    /** Represents the blue channel of the color as u8 in the range 0..255. */
    var blue: Double
    
    /** Represents the green channel of the color as u8 in the range 0..255. */
    var green: Double
    
    /** Represents the red channel of the color as u8 in the range 0..255. */
    var red: Double
  }
  object RgbaColor {
    
    inline def apply(blue: Double, green: Double, red: Double): RgbaColor = {
      val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[RgbaColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RgbaColor] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.slintUi.slintUiInts.`0`
    - typings.slintUi.slintUiInts.`1`
    - typings.slintUi.slintUiInts.`2`
    - typings.slintUi.slintUiInts.`3`
    - typings.slintUi.slintUiInts.`4`
    - typings.slintUi.slintUiInts.`5`
    - typings.slintUi.slintUiInts.`6`
    - typings.slintUi.slintUiInts.`7`
  */
  trait ValueType extends StObject
  object ValueType {
    
    inline def Bool: `3` = 3.asInstanceOf[`3`]
    
    inline def Brush: `6` = 6.asInstanceOf[`6`]
    
    inline def Image: `7` = 7.asInstanceOf[`7`]
    
    inline def Model: `4` = 4.asInstanceOf[`4`]
    
    inline def Number: `1` = 1.asInstanceOf[`1`]
    
    inline def String: `2` = 2.asInstanceOf[`2`]
    
    inline def Struct: `5` = 5.asInstanceOf[`5`]
    
    inline def Void: `0` = 0.asInstanceOf[`0`]
  }
}
