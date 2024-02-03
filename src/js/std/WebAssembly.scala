package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebAssembly {
  
  type CompileError = js.Error
  
  /* Rewritten from type alias, can be one of: 
    - js.Function
    - typings.std.WebAssembly.Global[typings.std.WebAssembly.ValueType]
    - typings.std.WebAssembly.Memory
    - typings.std.WebAssembly.Table
  */
  type ExportValue = _ExportValue | Global[ValueType] | js.Function
  
  type Exports = Record[java.lang.String, ExportValue]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Global) */
  trait Global[T /* <: ValueType */] extends StObject {
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Global/value) */
    /* standard dom */
    var value: /* import warning: importer.ImportType#apply Failed type conversion: std.WebAssembly.ValueTypeMap[T] */ js.Any
  }
  object Global {
    
    inline def apply[T /* <: ValueType */](
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.WebAssembly.ValueTypeMap[T] */ js.Any
    ): Global[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Global[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Global[?], T /* <: ValueType */] (val x: Self & Global[T]) extends AnyVal {
      
      inline def setValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.WebAssembly.ValueTypeMap[T] */ js.Any
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait GlobalDescriptor[T /* <: ValueType */] extends StObject {
    
    /* standard dom */
    var mutable: js.UndefOr[scala.Boolean] = js.undefined
    
    /* standard dom */
    var value: T
  }
  object GlobalDescriptor {
    
    inline def apply[T /* <: ValueType */](value: T): GlobalDescriptor[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalDescriptor[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobalDescriptor[?], T /* <: ValueType */] (val x: Self & GlobalDescriptor[T]) extends AnyVal {
      
      inline def setMutable(value: scala.Boolean): Self = StObject.set(x, "mutable", value.asInstanceOf[js.Any])
      
      inline def setMutableUndefined: Self = StObject.set(x, "mutable", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.std.stdStrings.function
    - typings.std.stdStrings.global
    - typings.std.stdStrings.memory
    - typings.std.stdStrings.table
  */
  trait ImportExportKind extends StObject
  object ImportExportKind {
    
    inline def function: typings.std.stdStrings.function = "function".asInstanceOf[typings.std.stdStrings.function]
    
    inline def global: typings.std.stdStrings.global = "global".asInstanceOf[typings.std.stdStrings.global]
    
    inline def memory: typings.std.stdStrings.memory = "memory".asInstanceOf[typings.std.stdStrings.memory]
    
    inline def table: typings.std.stdStrings.table = "table".asInstanceOf[typings.std.stdStrings.table]
  }
  
  type ImportValue = ExportValue | Double
  
  type Imports = Record[java.lang.String, ModuleImports]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Instance) */
  trait Instance extends StObject {
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Instance/exports) */
    /* standard dom */
    val exports: Exports
  }
  object Instance {
    
    inline def apply(exports: Exports): Instance = {
      val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
      
      inline def setExports(value: Exports): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    }
  }
  
  type LinkError = js.Error
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Memory) */
  trait Memory
    extends StObject
       with _ExportValue {
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Memory/buffer) */
    /* standard dom */
    val buffer: js.typedarray.ArrayBuffer
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Memory/grow) */
    /* standard dom */
    def grow(delta: Double): Double
  }
  object Memory {
    
    inline def apply(buffer: js.typedarray.ArrayBuffer, grow: Double => Double): Memory = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], grow = js.Any.fromFunction1(grow))
      __obj.asInstanceOf[Memory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Memory] (val x: Self) extends AnyVal {
      
      inline def setBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setGrow(value: Double => Double): Self = StObject.set(x, "grow", js.Any.fromFunction1(value))
    }
  }
  
  trait MemoryDescriptor extends StObject {
    
    /* standard dom */
    var initial: Double
    
    /* standard dom */
    var maximum: js.UndefOr[Double] = js.undefined
    
    /* standard dom */
    var shared: js.UndefOr[scala.Boolean] = js.undefined
  }
  object MemoryDescriptor {
    
    inline def apply(initial: Double): MemoryDescriptor = {
      val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemoryDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MemoryDescriptor] (val x: Self) extends AnyVal {
      
      inline def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      inline def setShared(value: scala.Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
      
      inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    }
  }
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Module) */
  trait Module extends StObject
  
  trait ModuleExportDescriptor extends StObject {
    
    /* standard dom */
    var kind: ImportExportKind
    
    /* standard dom */
    var name: java.lang.String
  }
  object ModuleExportDescriptor {
    
    inline def apply(kind: ImportExportKind, name: java.lang.String): ModuleExportDescriptor = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleExportDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModuleExportDescriptor] (val x: Self) extends AnyVal {
      
      inline def setKind(value: ImportExportKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModuleImportDescriptor extends StObject {
    
    /* standard dom */
    var kind: ImportExportKind
    
    /* standard dom */
    var module: java.lang.String
    
    /* standard dom */
    var name: java.lang.String
  }
  object ModuleImportDescriptor {
    
    inline def apply(kind: ImportExportKind, module: java.lang.String, name: java.lang.String): ModuleImportDescriptor = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleImportDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModuleImportDescriptor] (val x: Self) extends AnyVal {
      
      inline def setKind(value: ImportExportKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setModule(value: java.lang.String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ModuleImports = Record[java.lang.String, ImportValue]
  
  type RuntimeError = js.Error
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Table) */
  @js.native
  trait Table
    extends StObject
       with _ExportValue {
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Table/get) */
    /* standard dom */
    def get(index: Double): Any = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Table/grow) */
    /* standard dom */
    def grow(delta: Double): Double = js.native
    def grow(delta: Double, value: Any): Double = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Table/length) */
    /* standard dom */
    val length: Double = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Table/set) */
    /* standard dom */
    def set(index: Double): Unit = js.native
    def set(index: Double, value: Any): Unit = js.native
  }
  
  trait TableDescriptor extends StObject {
    
    /* standard dom */
    var element: TableKind
    
    /* standard dom */
    var initial: Double
    
    /* standard dom */
    var maximum: js.UndefOr[Double] = js.undefined
  }
  object TableDescriptor {
    
    inline def apply(element: TableKind, initial: Double): TableDescriptor = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableDescriptor] (val x: Self) extends AnyVal {
      
      inline def setElement(value: TableKind): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.std.stdStrings.anyfunc
    - typings.std.stdStrings.externref
  */
  trait TableKind extends StObject
  object TableKind {
    
    inline def anyfunc: typings.std.stdStrings.anyfunc = "anyfunc".asInstanceOf[typings.std.stdStrings.anyfunc]
    
    inline def externref: typings.std.stdStrings.externref = "externref".asInstanceOf[typings.std.stdStrings.externref]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.std.stdStrings.anyfunc
    - typings.std.stdStrings.externref
    - typings.std.stdStrings.f32
    - typings.std.stdStrings.f64
    - typings.std.stdStrings.i32
    - typings.std.stdStrings.i64
    - typings.std.stdStrings.v128
  */
  trait ValueType extends StObject
  
  trait ValueTypeMap extends StObject {
    
    /* standard dom */
    var anyfunc: js.Function
    
    /* standard dom */
    var externref: Any
    
    /* standard dom */
    var f32: Double
    
    /* standard dom */
    var f64: Double
    
    /* standard dom */
    var i32: Double
    
    /* standard dom */
    var i64: js.BigInt
  }
  object ValueTypeMap {
    
    inline def apply(anyfunc: js.Function, externref: Any, f32: Double, f64: Double, i32: Double, i64: js.BigInt): ValueTypeMap = {
      val __obj = js.Dynamic.literal(anyfunc = anyfunc.asInstanceOf[js.Any], externref = externref.asInstanceOf[js.Any], f32 = f32.asInstanceOf[js.Any], f64 = f64.asInstanceOf[js.Any], i32 = i32.asInstanceOf[js.Any], i64 = i64.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueTypeMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueTypeMap] (val x: Self) extends AnyVal {
      
      inline def setAnyfunc(value: js.Function): Self = StObject.set(x, "anyfunc", value.asInstanceOf[js.Any])
      
      inline def setExternref(value: Any): Self = StObject.set(x, "externref", value.asInstanceOf[js.Any])
      
      inline def setF32(value: Double): Self = StObject.set(x, "f32", value.asInstanceOf[js.Any])
      
      inline def setF64(value: Double): Self = StObject.set(x, "f64", value.asInstanceOf[js.Any])
      
      inline def setI32(value: Double): Self = StObject.set(x, "i32", value.asInstanceOf[js.Any])
      
      inline def setI64(value: js.BigInt): Self = StObject.set(x, "i64", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebAssemblyInstantiatedSource extends StObject {
    
    /* standard dom */
    var instance: Instance
    
    /* standard dom */
    var module: Module
  }
  object WebAssemblyInstantiatedSource {
    
    inline def apply(instance: Instance, module: Module): WebAssemblyInstantiatedSource = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAssemblyInstantiatedSource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebAssemblyInstantiatedSource] (val x: Self) extends AnyVal {
      
      inline def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setModule(value: Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    }
  }
  
  trait _ExportValue extends StObject
}
