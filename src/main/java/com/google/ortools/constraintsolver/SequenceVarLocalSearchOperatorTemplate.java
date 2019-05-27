/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class SequenceVarLocalSearchOperatorTemplate extends LocalSearchOperator {
  private transient long swigCPtr;

  protected SequenceVarLocalSearchOperatorTemplate(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.SequenceVarLocalSearchOperatorTemplate_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SequenceVarLocalSearchOperatorTemplate obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_SequenceVarLocalSearchOperatorTemplate(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean isIncremental() {
    return mainJNI.SequenceVarLocalSearchOperatorTemplate_isIncremental(swigCPtr, this);
  }

  public int size() {
    return mainJNI.SequenceVarLocalSearchOperatorTemplate_size(swigCPtr, this);
  }

  public int[] value(long index) {
  return mainJNI.SequenceVarLocalSearchOperatorTemplate_value(swigCPtr, this, index);
}

  public SequenceVar var(long index) {
    long cPtr = mainJNI.SequenceVarLocalSearchOperatorTemplate_var(swigCPtr, this, index);
    return (cPtr == 0) ? null : new SequenceVar(cPtr, false);
  }

  public int[] oldValue(long index) {
  return mainJNI.SequenceVarLocalSearchOperatorTemplate_oldValue(swigCPtr, this, index);
}

  public void setValue(long index, int[] value) {
    mainJNI.SequenceVarLocalSearchOperatorTemplate_setValue(swigCPtr, this, index, value);
  }

  public boolean activated(long index) {
    return mainJNI.SequenceVarLocalSearchOperatorTemplate_activated(swigCPtr, this, index);
  }

  public void activate(long index) {
    mainJNI.SequenceVarLocalSearchOperatorTemplate_activate(swigCPtr, this, index);
  }

  public void deactivate(long index) {
    mainJNI.SequenceVarLocalSearchOperatorTemplate_deactivate(swigCPtr, this, index);
  }

  public void addVars(SequenceVar[] vars) {
    mainJNI.SequenceVarLocalSearchOperatorTemplate_addVars(swigCPtr, this, vars);
  }

  public void onStart() {
    mainJNI.SequenceVarLocalSearchOperatorTemplate_onStart(swigCPtr, this);
  }

}
