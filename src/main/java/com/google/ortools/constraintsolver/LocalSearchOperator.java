/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class LocalSearchOperator extends BaseObject {
  private transient long swigCPtr;

  protected LocalSearchOperator(long cPtr, boolean cMemoryOwn) {
    super(operations_research_constraint_solverJNI.LocalSearchOperator_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LocalSearchOperator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        operations_research_constraint_solverJNI.delete_LocalSearchOperator(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    operations_research_constraint_solverJNI.LocalSearchOperator_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    operations_research_constraint_solverJNI.LocalSearchOperator_change_ownership(this, swigCPtr, true);
  }

  public LocalSearchOperator() {
    this(operations_research_constraint_solverJNI.new_LocalSearchOperator(), true);
    operations_research_constraint_solverJNI.LocalSearchOperator_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public boolean nextNeighbor(Assignment delta, Assignment deltadelta) {
    return operations_research_constraint_solverJNI.LocalSearchOperator_nextNeighbor(swigCPtr, this, Assignment.getCPtr(delta), delta, Assignment.getCPtr(deltadelta), deltadelta);
  }

  public void start(Assignment assignment) {
    operations_research_constraint_solverJNI.LocalSearchOperator_start(swigCPtr, this, Assignment.getCPtr(assignment), assignment);
  }

}