/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class EvaluatorCheapestAdditionFilteredDecisionBuilder extends CheapestAdditionFilteredDecisionBuilder {
  private transient long swigCPtr;

  protected EvaluatorCheapestAdditionFilteredDecisionBuilder(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.EvaluatorCheapestAdditionFilteredDecisionBuilder_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EvaluatorCheapestAdditionFilteredDecisionBuilder obj) {
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
        mainJNI.delete_EvaluatorCheapestAdditionFilteredDecisionBuilder(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public String toString() {
    return mainJNI.EvaluatorCheapestAdditionFilteredDecisionBuilder_toString(swigCPtr, this);
  }

}
