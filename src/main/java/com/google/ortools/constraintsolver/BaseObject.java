/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class BaseObject {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BaseObject(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BaseObject obj) {
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
        mainJNI.delete_BaseObject(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BaseObject() {
    this(mainJNI.new_BaseObject(), true);
  }

  public String toString() {
    return mainJNI.BaseObject_toString(swigCPtr, this);
  }

}
