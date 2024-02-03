//> using target.platform js

package typings.slintUi

import typings.slintUi.anon.QuitOnLastWindowClosed
import typings.std.Error
import typings.std.IterableIterator
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("slint-ui", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("slint-ui", "ArrayModel")
  @js.native
  open class ArrayModel[T] protected () extends Model[T] {
    /**
      * Creates a new ArrayModel.
      *
      * @param arr
      */
    def this(arr: js.Array[T]) = this()
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array.
      */
    def entries(): IterableIterator[js.Tuple2[Double, T]] = js.native
    
    /**
      * Returns the number of entries in the array model.
      */
    def length: Double = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Pushes new values to the array that's backing the model and notifies
      * the run-time about the added rows.
      * @param values list of values that will be pushed to the array.
      */
    def push(values: T*): Unit = js.native
    
    /**
      * Removes the specified number of element from the array that's backing
      * the model, starting at the specified index.
      * @param index index of first row to remove.
      * @param size number of rows to remove.
      */
    def remove(index: Double, size: Double): Unit = js.native
    
    /**
      * Returns an iterable of values in the array.
      */
    def values(): IterableIterator[T] = js.native
  }
  
  @JSImport("slint-ui", "CompileError")
  @js.native
  open class CompileError protected ()
    extends StObject
       with Error {
    /**
      * Creates a new CompileError.
      *
      * @param message human-readable description of the error.
      * @param diagnostics represent a list of diagnostic items emitted while compiling .slint code.
      */
    def this(
      message: String,
      diagnostics: js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify napi.Diagnostic */ Any
          ]
    ) = this()
    
    /**
      * List of {@link Diagnostic} items emitted while compiling .slint code.
      */
    var diagnostics: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify napi.Diagnostic */ Any
      ] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /* note: abstract class */ @JSImport("slint-ui", "Model")
  @js.native
  open class Model[T] () extends StObject {
    
    /**
      * Notifies the view that the complete data must be reload.
      */
    /* protected */ def notifyReset(): Unit = js.native
    
    /**
      * Notifies the view that multiple rows are added to the model.
      * @param row index of the first added row.
      * @param count the number of added items.
      */
    /* protected */ def notifyRowAdded(row: Double, count: Double): Unit = js.native
    
    /**
      * Notifies the view that the data of the current row is changed.
      * @param row index of the changed row.
      */
    /* protected */ def notifyRowDataChanged(row: Double): Unit = js.native
    
    /**
      * Notifies the view that multiple rows are removed to the model.
      * @param row index of the first removed row.
      * @param count the number of removed items.
      */
    /* protected */ def notifyRowRemoved(row: Double, count: Double): Unit = js.native
    
    /**
      * @hidden
      */
    @JSName("notify")
    var notify_FModel: NullPeer = js.native
    
    /**
      * Implementations of this function must return the current number of rows.
      */
    def rowCount(): Double = js.native
    
    /**
      * Implementations of this function must return the data at the specified row.
      * @param row index in range 0..(rowCount() - 1).
      * @returns undefined if row is out of range otherwise the data.
      */
    def rowData(row: Double): js.UndefOr[T] = js.native
    
    /**
      * Implementations of this function must store the provided data parameter
      * in the model at the specified row.
      * @param _row index in range 0..(rowCount() - 1).
      * @param _data new data item to store on the given row index
      */
    def setRowData(_row: Double, _data: T): Unit = js.native
  }
  
  inline def loadFile(filePath: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def loadFile(filePath: String, options: LoadFileOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFile")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def loadSource(source: String, filePath: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSource")(source.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def loadSource(source: String, filePath: String, options: LoadFileOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSource")(source.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  object privateApi {
    
    @JSImport("slint-ui", "private_api")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Provides rows that are generated by a map function based on the rows of another Model.
      *
      * @template T item type of source model that is mapped to U.
      * @template U the type of the mapped items
      *
      * ## Example
      *
      *  Here we have a {@link ArrayModel} holding rows of a custom interface `Name` and a {@link MapModel} that maps the name rows
      *  to single string rows.
      *
      * ```ts
      * import { Model, ArrayModel, MapModel } from "./index";
      *
      * interface Name {
      *     first: string;
      *     last: string;
      * }
      *
      * const model = new ArrayModel<Name>([
      *     {
      *         first: "Hans",
      *         last: "Emil",
      *     },
      *     {
      *         first: "Max",
      *         last: "Mustermann",
      *     },
      *     {
      *         first: "Roman",
      *         last: "Tisch",
      *     },
      * ]);
      *
      * const mappedModel = new MapModel(
      *     model,
      *     (data) => {
      *         return data.last + ", " + data.first;
      *     }
      * );
      *
      * // prints "Emil, Hans"
      * console.log(mappedModel.rowData(0));
      *
      * // prints "Mustermann, Max"
      * console.log(mappedModel.rowData(1));
      *
      * // prints "Tisch, Roman"
      * console.log(mappedModel.rowData(2));
      *
      * // Alternatively you can use the shortcut {@link MapModel.map}.
      *
      * const model = new ArrayModel<Name>([
      *     {
      *         first: "Hans",
      *         last: "Emil",
      *     },
      *     {
      *         first: "Max",
      *         last: "Mustermann",
      *     },
      *     {
      *         first: "Roman",
      *         last: "Tisch",
      *     },
      * ]);
      *
      * const mappedModel = model.map(
      *     (data) => {
      *         return data.last + ", " + data.first;
      *     }
      * );
      *
      *
      * // prints "Emil, Hans"
      * console.log(mappedModel.rowData(0));
      *
      * // prints "Mustermann, Max"
      * console.log(mappedModel.rowData(1));
      *
      * // prints "Tisch, Roman"
      * console.log(mappedModel.rowData(2));
      *
      * // You can modifying the underlying {@link ArrayModel}:
      *
      * const model = new ArrayModel<Name>([
      *     {
      *         first: "Hans",
      *         last: "Emil",
      *     },
      *     {
      *         first: "Max",
      *         last: "Mustermann",
      *     },
      *     {
      *         first: "Roman",
      *         last: "Tisch",
      *     },
      * ]);
      *
      * const mappedModel = model.map(
      *     (data) => {
      *         return data.last + ", " + data.first;
      *     }
      * );
      *
      * model.setRowData(1, { first: "Minnie", last: "Musterfrau" } );
      *
      * // prints "Emil, Hans"
      * console.log(mappedModel.rowData(0));
      *
      * // prints "Musterfrau, Minnie"
      * console.log(mappedModel.rowData(1));
      *
      * // prints "Tisch, Roman"
      * console.log(mappedModel.rowData(2));
      * ```
      */
    @JSImport("slint-ui", "private_api.MapModel")
    @js.native
    open class MapModel[T, U] protected () extends Model[U] {
      /**
        * Constructs the MapModel with a source model and map functions.
        * @template T item type of source model that is mapped to U.
        * @template U the type of the mapped items.
        * @param sourceModel the wrapped model.
        * @param mapFunction maps the data from T to U.
        */
      def this(sourceModel: Model[T], mapFunction: js.Function1[/* data */ T, U]) = this()
      
      /* private */ var `private`: Any = js.native
      
      val sourceModel: Model[T] = js.native
    }
    
    inline def sendKeyboardStringSequence(component: Component, s: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send_keyboard_string_sequence")(component.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendMouseClick(component: Component, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send_mouse_click")(component.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def quitEventLoop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("quitEventLoop")().asInstanceOf[Unit]
  
  inline def runEventLoop(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("runEventLoop")().asInstanceOf[js.Promise[Any]]
  inline def runEventLoop(args: js.Function): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("runEventLoop")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def runEventLoop(args: QuitOnLastWindowClosed): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("runEventLoop")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  /**
    * @hidden
    */
  @js.native
  trait Component
    extends StObject
       with ComponentHandle {
    
    /**
      * @hidden
      */
    def component_instance: Any = js.native
    
    /* private */ var `private`: Any = js.native
  }
  
  @js.native
  trait ComponentHandle extends StObject {
    
    /**
      * Hides the component's window, so that it is not visible anymore.
      */
    def hide(): Any = js.native
    
    /**
      * Shows the window and runs the event loop. The returned promise is resolved when the event loop
      * is terminated, for example when the last window was closed, or {@link quitEventLoop} was called.
      *
      * This function is a convenience for calling {@link show}, followed by {@link runEventLoop}, and
      * {@link hide} when the event loop's promise is resolved.
      */
    def run(): js.Promise[Any] = js.native
    
    /**
      * Shows the component's window on the screen.
      */
    def show(): Any = js.native
    
    /**
      * Returns the {@link Window} associated with this component instance.
      * The window API can be used to control different aspects of the integration into the windowing system, such as the position on the screen.
      */
    def window: Window = js.native
  }
  
  @js.native
  trait ImageData extends StObject {
    
    /**
      *  Returns the image as buffer.
      */
    def data: js.typedarray.Uint8Array = js.native
    
    /**
      *  Returns the height of the image in pixels.
      */
    def height: Double = js.native
    
    /**
      * Returns the path of the image, if it was loaded from disk. Otherwise
      * the property is undefined.
      */
    val path: js.UndefOr[String] = js.native
    
    /**
      * Returns the width of the image in pixels.
      */
    def width: Double = js.native
  }
  
  trait LoadFileOptions extends StObject {
    
    /**
      * Sets the include paths used for looking up `.slint` imports to the specified vector of paths.
      */
    var includePaths: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Sets library paths used for looking up `@library` imports to the specified map of library names to paths.
      */
    var libraryPaths: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * If set to true warnings from the compiler will not be printed to the console.
      */
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets the widget style the compiler is currently using when compiling .slint files.
      */
    var style: js.UndefOr[String] = js.undefined
  }
  object LoadFileOptions {
    
    inline def apply(): LoadFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadFileOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadFileOptions] (val x: Self) extends AnyVal {
      
      inline def setIncludePaths(value: js.Array[String]): Self = StObject.set(x, "includePaths", value.asInstanceOf[js.Any])
      
      inline def setIncludePathsUndefined: Self = StObject.set(x, "includePaths", js.undefined)
      
      inline def setIncludePathsVarargs(value: String*): Self = StObject.set(x, "includePaths", js.Array(value*))
      
      inline def setLibraryPaths(value: Record[String, String]): Self = StObject.set(x, "libraryPaths", value.asInstanceOf[js.Any])
      
      inline def setLibraryPathsUndefined: Self = StObject.set(x, "libraryPaths", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /**
    * @hidden
    */
  trait NullPeer extends StObject {
    
    def reset(): Unit
    
    def rowAdded(row: Double, count: Double): Unit
    
    def rowDataChanged(row: Double): Unit
    
    def rowRemoved(row: Double, count: Double): Unit
  }
  object NullPeer {
    
    inline def apply(
      reset: () => Unit,
      rowAdded: (Double, Double) => Unit,
      rowDataChanged: Double => Unit,
      rowRemoved: (Double, Double) => Unit
    ): NullPeer = {
      val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), rowAdded = js.Any.fromFunction2(rowAdded), rowDataChanged = js.Any.fromFunction1(rowDataChanged), rowRemoved = js.Any.fromFunction2(rowRemoved))
      __obj.asInstanceOf[NullPeer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NullPeer] (val x: Self) extends AnyVal {
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setRowAdded(value: (Double, Double) => Unit): Self = StObject.set(x, "rowAdded", js.Any.fromFunction2(value))
      
      inline def setRowDataChanged(value: Double => Unit): Self = StObject.set(x, "rowDataChanged", js.Any.fromFunction1(value))
      
      inline def setRowRemoved(value: (Double, Double) => Unit): Self = StObject.set(x, "rowRemoved", js.Any.fromFunction2(value))
    }
  }
  
  trait Point extends StObject {
    
    /**
      * Defines the x coordinate of the point.
      */
    var x: Double
    
    /**
      * Defines the y coordinate of the point.
      */
    var y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Size extends StObject {
    
    /**
      * Defines the height length of the size.
      */
    var height: Double
    
    /**
      * Defines the width length of the size.
      */
    var width: Double
  }
  object Size {
    
    inline def apply(height: Double, width: Double): Size = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Window extends StObject {
    
    /** Set or unset the window to display fullscreen. */
    def fullscreen_=(enable: Boolean): Unit = js.native
    
    /** Hides the window, so that it is not visible anymore. */
    def hide(): Unit = js.native
    
    /** Gets or sets the logical position of the window on the screen. */
    var logicalPosition: Point = js.native
    
    /** Gets or sets the logical size of the window on the screen, */
    var logicalSize: Size = js.native
    
    /** Gets or sets the physical position of the window on the screen. */
    var physicalPosition: Point = js.native
    
    /** Gets or sets the physical size of the window on the screen, */
    var physicalSize: Size = js.native
    
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
}
