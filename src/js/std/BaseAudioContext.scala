package typings.std

import typings.std.stdStrings.statechange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext) */
@js.native
trait BaseAudioContext
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Available only in secure contexts.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/audioWorklet)
    */
  /* standard dom */
  val audioWorklet: AudioWorklet = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createAnalyser) */
  /* standard dom */
  def createAnalyser(): org.scalajs.dom.AnalyserNode = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createBiquadFilter) */
  /* standard dom */
  def createBiquadFilter(): org.scalajs.dom.BiquadFilterNode = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createBuffer) */
  /* standard dom */
  def createBuffer(numberOfChannels: Double, length: Double, sampleRate: Double): org.scalajs.dom.AudioBuffer = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createBufferSource) */
  /* standard dom */
  def createBufferSource(): org.scalajs.dom.AudioBufferSourceNode = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createChannelMerger) */
  /* standard dom */
  def createChannelMerger(): org.scalajs.dom.ChannelMergerNode = js.native
  def createChannelMerger(numberOfInputs: Double): org.scalajs.dom.ChannelMergerNode = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createChannelSplitter) */
  /* standard dom */
  def createChannelSplitter(): org.scalajs.dom.ChannelSplitterNode = js.native
  def createChannelSplitter(numberOfOutputs: Double): org.scalajs.dom.ChannelSplitterNode = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createConstantSource) */
  /* standard dom */
  def createConstantSource(): ConstantSourceNode = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createConvolver) */
  /* standard dom */
  def createConvolver(): org.scalajs.dom.ConvolverNode = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createDelay) */
  /* standard dom */
  def createDelay(): org.scalajs.dom.DelayNode = js.native
  def createDelay(maxDelayTime: Double): org.scalajs.dom.DelayNode = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createDynamicsCompressor) */
  /* standard dom */
  def createDynamicsCompressor(): org.scalajs.dom.DynamicsCompressorNode = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createGain) */
  /* standard dom */
  def createGain(): org.scalajs.dom.GainNode = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createIIRFilter) */
  /* standard dom */
  def createIIRFilter(feedforward: js.Array[Double], feedback: js.Array[Double]): IIRFilterNode = js.native
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createIIRFilter) */
  /* standard dom.iterable */
  def createIIRFilter(feedforward: js.Iterable[Double], feedback: js.Iterable[Double]): IIRFilterNode = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createOscillator) */
  /* standard dom */
  def createOscillator(): org.scalajs.dom.OscillatorNode = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createPanner) */
  /* standard dom */
  def createPanner(): org.scalajs.dom.PannerNode = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createPeriodicWave) */
  /* standard dom */
  def createPeriodicWave(real: js.Array[Double], imag: js.Array[Double]): org.scalajs.dom.PeriodicWave = js.native
  def createPeriodicWave(real: js.Array[Double], imag: js.Array[Double], constraints: PeriodicWaveConstraints): org.scalajs.dom.PeriodicWave = js.native
  def createPeriodicWave(real: js.Array[Double], imag: js.typedarray.Float32Array): org.scalajs.dom.PeriodicWave = js.native
  def createPeriodicWave(real: js.Array[Double], imag: js.typedarray.Float32Array, constraints: PeriodicWaveConstraints): org.scalajs.dom.PeriodicWave = js.native
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createPeriodicWave) */
  /* standard dom.iterable */
  def createPeriodicWave(real: js.Iterable[Double], imag: js.Iterable[Double]): org.scalajs.dom.PeriodicWave = js.native
  def createPeriodicWave(real: js.Iterable[Double], imag: js.Iterable[Double], constraints: PeriodicWaveConstraints): org.scalajs.dom.PeriodicWave = js.native
  def createPeriodicWave(real: js.typedarray.Float32Array, imag: js.Array[Double]): org.scalajs.dom.PeriodicWave = js.native
  def createPeriodicWave(real: js.typedarray.Float32Array, imag: js.Array[Double], constraints: PeriodicWaveConstraints): org.scalajs.dom.PeriodicWave = js.native
  def createPeriodicWave(real: js.typedarray.Float32Array, imag: js.typedarray.Float32Array): org.scalajs.dom.PeriodicWave = js.native
  def createPeriodicWave(
    real: js.typedarray.Float32Array,
    imag: js.typedarray.Float32Array,
    constraints: PeriodicWaveConstraints
  ): org.scalajs.dom.PeriodicWave = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createScriptProcessor)
    */
  /* standard dom */
  def createScriptProcessor(): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double, numberOfInputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double, numberOfInputChannels: Double, numberOfOutputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double, numberOfInputChannels: Unit, numberOfOutputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Unit, numberOfInputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Unit, numberOfInputChannels: Double, numberOfOutputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Unit, numberOfInputChannels: Unit, numberOfOutputChannels: Double): ScriptProcessorNode = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createStereoPanner) */
  /* standard dom */
  def createStereoPanner(): org.scalajs.dom.StereoPannerNode = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createWaveShaper) */
  /* standard dom */
  def createWaveShaper(): org.scalajs.dom.WaveShaperNode = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/currentTime) */
  /* standard dom */
  val currentTime: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/decodeAudioData) */
  /* standard dom */
  def decodeAudioData(audioData: js.typedarray.ArrayBuffer): js.Promise[org.scalajs.dom.AudioBuffer] = js.native
  def decodeAudioData(audioData: js.typedarray.ArrayBuffer, successCallback: Null, errorCallback: DecodeErrorCallback): js.Promise[org.scalajs.dom.AudioBuffer] = js.native
  def decodeAudioData(audioData: js.typedarray.ArrayBuffer, successCallback: Unit, errorCallback: DecodeErrorCallback): js.Promise[org.scalajs.dom.AudioBuffer] = js.native
  def decodeAudioData(audioData: js.typedarray.ArrayBuffer, successCallback: DecodeSuccessCallback): js.Promise[org.scalajs.dom.AudioBuffer] = js.native
  def decodeAudioData(
    audioData: js.typedarray.ArrayBuffer,
    successCallback: DecodeSuccessCallback,
    errorCallback: DecodeErrorCallback
  ): js.Promise[org.scalajs.dom.AudioBuffer] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/destination) */
  /* standard dom */
  val destination: org.scalajs.dom.AudioDestinationNode = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/listener) */
  /* standard dom */
  val listener: org.scalajs.dom.AudioListener = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/statechange_event) */
  /* standard dom */
  var onstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/sampleRate) */
  /* standard dom */
  val sampleRate: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/state) */
  /* standard dom */
  val state: AudioContextState = js.native
}
