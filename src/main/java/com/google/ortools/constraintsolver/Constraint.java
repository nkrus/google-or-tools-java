/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class Constraint extends PropagationBaseObject {
  private transient long swigCPtr;

  protected Constraint(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.Constraint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Constraint obj) {
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
        mainJNI.delete_Constraint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void post() {
    mainJNI.Constraint_post(swigCPtr, this);
  }

  public void initialPropagate() {
    mainJNI.Constraint_initialPropagate(swigCPtr, this);
  }

  public String toString() {
    return mainJNI.Constraint_toString(swigCPtr, this);
  }

  public void postAndPropagate() {
    mainJNI.Constraint_postAndPropagate(swigCPtr, this);
  }

  public void accept(ModelVisitor visitor) {
    mainJNI.Constraint_accept(swigCPtr, this, ModelVisitor.getCPtr(visitor), visitor);
  }

  public boolean isCastConstraint() {
    return mainJNI.Constraint_isCastConstraint(swigCPtr, this);
  }

  public IntVar var() {
    long cPtr = mainJNI.Constraint_var(swigCPtr, this);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

}
