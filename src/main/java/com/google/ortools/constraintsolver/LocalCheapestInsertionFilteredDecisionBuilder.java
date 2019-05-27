/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class LocalCheapestInsertionFilteredDecisionBuilder extends CheapestInsertionFilteredDecisionBuilder {
  private transient long swigCPtr;

  protected LocalCheapestInsertionFilteredDecisionBuilder(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.LocalCheapestInsertionFilteredDecisionBuilder_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LocalCheapestInsertionFilteredDecisionBuilder obj) {
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
        mainJNI.delete_LocalCheapestInsertionFilteredDecisionBuilder(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean buildSolution() {
    return mainJNI.LocalCheapestInsertionFilteredDecisionBuilder_buildSolution(swigCPtr, this);
  }

  public String toString() {
    return mainJNI.LocalCheapestInsertionFilteredDecisionBuilder_toString(swigCPtr, this);
  }

}
