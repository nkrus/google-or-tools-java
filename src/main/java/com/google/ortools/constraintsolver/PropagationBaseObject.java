/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class PropagationBaseObject extends BaseObject {
  private transient long swigCPtr;

  protected PropagationBaseObject(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.PropagationBaseObject_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PropagationBaseObject obj) {
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
        mainJNI.delete_PropagationBaseObject(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PropagationBaseObject(Solver s) {
    this(mainJNI.new_PropagationBaseObject(Solver.getCPtr(s), s), true);
  }

  public String toString() {
    return mainJNI.PropagationBaseObject_toString(swigCPtr, this);
  }

  public Solver solver() {
    long cPtr = mainJNI.PropagationBaseObject_solver(swigCPtr, this);
    return (cPtr == 0) ? null : new Solver(cPtr, false);
  }

  public void freezeQueue() {
    mainJNI.PropagationBaseObject_freezeQueue(swigCPtr, this);
  }

  public void unfreezeQueue() {
    mainJNI.PropagationBaseObject_unfreezeQueue(swigCPtr, this);
  }

  public void enqueueDelayedDemon(Demon d) {
    mainJNI.PropagationBaseObject_enqueueDelayedDemon(swigCPtr, this, Demon.getCPtr(d), d);
  }

  public void enqueueVar(Demon d) {
    mainJNI.PropagationBaseObject_enqueueVar(swigCPtr, this, Demon.getCPtr(d), d);
  }

  public void reset_action_on_fail() {
    mainJNI.PropagationBaseObject_reset_action_on_fail(swigCPtr, this);
  }

  public void set_variable_to_clean_on_fail(IntVar v) {
    mainJNI.PropagationBaseObject_set_variable_to_clean_on_fail(swigCPtr, this, IntVar.getCPtr(v), v);
  }

  public String name() {
    return mainJNI.PropagationBaseObject_name(swigCPtr, this);
  }

  public void setName(String name) {
    mainJNI.PropagationBaseObject_setName(swigCPtr, this, name);
  }

  public boolean hasName() {
    return mainJNI.PropagationBaseObject_hasName(swigCPtr, this);
  }

  public String baseName() {
    return mainJNI.PropagationBaseObject_baseName(swigCPtr, this);
  }

}
