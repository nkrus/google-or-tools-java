/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class IntVarElement extends AssignmentElement {
  private transient long swigCPtr;

  protected IntVarElement(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.IntVarElement_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IntVarElement obj) {
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
        mainJNI.delete_IntVarElement(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public IntVarElement() {
    this(mainJNI.new_IntVarElement__SWIG_0(), true);
  }

  public IntVarElement(IntVar var) {
    this(mainJNI.new_IntVarElement__SWIG_1(IntVar.getCPtr(var), var), true);
  }

  public void reset(IntVar var) {
    mainJNI.IntVarElement_reset(swigCPtr, this, IntVar.getCPtr(var), var);
  }

  public IntVarElement clone() {
    long cPtr = mainJNI.IntVarElement_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new IntVarElement(cPtr, false);
  }

  public void copy(IntVarElement element) {
    mainJNI.IntVarElement_copy(swigCPtr, this, IntVarElement.getCPtr(element), element);
  }

  public IntVar var() {
    long cPtr = mainJNI.IntVarElement_var(swigCPtr, this);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

  public void store() {
    mainJNI.IntVarElement_store(swigCPtr, this);
  }

  public void restore() {
    mainJNI.IntVarElement_restore(swigCPtr, this);
  }

  public long min() {
    return mainJNI.IntVarElement_min(swigCPtr, this);
  }

  public void setMin(long m) {
    mainJNI.IntVarElement_setMin(swigCPtr, this, m);
  }

  public long max() {
    return mainJNI.IntVarElement_max(swigCPtr, this);
  }

  public void setMax(long m) {
    mainJNI.IntVarElement_setMax(swigCPtr, this, m);
  }

  public long value() {
    return mainJNI.IntVarElement_value(swigCPtr, this);
  }

  public boolean bound() {
    return mainJNI.IntVarElement_bound(swigCPtr, this);
  }

  public void setRange(long l, long u) {
    mainJNI.IntVarElement_setRange(swigCPtr, this, l, u);
  }

  public void setValue(long v) {
    mainJNI.IntVarElement_setValue(swigCPtr, this, v);
  }

  public String toString() {
    return mainJNI.IntVarElement_toString(swigCPtr, this);
  }

}
